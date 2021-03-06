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
		last.ref = first;
	}
		
	void iterate()
	{
		Node current=first;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.nextRef;
		}
	}
	
	void reverseIterate()
	{
		Node current=last;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.prevRef;
		}
	}
}
	
class M19
{
    public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		//list.iterate();
		System.out.println("------");
		list.iterate();
		System.out.println("-------");
		list.reverseIterate();
	}
}
	
/*o/p

E:\Data-structures\src>java -cp ../classes M16
20
30
40
50
60
70
80
90
------
20
90
40
50
60
70
80
30*/
/*it is using lat.ref =first;
by default is a circular
for every element having last element ref is the value
whenevr circular list is ref
by default our program not is a circular*/