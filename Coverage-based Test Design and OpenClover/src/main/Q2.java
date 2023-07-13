package main;

public class Q2 {
	public void func(int a, int b) {
		if (b > a) {
		b = b - a;
		System.out.println(b); }
		else if (a > b) {
		b = a - b;
		System.out.println(b); }
		else
		System.out.println(0);
		}
}
