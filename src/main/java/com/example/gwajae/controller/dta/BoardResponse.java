package com.example.gwajae.controller.dta;

import com.example.gwajae.domain.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardResponse {
    private Long id;
    private String title;
    private String content;

    public BoardResponse(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
