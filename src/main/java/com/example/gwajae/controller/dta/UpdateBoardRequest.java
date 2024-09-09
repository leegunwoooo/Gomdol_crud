package com.example.gwajae.controller.dta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UpdateBoardRequest {
    private Long id;
    private String title;
    private String content;
}
