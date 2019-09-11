import java.util.*;

public class node
{
 coor n;
 node next;
  node(coor n)
  {
	  this.n=n;
	  next=null;
  }
}

public class linkedlist
{
	node root;
	
	void add(coor n)
	{
		node c=new node(n);
		if(root==null)
		{
			root= c;
		}
		else
		{
			node d=root;
			while(d.next!=null)
			{
				d=d.next;
			}
			d.next=c;
		}
	}
	
	void display()
	{
	 node r= root;
	 while(r!=null)
	 {
	  System.out.println(r.x);
	  r=r.next;
	 }
	 
	}
	boolean contains(coor e)
	{
		node d=root;
		while(d!=null)
		{
			if((d.n.x==e.x)&&(d.n.y==e.y))
			{
				return true;
			}
			d=d.next;
		}
		return false;
	}

}
