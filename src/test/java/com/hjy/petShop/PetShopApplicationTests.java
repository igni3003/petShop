package com.hjy.petShop;

import com.hjy.petShop.mapper.UserMapper;
import com.hjy.petShop.vo.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class PetShopApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void userMapperInsertTest() {
		UserVo userVo = new UserVo();
		userVo.setId("wodud2101");
		userVo.setPassword("a@rkddj124");
		userVo.setAddress("대구");
		userVo.setEmail("gjwodud@naver.com");
		userVo.setName("허재영");
		userVo.setPhone("010-0000-0000");
		try {
			String birth = "1993-08-05";
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date birthDate = sdFormat.parse(birth);
			userVo.setBirth(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userMapper.insertUser(userVo);
	}

	@Test
	void userMapperUpdateTest() {
		UserVo userVo = userMapper.getUserById("wodud2101");
		userVo.setPassword("12345123");
		userVo.setName("유용재씹년");
		userVo.setEmail("sadlsajdl@naver.com");
		userMapper.updateUser(userVo);
	}

	@Test
	void userMapperDeleteTest() {
		userMapper.deleteUser("wodud2101");
	}
}
