package com.prowings.practise1;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(1.2f,1200,4);
		
		Car car1 = new Car("TOYOTA",null,2023);
		
		System.out.println(engine);
		System.out.println(car1);
	}

}
