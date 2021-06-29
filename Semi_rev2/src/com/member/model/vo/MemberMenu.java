package com.member.model.vo;

import lombok.Data;

@Data
public class MemberMenu {
	private int menuNo;
	private String memberId;
	private String menuId;
	private String menuId_c;
	private int amount;
	private String menuWeek;
	private String menuDaytime;
	private String menuName;	
}
