package com.demo;

import java.util.Scanner;

public class Cost {
	/**
	 * @param args
	 *            实验四第三题
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入0.1~5.0元之间的商品价格");
		double d = scanner.nextDouble();// 输入的商品价格
		double d1 = 5.00;// 用户支付
		double d2 = d1 - d;// 应该找零
		if (d2 != 0) {
			int x = (int) (d2 / 2);// 两元
			d2 = d2 % 2;
			System.out.println("两元" + x + "张");
			int y = (int) (d2 / 1);// 一元
			d2 = d2 % 1;
			System.out.println("一元" + y + "张");
			int z = (int) (d2 / 0.5);// 五角
			d2 = d2 % 0.5;
			System.out.println("五角" + z + "张");
			int w = (int) (d2 / 0.2);// 两角
			d2 = d2 % 0.2;
			System.out.println("两角" + w + "张");
			int j = (int) (d2 / 0.1);// 一角
			d2 = d2 % 0.1;
			System.out.println("一角" + j + "张");
			if (d2 != 0) {
				System.out.println("还有" + (float) d2 + "分钱，壹基金感谢您的捐赠！");
			}
		}
	}
}
