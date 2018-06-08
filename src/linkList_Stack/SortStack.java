package linkList_Stack;

import java.util.ListIterator;
import java.util.Stack;

/*
is_empty(S)  : Tests whether stack is empty or not.
push(S)         : Adds new element to stack.
add(S)         : Adds new element to stack.
pop(S)         : Removes top element from the stack.
top(S)         : Returns value of the top element. Note that this
               function does not remove element from the stack.
s.peek()       :
 * 
 */


public class SortStack {
	
/*	//method-1 with temp stack
	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> tmpStack= new Stack<Integer>();
		while(!input.isEmpty()){
			int tmp= input.pop();
			while(!tmpStack.isEmpty() && tmpStack.peek()>tmp){
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
		}
		
		return tmpStack;
	}
	
	 // Driver Code
    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
     
        // This is the temporary stack
        Stack<Integer> tmpStack=sortStack(input);
        System.out.println("Sorted numbers are:");
     
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        } 
    }*/
    
//Method-2 with recursive process    
    
    // Driver method 
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(30);
    
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
      
        System.out.println("Stack elements before sorting: ");
        printStack(s);
      
        sortStack(s);
      
        System.out.println(" \n\nStack elements after sorting:");
        printStack(s);
      
    }

    // Recursive Method to insert an item x in sorted way
    static void sortedInsert(Stack<Integer> s, int x)
    {
    	
        // Base case: Either stack is empty or newly inserted
        // item is greater than top (more than all existing)
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }
      
        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);
      
        // Put back the top item removed earlier
        s.push(temp);
    }
      
    // Method to sort stack
    static void sortStack(Stack<Integer> s)
    {
        // If stack is not empty
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();
      
            // Sort remaining stack
            sortStack(s);
      
            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

// Utility Method to print contents of stack
static void printStack(Stack<Integer> s)
{
   ListIterator<Integer> lt = s.listIterator();
    
   // forwarding
   while(lt.hasNext())
       lt.next();
    
   // printing from top to bottom
   while(lt.hasPrevious())
       System.out.print(lt.previous()+" ");
}
}
