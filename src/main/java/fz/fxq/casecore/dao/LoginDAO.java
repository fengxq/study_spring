package fz.fxq.casecore.dao;

import fz.fxq.casecore.po.UserPO;

import java.util.List;

public interface LoginDAO {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
