package com.demo;
public class Exception {/**
	 * @param args
	 *            ʵ���ĵ�����
	 */
	String x;
	public static void main(String[] args){
		Exception ex = new Exception();
		try{
			System.out.println(ex.x.length());
			
		}catch(NullPointerException e){
			ex.x = "��ָ���쳣";
			System.out.println(ex.x.length());
		}
		System.out.println("---����---");
		
		
	}
}
