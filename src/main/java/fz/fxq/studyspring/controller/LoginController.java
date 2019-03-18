package fz.fxq.studyspring.controller;

import fz.fxq.studyspring.service.LoginService;
import fz.fxq.studyspring.vo.LoginPropertiesVO;
import fz.fxq.studyspring.vo.LoginReqVO;
import fz.fxq.studyspring.vo.LoginResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login/")
@Api("用户登录")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 登录次数
     */
    @Value("${loginTimes}")
    private String loginTimes;

    @Autowired
    LoginService loginService;
    @Autowired
    LoginPropertiesVO loginPropertiesVO;

    @PostMapping("submit/redis")
    @ApiOperation("提交Redis")
    public LoginResultVO loginRedis(@RequestBody LoginReqVO loginReqVO) {
        logger.info("loginRedis,loginReqVO[" + loginReqVO + "]");
        LoginResultVO loginResultVO = new LoginResultVO();

        loginService.loginRedis(loginReqVO);

        loginResultVO.setCode(0);
        loginResultVO.setMsg("success");


        logger.info("loginTimes[" + loginTimes + "]");
        logger.info("loginPropertiesVO.loginTimes[" + loginPropertiesVO.getLoginTimes() + "]");

        return loginResultVO;
    }

    @PostMapping("submit/oracle")
    @ApiOperation("提交Oracle")
    public LoginResultVO loginOracle(@RequestBody LoginReqVO loginReqVO) {
        logger.info("loginOracle,loginReqVO[" + loginReqVO + "]");
        LoginResultVO loginResultVO = new LoginResultVO();

        loginService.loginOracle(loginReqVO);

        loginResultVO.setCode(0);
        loginResultVO.setMsg("success");

        return loginResultVO;
    }

    @PostMapping("submit/mybatis")
    @ApiOperation("提交Mybatis")
    public LoginResultVO loginMybatis(@RequestBody LoginReqVO loginReqVO) {
        logger.info("loginMybatis,loginReqVO[" + loginReqVO + "]");
        LoginResultVO loginResultVO = new LoginResultVO();

        loginService.loginMybatis(loginReqVO);

        loginResultVO.setCode(0);
        loginResultVO.setMsg("success");

        return loginResultVO;
    }
}