package fz.fxq.boot.service;

import fz.fxq.boot.vo.LoginReqVO;

public interface LoginService {

    public long loginRedis(LoginReqVO loginReqVO);

    public long loginOracle(LoginReqVO loginReqVO);

    public long loginMybatis(LoginReqVO loginReqVO);
}
