package com.board.model.vo;

import java.util.*;

import lombok.*;

@Data
public class Reply {
	private int replyNo;
	private int contentNo;
	private String writer;
	private String replyContent;
	private Date replyDate;
	private int replyLevel;
	private int replyNoRef;	
}
