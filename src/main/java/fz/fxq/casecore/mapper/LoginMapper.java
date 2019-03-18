package fz.fxq.casecore.mapper;

import fz.fxq.casecore.po.UserPO;

import java.util.List;

public interface LoginMapper {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
