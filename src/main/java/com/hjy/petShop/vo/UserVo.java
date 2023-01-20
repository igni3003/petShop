package com.hjy.petShop.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {

    private String id;

    private String password;

    private String name;

    private String phone;

    private String address;

    private String recommend;

    private String email;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birth;

}
