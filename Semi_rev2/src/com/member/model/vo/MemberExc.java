package com.member.model.vo;

import lombok.Data;

@Data
public class MemberExc {
	private int excNo;
	private String memberId;
	private String excId;
	private int reps;
	private int sets;
	private double weight;
	private String excWeek;
	private String excName;	
}
