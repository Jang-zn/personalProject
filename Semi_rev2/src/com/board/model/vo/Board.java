package com.board.model.vo;

import java.util.*;

import lombok.*;

@Data
public class Board {
	private int contentNo;
	private String title;
	private String category;
	private String content;
	private String writer;
	private int readCount;
	private Date writeDate;
	private String memberId;
		
}
