package fz.fxq.casecore.service.impl;

import fz.fxq.casecore.dao.LoginDAO;
import fz.fxq.casecore.mapper.LoginMapper;
import fz.fxq.casecore.po.UserPO;
import fz.fxq.casecore.service.LoginService;
import fz.fxq.casecore.vo.LoginReqVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    LoginDAO loginDAO;
    @Autowired
    LoginMapper loginMapper;

    @Override
    public long loginRedis(LoginReqVO loginReqVO) {
        logger.debug("loginRedis");
        long ret = -1;

        String userId = loginReqVO.getUserId();
        String userIdRedis = stringRedisTemplate.opsForValue().get(userId);
        if (StringUtils.isEmpty(userIdRedis)) {
            stringRedisTemplate.opsForValue().set(userId, System.currentTimeMillis() + "");
        }
        String sessionId = stringRedisTemplate.opsForValue().get(userId);

        logger.info("StringRedisTemplate,userId[" + userId + "]sessionId[" + sessionId + "]");
        return ret;
    }

    @Override
    public long loginOracle(LoginReqVO loginReqVO) {
        logger.debug("loginOracle");
        long ret = -1;

        List<UserPO> userPOList = loginDAO.getUserPOList();
        logger.info("userPOList,size[" + userPOList.size() + "]");

        String userId = loginReqVO.getUserId();
        UserPO userPO = loginDAO.getUserPO(userId);

        logger.info("userPO,UserName[" + userPO.getUserName() + "]");
        return ret;
    }

    @Override
    public long loginMybatis(LoginReqVO loginReqVO) {
        logger.debug("loginMybatis");
        long ret = -1;

        List<UserPO> userPOList = loginMapper.getUserPOList();
        logger.info("userPOList,size[" + userPOList.size() + "]");

        String userId = loginReqVO.getUserId();
        UserPO userPO = loginMapper.getUserPO(userId);

        logger.info("userPO,UserName[" + userPO.getUserName() + "]");

        return ret;
    }
}
