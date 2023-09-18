package com.springboot.web220230914gyumin.web.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestRespDto {

    private  String username;
    private String password;
}
