package fz.fxq.casecore.service;

import fz.fxq.casecore.vo.LoginReqVO;

public interface LoginService {

    public long loginRedis(LoginReqVO loginReqVO);

    public long loginOracle(LoginReqVO loginReqVO);

    public long loginMybatis(LoginReqVO loginReqVO);
}
