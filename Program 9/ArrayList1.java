//Write a java program to remove elements from an ArrayList.

import java.util.ArrayList;
import java.util.*;
public class ArrayList1{
	
	public static void main(String[] args)
	{
		
		List<Integer> al = new ArrayList<>();

		al.add(17);
		al.add(25);
		al.add(44);
		al.add(19);
		al.add(26);

		System.out.println(al);

		al.remove(1);

		System.out.println(al);
	}
}
