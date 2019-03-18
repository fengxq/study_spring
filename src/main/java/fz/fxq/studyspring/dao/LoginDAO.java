package fz.fxq.studyspring.dao;

import fz.fxq.studyspring.po.UserPO;

import java.util.List;

public interface LoginDAO {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
