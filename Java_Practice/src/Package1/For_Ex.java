package Package1;

import java.util.Scanner;

public class For_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i;
		
		//for(i=1;i<=10;i++) {
			
			//System.out.println(i);
		//}
		
		//System.out.println("Enter the number:");
		
		//Scanner s=new Scanner(System.in);
		
		//int table=s.nextInt();
		
		//for(int i=1;i<=10;i++) {
			//System.out.println(table+"*"+i+"="+table*i);
		//}
		
		//int count, num=5,total=1;
		
		//for(count=1;count<=num;count++) {
			
			//total=total*count;
		
		//}
		//System.out.println("The sum of 10 natural numbers are:"+total);
		
		//int count=7;
		//int  num1=0, num2=1;
		
		//for( int i=0;i<=count;i++) {
			//System.out.println(num1+" ");
			
			//int sumOfPreTwo = num1 +num2; 
			//num1=num2; 
			//num2 = sumOfPreTwo; 
			
			
		//}
		
		
		
		  int num=6; int temp; boolean isPrime=true;
		  
		  
		  for(int i=2;i<=num/2;i++) { temp=num%i; if(temp==0) { isPrime=false; break; }
		  }
		  
		  if(isPrime) { System.out.println("it is prime number"); } else {
		  System.out.println("it is not prime"); }
		 
		
		
		
		
		
		
		
		
		
		

	}

}
