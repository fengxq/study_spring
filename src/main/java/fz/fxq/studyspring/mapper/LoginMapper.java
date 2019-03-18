package fz.fxq.studyspring.mapper;

import fz.fxq.studyspring.po.UserPO;

import java.util.List;

public interface LoginMapper {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
