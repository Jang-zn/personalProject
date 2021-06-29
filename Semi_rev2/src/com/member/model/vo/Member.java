package com.member.model.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private String memberId;
	private String memberPw;
	private String email;
	private String name;
	private String nickname;
	private Date birth;
	private String phone;
	private double height;
	private double weight;
	private String gender;
	private Date enrollDate;
	private String profileImg;
}
