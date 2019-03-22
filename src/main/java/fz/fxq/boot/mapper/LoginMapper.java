package fz.fxq.boot.mapper;

import fz.fxq.boot.po.UserPO;

import java.util.List;

public interface LoginMapper {
    public List<UserPO> getUserPOList();

    public UserPO getUserPO(String userId);
}
