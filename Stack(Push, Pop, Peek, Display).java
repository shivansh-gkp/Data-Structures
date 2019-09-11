import java.io.*;
import java.util.*;

public class stack {
	node root;
	
	public class node
	{
		int data;
		node next;
			node(int a)
			{
				data=a;
				next=null;
			}
		}
	void push(int a)
	{
		node a1 = new node(a);
		if(root==null)
		{
			root= a1;
			return;
		}
		else
		{
			a1.next=root;
			root=a1;			
		}
	}
	int pop()
	{
		if(root==null)
		{
			System.out.println("Stack under flow");
			return 0;
		}
	    int d= root.data;
		root=root.next;	  
		return d;
	}
	int peek()
	{
		if(root!=null)
		{
			return root.data;
		}
		else
		{
			return 0;
		}
	}
	void display()
	{
		node trav= root;
		if(trav!=null)
		{
		 while(trav!=null)
		 {
		   System.out.println(trav.data);
		   trav=trav.next;
		 }
		}
		else
		{
			System.out.println("stack unter flow");
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter node 1");
		int a= sc.nextInt();
		System.out.println("enter node 2");
		int b= sc.nextInt();
		System.out.println("enter node 3");
		int c= sc.nextInt();
		stack s= new stack();
		s.push(a);
		s.push(b);
		s.push(c);
		s.display();
		int d=s.pop();
		System.out.println("-------------"+d+"----------------");
		s.display();
		System.out.println("--------------");
		System.out.println(s.peek());
		
	}
}

