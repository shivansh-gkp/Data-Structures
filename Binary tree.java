import java.util.*;
import java.io.*;
public class QueueNode {
	nodeq front;
	nodeq rear;
	class nodeq
	{
		node data;
		nodeq next;
		nodeq(node data)
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
 void enqueue(node a)
 {
	 nodeq n= new nodeq(a);
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
 node pole()
 {
	 node d= front.data;
	 dequeue();
	 return d;
	 
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
	 nodeq d= front;
     while (d!=rear)
	 {
		System.out.println(d.data.data);
		d=d.next;
	 }
 }
	
}

public class BinaryTree {
	node root;
	QueueNode q= new QueueNode();
	QueueNode q1= new QueueNode();
	linkedlist l= new linkedlist();
	BinaryTree()
	{
     root=null;
	}
 
 void preorder(node d)
 {
	 node r= d;
	 if(r==null)
	 {
		 return;
	 }
	 System.out.println(r.data);
	 preorder(r.left);
	 preorder(r.right);
 }
 void levelorder(node d)
 {
   q1.enqueue(d);
  while(q1.isempty()!=true)
  {
	node d1=q1.pole();
	System.out.println(d1.data);
   if(d1.left!=null)
   {
    q1.enqueue(d1.left);
   }
   if(d1.right!=null)
   {
    q1.enqueue(d1.right);
   }
  }
 }
 void constructbinarytree()
 {
	node n= new node(l.root.data);
	root= n;
	q.enqueue(n);
	int i=0;
	while(q.isempty()!=true)
	{
		node d= q.pole();
		System.out.println(d.data);
		if(l.leftc(i)!=0)
		{
			d.left=new node(l.leftc(i));
			System.out.println("child of "+d.data+ "is  "+ l.leftc(i) +d.left.data);
			q.enqueue((d.left));
			//System.out.println("-----");
			//q.display();
		}
		if(l.rightc(i)!=0)
		{	
		 d.right=new node(l.rightc(i));	
		 System.out.println("child of "+d.data+ "is  "+ l.rightc(i));
		 q.enqueue((d.right));
		}
		i++;
	}
	q.display();
 }
 
  public static void main(String args[])
  {
	  BinaryTree b= new BinaryTree();
	 // node n= new node(1);
	  b.l.add(6);
	  b.l.add(5);
	  b.l.add(4);
	  b.l.add(3);
	  b.l.add(2);
	  b.l.add(1);
	  b.constructbinarytree();
	//  b.l.add(7);
	 // b.root=new node(1);
	//  b.root.left=new node(2);
	  //b.root.right=new node(3);
	 // b.root.left.left=new node(4);
	 // b.root.left.right=new node(5);
	 // b.root.right.left=new node(6);
	 // b.root.right.right=new node(7);
	 // b.preorder(b.root);
	  //System.out.println("--------------------");
	  System.out.println("----");
	  b.levelorder(b.root);
	System.out.println("----"+b.root.left.left);

  }
 }
