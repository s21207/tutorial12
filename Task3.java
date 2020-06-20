package pgo11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<Item>();
		HashSet<Item> set = new HashSet<Item>();
		
		list.add(new Item(1, "Item1"));
		list.add(new Item(2, "Item2"));
		list.add(new Item(3, "Item3"));
		list.add(new Item(4, "Item4"));
		list.add(new Item(5, "Item5"));
		list.add(new Item(6, "Item6"));
		list.add(new Item(7, "Item7"));
		list.add(new Item(8, "Item8"));
		list.add(new Item(9, "Item9"));
		list.add(new Item(10, "Item10"));
		list.add(new Item(11, "Item11"));
		list.add(new Item(12, "Item12"));
		list.add(new Item(13, "Item13"));
		list.add(new Item(14, "Item14"));
		list.add(new Item(15, "Item15"));
		
		List<Item> subList = list.subList(0, 5);
		
		for(int i = 0; i < subList.size(); i++)
			set.add(subList.get(i));
	
	}
}
