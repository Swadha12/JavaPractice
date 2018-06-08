package linkList_Stack;

import java.util.Arrays;

public class NumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* System.out.println(factorial(0));
 System.out.println(factorial(1));
 System.out.println(factorial(3));
 febonacciSeries(8);
 verifyMobileNumber("7686");
 verifyMobileNumber("7686567654");
 verifyMobileNumber("917686567654");
 verifyMobileNumber("957686567654");
 verifyMobileNumber("+917686567654");
 searchString("abca",'a');*/
		
		
	}
	static int fact=0;
	public static int factorial(int num){
		
		if(num==1 || num==0){
			fact=1;
		}
		else if(num>1){
			fact=(num)*(factorial(num-1));
		}
		return fact;
	}
	static int sum=1;
	public static void febonacciSeries(int n){
		int[] feb=new int[n];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<n;i++){
		
		feb[i]=feb[i-1]+feb[i-2];
		
		}
		System.out.println(Arrays.toString(feb));
	}
	
	public static void verifyMobileNumber(String num){
		int len= num.length();
		if(len>=10){
		        if(len==12){
		            String cCode=num.substring(0, 2);
		    	       if(cCode.equals("91")){
					    System.out.println("country code is valid");
				       }else{
					    System.out.println("country code is not valid");
				       }
		          }else if(len==13){
			           String cCode=num.substring(0, 3);
			           if(cCode.equals("+91")){
				         System.out.println("country code is valid");
			      }else{
				       System.out.println("country code is not valid");
			       }
		         }else{
			     System.out.println("please enter mobile number with country code");
		        }
	     }else{
	        	System.out.println("please enter valid mobile number ");
	}
	}
	
	public static void searchString(String str,char ch){
		char[] chArr= str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			if(chArr[i]==ch){
				System.out.println("Char " +ch+" found in String '"+str+"' at index: "+i);
			
				
			}
		}
	}
}
