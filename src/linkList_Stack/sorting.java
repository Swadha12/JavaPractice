package linkList_Stack;
import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1={1,2,5};
int[] arr=new int[3];
int k=0;
for(int i=0;i<arr1.length;i++){
    for(int j=i+1 ;j<arr1.length-1 ;j++ ){
    arr[k]=(Math.abs(arr1[j]-arr1[i]));
   k++;
}
    
   // System.out.println();
}
System.out.println(arr.length);
for(int x=0;x<arr.length;x++){
 System.out.println(arr[x]);  
}
Arrays.sort(arr);
	}

}
