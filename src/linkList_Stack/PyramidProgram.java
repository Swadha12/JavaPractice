package linkList_Stack;

public class PyramidProgram {

	public static void main(String[] args) {
		int n,num;
		n=5;
/*		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){     
			System.out.print("* ");
			}
			System.out.println();
		}*/
		
/*		
	      * 
	     * * 
	    * * * 
	   * * * * 
	  * * * * * 
		for(int i=0;i<n;i++){
			for(int k=n-i;k>0;k--){
				System.out.print(" ");     
			}
			for(int j=0;j<=i;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		}	*/

		
	/*        * 
	        * * 
	      * * * 
	    * * * * 
	  * * * * *   */ 
		
	/*	int k=2*n;
	//	System.out.println(k);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<k;j++){
				System.out.print(" ");     
			}
			k=k-2;
			for(int j=0;j<=i;j++){
			System.out.print("* ");
			}
			
			System.out.println();
		}*/
		
		/*
		 * 
		 * 
1		  
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
		 * 
		 * 
		 */
		
	/*	for(int i=0;i<n;i++){
			
			for(int j=0;j<=i;j++){
				 num = 1+i;
			System.out.print(num+" ");
			 
			}
			
			System.out.println();
		}*/
		
		
		/*
		 * 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
		 * 
		 * 
		 */
		
		//num=1;
/*		
	for(int i=0;i<n;i++){
			num=1;
			for(int j=0;j<=i;j++){
			System.out.print(num+" ");
			num++;
			 
			}
			
			System.out.println();
		}
	*/
	/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 
			 * 
			 * 
			 */
			
		
/*	num=1;	
		for(int i=0;i<n;i++){
				
				for(int j=0;j<=i;j++){
				System.out.print(num+" ");
				num++;
				 
				}
				
				System.out.println();
			}*/
		
		
		/*
		
		
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9  
		 * 
		 * 
		 */
	
/*		for(int i=0;i<n;i++){
			num=i;
			for(int j=0;j<=i;j++){
				
			System.out.print(num+" ");
			num++;
			 
			}
			
			System.out.println();
		}*/
		
		
		/*		
		
		1		 
		121
		12321
		1234321
				 * 
				 * 
				 * 
				 * 
				 
				for(int i=1;i<=4;i++){
				int n=1;
			for(int k=1;k<=2*i-1;k++){
				if(i>k){
					System.out.print(n++);
				}
				else if(i==k){
					System.out.print(n);
				}
				else{
					n--;
					System.out.print(n);
				}
			}
			System.out.println();
				}
				
					*/

				
		/*				
			Pattern-2	
		   * 
		  * * 
		 * * * 
		* * * * 
		 * * * 
		  * * 
		   * 
				 * 
				 * 
				 * 
						 
				int space=3;
				for(int i=1;i<=4;i++){
					for(int k=1;k<=space;k++){
						System.out.print(" ");
					}
					
					space--;
					for(int k=1;k<=i;k++){
						System.out.print("* ");
					}
					System.out.println();
				}
				space=1;
				for(int i=1;i<=3;i++){
				for(int k=1;k<=space;k++){
					System.out.print(" ");
				}
				space++;
				for(int k=1;k<=4-i;k++){
					System.out.print("* ");
				}
				System.out.println();
				}
				*/
				
				/*				
				Pattern-2	
			5****
			54***
			543**
			5432*
			54321
		 * 
		*/
				/*for(int i=1;i<=5;i++){
					int n=5;
					for(int k=1;k<=5;k++){
					if(i>=k){
						System.out.print(n--);
					}
					else{
						System.out.print("*");
					}
					
					}
					
					System.out.println();
				}*/
							 
				
		
		
	}

}
