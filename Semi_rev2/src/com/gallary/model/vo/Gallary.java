package com.gallary.model.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Gallary {
	private int galNo;
	private Date gallaryDate;
	private String memberId;
	private String writer;
	private String content;
	private String imgName;
}
