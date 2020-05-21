package creational_pattern.builder;

import creational_pattern.builder.carparts.Engine;
import creational_pattern.builder.carparts.SeatBelt;
import creational_pattern.builder.carparts.Windscreen;

public class CarBuilder implements ICarBuilder{
	public int numberOfWheels;
	public SeatBelt seatBelt;
	public String color;
	public Windscreen windScreen;
	public Engine engine;
	
	
	@Override
	public CarBuilder addWhells(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
		return this;
	}


	@Override
	public CarBuilder addSeatBelts(SeatBelt seatBelt) {
		this.seatBelt = seatBelt;
		return this;
	}


	@Override
	public CarBuilder addpaint(String color) {
		this.color = color;
		return this;
	}


	@Override
	public CarBuilder addWindscreen(Windscreen windscreen) {
		this.windScreen = windscreen;
		return this;
	}


	@Override
	public CarBuilder addEngine(Engine engine) {
		this.engine = engine;
		return this;
	}


	@Override
	public Car Build() {
		return new Car(numberOfWheels, seatBelt, color, windScreen, engine);
	}


	
}
