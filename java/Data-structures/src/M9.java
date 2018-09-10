class A 
{
	int i;
	A ref;
	A(int i)
	{
		this.i=i;
	}
	void add(int i)
	{
		A element=new A(i);
		A current=ref;
		while(current.ref!=null)
		{
	    current=current.ref;
		}
		current.ref=element;
	}
	void iterate()
	{
		A current=this;
		while(current !=null)
		{
			System.out.println(current.i);
			current=current.ref;
		}
	}
}
class M9
{
    public static void main(String[] args) 
	{
		A a1=new A(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.iterate();
	}
		
	
}
	
/* o/p:E:\Data-structures\classes>java M9
Exception in thread "main" java.lang.NullPointerException
        at A.add(M9.java:13)
        at M9.main(M9.java:34)
*/