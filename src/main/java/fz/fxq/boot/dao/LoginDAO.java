package fz.fxq.boot.dao;

import fz.fxq.boot.po.UserPO;

import java.util.List;

public interface LoginDAO {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
