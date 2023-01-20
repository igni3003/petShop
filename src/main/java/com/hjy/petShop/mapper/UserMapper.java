package com.hjy.petShop.mapper;

import com.hjy.petShop.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserVo> getUserList();
    UserVo getUserById(String id);
    UserVo getUserByEmail(String email);
    UserVo getUserRecommend(String recommend);
    void insertUser(UserVo userVo);
    void updateUser(UserVo userVo);
    void deleteUser(String id);
}
