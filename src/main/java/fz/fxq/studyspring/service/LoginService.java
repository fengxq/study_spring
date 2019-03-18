package fz.fxq.studyspring.service;

import fz.fxq.studyspring.vo.LoginReqVO;

public interface LoginService {

    public long loginRedis(LoginReqVO loginReqVO);

    public long loginOracle(LoginReqVO loginReqVO);

    public long loginMybatis(LoginReqVO loginReqVO);
}
