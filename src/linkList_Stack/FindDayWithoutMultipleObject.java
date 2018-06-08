package linkList_Stack;

import java.lang.invoke.SwitchPoint;

public class FindDayWithoutMultipleObject {
   
    

    
	String day="sunday monday tuesday wednesday thurday friday Saturday";
	String[] stArr = day.split(" ");
	public static int  index=0;
	public FindDayWithoutMultipleObject(int i, String dayOnOne){
		if(i<1 || i>30){
		int n= i%7;
		if(n !=0){
		for(int j=0;j<stArr.length;j++){
			
			if(stArr[j].trim().equals(dayOnOne)){
				int index=j;
				if(n+j-1>6){
					 int p = n+j-7; 
					System.out.println("Day on date "+i+" is " + stArr[(n+j-7)] );
				}else{
					System.out.println("Day on date "+i+" is " + stArr[n+j-1] );
				}
				
			}
			
		}
		}else{
			System.out.println("Day on date "+i+" is " + stArr[index] );
		}
		}else{
			System.out.println("please enter date between 1 and 30( including both ) ");
		}
			
	}
	
	public static void main(String[] args) {
		FindDayWithoutMultipleObject sc= new FindDayWithoutMultipleObject(32,"sunday");
	}
    

	
}
