package com.demo;

import java.util.Scanner;

public class Cost {
	/**
	 * @param args
	 *            ʵ���ĵ�����
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������0.1~5.0Ԫ֮�����Ʒ�۸�");
		double d = scanner.nextDouble();// �������Ʒ�۸�
		double d1 = 5.00;// �û�֧��
		double d2 = d1 - d;// Ӧ������
		if (d2 != 0) {
			int x = (int) (d2 / 2);// ��Ԫ
			d2 = d2 % 2;
			System.out.println("��Ԫ" + x + "��");
			int y = (int) (d2 / 1);// һԪ
			d2 = d2 % 1;
			System.out.println("һԪ" + y + "��");
			int z = (int) (d2 / 0.5);// ���
			d2 = d2 % 0.5;
			System.out.println("���" + z + "��");
			int w = (int) (d2 / 0.2);// ����
			d2 = d2 % 0.2;
			System.out.println("����" + w + "��");
			int j = (int) (d2 / 0.1);// һ��
			d2 = d2 % 0.1;
			System.out.println("һ��" + j + "��");
			if (d2 != 0) {
				System.out.println("����" + (float) d2 + "��Ǯ��Ҽ�����л���ľ�����");
			}
		}
	}
}
