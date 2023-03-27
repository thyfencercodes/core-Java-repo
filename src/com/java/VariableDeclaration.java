package com.java;

import java.util.Arrays;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		
		int orderId;
		orderId=827;
		char symbol='8';
		
		float amount=560.78F;
		double interestAmount=8976.67D;
		
		
		int scores1[]= {11,22,33,44,55,66,77,88};
		
		System.out.println(orderId);
        
        
        System.out.println(symbol);
        System.out.println(amount);
        System.out.println(interestAmount);
        System.out.println(Arrays.toString(scores1));
	}

}