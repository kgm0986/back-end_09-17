package com.springboot.web220230914gyumin.web.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResDto {
    private String username;
    private String password;
    private String name;
    private String email;
}
