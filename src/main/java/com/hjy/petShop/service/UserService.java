package com.hjy.petShop.service;

import com.hjy.petShop.mapper.UserMapper;
import com.hjy.petShop.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    /**
     * 회원 정보 리스트
     * @return: 회원 정보
     */
    public List<UserVo> getUserList() {
        return userMapper.getUserList();
    }

    public UserVo getUserById(String id) {
        return userMapper.getUserById(id);
    }

    public UserVo getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    public void signup(UserVo userVo) {
        userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
        userMapper.insertUser(userVo);
    }

    public void edit(UserVo userVo) { // 회원 정보 수정
        userVo.setPassword(passwordEncoder.encode(userVo.getPassword()));
        userMapper.updateUser(userVo);
    }

    public void withdraw(String id) {
        userMapper.deleteUser(id);
    }

    public PasswordEncoder passwordEncoder() {
        return this.passwordEncoder;
    }

    public UserVo getRecommend(String recommend) {
        return userMapper.getUserRecommend(recommend);
    }
}
