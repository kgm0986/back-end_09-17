package com.springboot.web220230914gyumin.web.controller.dto.board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
    public String title;
    private int usercode;
    private String content;
}
