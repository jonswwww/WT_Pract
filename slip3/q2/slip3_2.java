import java.util.*;
class slip3_2
{
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add("first");
		l.add("second");
		l.add("third");
		System.out.println("Current list element"+l);
		l.addLast("Five");
		l.removeFirst();
		System.out.println("After updation"+l);
		ListIterator t=l.listIterator();
		while(t.hasNext())
		{
			t.next();
		}
		while(t.hasPrevious())
		{
			System.out.println(t.previous());
		}
	}	
}
