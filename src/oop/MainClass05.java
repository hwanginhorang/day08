package oop;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		//인자값 또는 parameta
		
		t.sumFunc(num);
		System.out.println("sumfunc222");
		
		int s = t.sumFunc2(num);
		System.out.println("1~"+num+"까지의 합"+s);
		
		
	}
}
