package org.base;

public class Spin {

	public static void main(String[] args) {
	int a[] = new int[5];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	System.out.println(a[2]);
	int length = a.length;
	System.out.println(length);
	System.out.println("Normal for loop");
	for(int i=0; i<5; i++) {
		System.out.println(a[i]);	
	}
	System.out.println("***"); 
	System.out.println("enhanced for loop");
	for (int x:a) {
		System.out.println(x);
		
	}
	}

}
