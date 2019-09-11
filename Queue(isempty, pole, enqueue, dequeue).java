import java.util.*;
import java.io.*;
public class queue {
	node front;
	node rear;
	class node
	{
		int data;
		node next;
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	boolean isempty()
	{
		if(front==null && rear==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	int pole()
	 {
		 int d= front.data;
		 dequeue();
		 return d;
		 
	 }
 void enqueue(int a)
 {
	 node n= new node(a);
	 if(front==null && rear== null)
	 {
		 front= rear= n;
	 }
	 else
	 {
		 rear.next=n;
		 rear=n;
	 }
 }
 void dequeue()
 {
	 if(front==null)
	 {
		 System.out.println("empty queue");
		 return;
	 }
	 front= front.next;
	 if(front==null)
	 {
		 rear=null;
	 }
 }
 void display()
 {
	 node d= front;
	 while (d!=rear.next)
	 {
		 System.out.println(d.data);
		 d=d.next;
	 }
 }
	public static void main(String args[])
	{
		queue q= new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.display();
		q.dequeue();
		System.out.println("-----");
		q.display();
		System.out.println("-----");
		q.enqueue(5);
		q.display();
		q.dequeue();
		System.out.println("-----");
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.display();
	}
}
