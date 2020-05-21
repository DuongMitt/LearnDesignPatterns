package creational_pattern.builder;

import creational_pattern.builder.carparts.Engine;
import creational_pattern.builder.carparts.SeatBelt;
import creational_pattern.builder.carparts.Windscreen;

public class Car {
	public int numberOfWheels;
	public SeatBelt seatBelt;
	public String color;
	public Windscreen windscreen;
	public Engine engine;
	
	public Car(int numberOfWheels, SeatBelt seatBelt, String color, Windscreen windscreen, Engine engine) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.seatBelt = seatBelt;
		this.color = color;
		this.windscreen = windscreen;
		this.engine = engine;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public SeatBelt getSeatBelt() {
		return seatBelt;
	}

	public void setSeatBelt(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Windscreen getWindscreen() {
		return windscreen;
	}

	public void setWindscreen(Windscreen windscreen) {
		this.windscreen = windscreen;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + ", seatBelt=" + seatBelt + ", color=" + color + ", windscreen="
				+ windscreen + ", engine=" + engine + "]";
	}
	
	
	
	
}
