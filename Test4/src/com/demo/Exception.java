package com.demo;
public class Exception {/**
	 * @param args
	 *            实验四第四题
	 */
	String x;
	public static void main(String[] args){
		Exception ex = new Exception();
		try{
			System.out.println(ex.x.length());
			
		}catch(NullPointerException e){
			ex.x = "空指针异常";
			System.out.println(ex.x.length());
		}
		System.out.println("---结束---");
		
		
	}
}
