package creational_pattern.builder.demo;

import creational_pattern.builder.Car;
import creational_pattern.builder.CarBuilder;
import creational_pattern.builder.carparts.Engine;
import creational_pattern.builder.carparts.SeatBelt;
import creational_pattern.builder.carparts.Windscreen;

public class Demo {
	public static void main(String[] args) {
		Car car1 = new Car(4, new SeatBelt("Ong Dev"), "Black", new Windscreen("Ong Dev"), new Engine("V6 3.0"));
		System.out.println(car1.toString());
		
		//
		System.out.println("=========================");
		Car car2 = new CarBuilder().addWhells(4).addSeatBelts(new SeatBelt("Ong Dev")).Build();
		System.out.println(car1.toString());
	}
}
