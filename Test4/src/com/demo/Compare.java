package com.demo;
import java.util.Scanner;

public class Compare {

	/**
	 * @param args
	 *            实验四第二题
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入3个整数");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();

		int i = x > y ? x : y;
		int max = i > z ? i : z;

		int j = x < y ? x : y;
		int min = j < z ? j : z;
		System.out.println("最大的数字是：" + max+"\n最小的数字为："+min);
	}
}
