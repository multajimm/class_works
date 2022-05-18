package com.telentech;
import java.text.DecimalFormat;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat result = new DecimalFormat("0.00000");
		
		int a = 22;
		float b = 7f;
		float c = a/b;
		System.out.println("c ="+result.format(c));
		

	}

}
