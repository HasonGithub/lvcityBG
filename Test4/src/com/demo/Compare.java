package com.demo;
import java.util.Scanner;

public class Compare {

	/**
	 * @param args
	 *            ʵ���ĵڶ���
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������3������");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();

		int i = x > y ? x : y;
		int max = i > z ? i : z;

		int j = x < y ? x : y;
		int min = j < z ? j : z;
		System.out.println("���������ǣ�" + max+"\n��С������Ϊ��"+min);
	}
}
