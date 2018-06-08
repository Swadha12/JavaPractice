package linkList_Stack;

import java.util.LinkedList;

import org.w3c.dom.Node;
/*
 * Initialize three pointers prev as NULL, curr as head and next as NULL.
Iterate trough the linked list. In loop, do following.
// Before changing next of current,
// store next node
next = curr->next

// This is where actual reversing happens
curr->next = prev

// Move prev and curr one step forward
prev = curr
curr = next
 * 
 * 
 */


public class reverseLinkedList {
    static Node head;
    static class Node{
	private int data;
	private Node next;
	 Node(int data){
		this.data=data;
		this.next=null;
	}
	 

}
	 public static void main(String[] args) {
		 reverseLinkedList list = new reverseLinkedList();
	        list.head = new Node(85);
	        list.head.next = new Node(15);
	        list.head.next.next = new Node(4);
	        list.head.next.next.next = new Node(20);
	         
	        System.out.println("Given Linked list");
	        list.printList(head);
	        head = list.reverse(head);
	        System.out.println("");
	        System.out.println("Reversed linked list ");
	        list.printList(head);
	    }
	 public void printList(Node node){
			while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
			}
		}
		public Node reverse(Node node){
			Node prev= null;
			Node current= node;
			Node next= null;
			while(current!=null){
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				
			}
			node=prev;
			return node;
		}

}
