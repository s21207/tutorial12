package pgo11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<Item>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		list.add(new Item(1, "Item1"));
		list.add(new Item(2, "Item2"));
		list.add(new Item(3, "Item3"));
		list.add(new Item(4, "Item4"));
		list.add(new Item(5, "Item5"));
		
		for(int i = 0; i < 5; i++)
			list.get(i).show();
		
		for(Item i : list)
			map.put(i.getId(), i.getName());
		
		System.out.println();
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(String.format("Key: %d, Value: %s", e.getKey(), e.getValue()));
		}
			
		
		
	}
}

class Item {
	private int id;
	private String name;
	
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void show() {
		System.out.println(getName());

	}
}