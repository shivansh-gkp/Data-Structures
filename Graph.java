import java.io.*;
import java.util.*;

public class node {
 coor n;
 node next;
  node(coor n)
  {
	  this.n=n;
	  next=null;
  }
}

public class linkedlist {
 node root;
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
	void add(int data)
	{
		node n= new node(data);
		if(root==null)
		{
		 root= n;
		}
		else
		{
		  n.next=root;
		  root=n;
		}
	}
	void display()
	{
		node d= root;
		while(d!=null)
		{
			System.out.print(d.data);
			d=d.next;
		}
		System.out.println();
	}
	int leftc(int i)
	{
		int d=0;
		node n= root;
		while((n!=null) && (d!=i*2+1))
		{
			n=n.next;
			d++;
		}
		if(n!=null)
		{
		return n.data;
		}
		else
		{
			//System.out.print(d + " "+ i);
		//	System.out.println("returns 0");
		return 0;
		}
	}
	int rightc(int i)
	{
		int d=0;
		node n= root;
		while((n!=null) && (d!=i*2+2))
		{
			n=n.next;
			d++;
		}
		if(n!=null)
		{
		return n.data;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String args[])
	{
		linkedlist l= new linkedlist();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.display();
	}
}

public class Graph
{
	int visited[];
	linkedlist l[];
	Graph(int v)
	{
		int i=0;
		visited= new int[v];
		l=new linkedlist[v];
		for(i=0;i<v;i++)
		{
			l[i]=new linkedlist();
		}
	}
	
	void insert(int sour, int dest)
	{
	  	l[sour].add(dest);
	  	l[dest].add(sour);
	}
	void printlist()
	{
		int i=0;
		for(i=0;i<l.length;i++)
		{
			System.out.print(i+"is connected to ");
			l[i].display();
		}
	}
	void traversebst()
	{
		queue q=new queue();
		q.enqueue(0);
		//System.out.println(l[0].root.data);
		visited[0]=1;
		while(q.isempty()!=true)
		{
			int d=q.pole();
			System.out.print(" "+ d);
			linkedlist l1=new linkedlist();
			l1.root=l[d].root;
			while(l1.root!=null)
			{
				//System.out.println(l1.root.data);
				if(visited[l1.root.data]!=1)
				{
				 q.enqueue(l1.root.data);
				 visited[l1.root.data]=1;
				}
				l1.root=l1.root.next;
			}
		}
	}
	
	public static void main(String args[])
	{
		Graph g= new Graph(6);
		g.insert(0,1);
		g.insert(0,2);
		g.insert(1,3);
		g.insert(1,4);
		g.insert(2,4);
		g.insert(3,4);
		g.insert(3,5);
		g.insert(4,5);
		g.printlist();
	   System.out.println("--------");
		g.traversebst();
		
	}

}
