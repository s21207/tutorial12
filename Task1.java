package pgo11;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		for(int i = 2009; i >= 2000; i--)
			cars.add(new Car("BMW", i));
		
		Collections.sort(cars);
		
		for(Car c : cars)
			System.out.println(c);
			
	}
	
		
}

class Car implements Comparable<Car> {
	private String model;
	private int year;
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return model + " " + year;
	}

	@Override
	public int compareTo(Car c) {
		if(getYear() == c.getYear())
			return 0;
		
		if(getYear() > c.getYear())
			return 1;
		else
			return -1;
	}
	
}


