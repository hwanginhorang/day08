package oop;

import java.util.ArrayList;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test1(10, "문자열", 1.1);
		
		System.out.println("===test2===");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("안녕"); arr.add("하세요");
		t.test2(arr);
		
		System.out.println("===test3===");
		
		t.test3();
		
		System.out.println("===test4===");
		
		int s = t.test4();
		System.out.println(s);
		
		System.out.println("===test5===");
		
		int[] n = t.test5();
		System.out.println(n[0]+", "+n[1]);
		t.test1(100, "aaa", 1.1);
		arr.add(111+"");
		boolean bool = arr.add(111+"");
		System.out.println(bool);
		t.test2(arr);
		t.test4();
		
		//System.out.println(ss+100);
		//System.out.println(Integer.parseInt(ss)+100);
	}
}
