package com.java;

public class JumpStatementExample {
	
	public static void main(String[] args) {
		int i=1,limit=100;
		for(;i<limit;i=i+1)
		{
			System.out.println(i);
			if(i==50)
			{
				//break;
				continue;
			
			}
		}
		
		System.out.println("outside of for block");
		
	}

}
