import java.util.*;
import java.io.*;
public class DoubleLinkedList {
node head;
 class node
 	{
	 	int data;
	 	node next;
	 	node pre;
	 	node(int data)
	 		{
	 			this.data= data;
	 			next=null;
	 			pre=null;
	 		}
 	}
  void push(int a)
  {
	  node n= new node(a);
	  if(head==null)
	  {
		  head= n;
	  }
	  else
	  {
		node d= head; 
		while(d.next!=null)
		{
			d=d.next;
		}
		d.next=n;
		n.pre=d;
	 }
	}
	 void display()
	 {
		 node d1=head;
		 while(d1!=null)
		 {
			System.out.println(d1.data); 
			d1=d1.next;
		 }
		 
	 }
	 public static void main(String args[])
	 {
		 DoubleLinkedList c= new DoubleLinkedList();
		 c.push(1);
		 c.push(2);
		 c.push(3);
		 c.push(4);
		 c.display();
	 }
	  
  }
