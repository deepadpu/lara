class Node
{
	int i;
	Node ref;
	Node (int i)
	{
		this.i=i;
	}
}
class LinkedList 
{
	Node first;
	Node last;
	void add(int i)
	{
		Node element=new Node(i);
		if(first == null)
		{
			first=element;
		}
		else
		{
			last.ref=element;
		}
		last =element;
	}
		
	void iterate()
	{
		Node current=first;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
	boolean remove(int data)
	{
		boolean status=false;
		if(first.i==data)//removing 1 st element
		{
			first=first.ref;
			status =true;
		}
		else if(last.i==data)
		{
			Node prev=null;
			Node current =first;
			while(current.ref!=null)
			{
				prev=current;
				current=current.ref;
			}
			last=prev;
			last.ref=null;
			status=true;
			
		}

		else
		{
			Node prev=null;
			Node current=first;
			while(current !=null && !(status=!(current.i !=data)));
			{
				prev=current;
				current=current.ref;
			}
			if(status)
			{
			prev.ref=current.ref;
			}
		}
			return status;
	}
}
	
class M13
{
    public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.iterate();
		System.out.println("------");
		System.out.println(list.remove(130));
		//list.remove(50);
		//list.remove(20);
		list.remove(30);
		list.iterate();
	}
}
	
/*o/p:E:\Data-structures\src>java -cp ../classes M12
20
30
40
50
------
20
30
40

E:\Data-structures\src>javac -d ../classes M12.java

E:\Data-structures\src>java -cp ../classes M12
20
30
40
50
------
30
40
50

E:\Data-structures\src>










*/
	
//1st is using for reading purpose
//last elementusing for adding purpose