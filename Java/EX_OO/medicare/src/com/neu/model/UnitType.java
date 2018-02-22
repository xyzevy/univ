package com.neu.model;

public class UnitType {

	public static int GOVERNMENT_OFFICE = 0;
	public static int FLEXIBLE_EMPLOYMENT = 1;
	public static int ENTERPRISE = 2;
	public static int INSTITUTION = 3;
	
	private static String []params = {"����","����ҵ������λ","��ҵ","��ҵ"};
	
	public static Integer strToInt(String param){
		for(int i=0;i<params.length;i++){
			if(param.equals(params[i])){
				return i;
			}
		}
		return 1;
	}
	
	public static String intToStr(Integer value){
		if(value>=0&&value<params.length){
			return params[value];
		}
		
		return "null";
	}
	
}