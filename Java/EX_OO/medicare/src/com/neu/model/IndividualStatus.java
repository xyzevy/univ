package com.neu.model;

public class IndividualStatus{

	public static int WORKER = 0;
	public static int FARMER = 1;
	public static int SUDENT = 2;
	public static int CADRE = 3;
	public static int NATIONAL_CIVILIAN = 4;
	public static int ACTIVE_ARMY = 5;
	public static int UMEMPLOYED = 6;
	public static int OTHERS = 7;
	
	private static String []params={"����","ũ��","�ɲ�","���ҹ���Ա",
			"���۾���","��ҵ��Ա","����"};
	
	public static Integer strToInt(String param){
		for(int i=0;i<params.length;i++){
			if(param.equals(params[i])){
				return i;
			}
		}
		return 7;
	}
	
	public static String intToStr(Integer value){
		if(value>=0&&value<params.length){
			return params[value];
		}
		
		return "null";
	}
	
	
	
}