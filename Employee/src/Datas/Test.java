package Datas;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//transfer sta  -- break,continue
		
		Scanner hello=new Scanner(System.in);
		
		System.out.println("enter loop value:");
		
		int x=hello.nextInt();
		
		for(int a=1; a<=x;a++)
		{
			System.out.println(a);
			
			
		}
		
		
		
		
		
		
		/* 
		 * for(initialization;condition;incr/decr)
          {  
           //statement or code to be executed  
            }  
          1,2,3,4,5,6,----100
		
		
		for(int a=1; a>=-5; a--)  //101<=100
		{
			System.out.println(a);  //1,2,3--100
		}
		 
		
		//nested for loop:
		
		for(int a=1; a<=5; a++)  //1<=5 
		{
			System.out.println("a :"+a);   //1,2
		
			for(int b=1; b<=5; b++)  
			{
				System.out.println("b :"+b); //1,2,3,4,5
			}
		}
		
		
		//infinity for loop
		int a;
		
		for( a=1; a<=10 ;a++ )  
		{
			System.out.println("a :"+a);   //1,2
		}
		
		
		
		//while loop
		
		int a=1;
		
		while(a>=10)
		{
			System.out.println("a :"+a);
			a++;
		}
		
		
		
		//do-while loop:
		
		
		int a=1;
		
		do
		{
			System.out.println("a :"+a);  //1
			a++;   //2
		}
		
		while(true);  //2<=5
		
		*/
		
		
		
	}

}
