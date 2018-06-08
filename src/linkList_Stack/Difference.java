package linkList_Stack;
import java.util.Arrays;

public class Difference {
	private int[] elements;
  	public int maximumDifference;
	// Add your code here
public Difference(int[] elements){
    this.elements=elements;
}
int[] arr,arr1;
public void computeDifference(){
    for(int i=0;i<elements.length;i++){
        for(int j=i+1;j<elements.length;j++)
        arr[j]=(Math.abs(elements[i]-elements[j]));
    }
    Arrays.sort(arr);
    System.out.println(arr.length);
    this.maximumDifference=arr[arr.length-1];
    
   
}
}