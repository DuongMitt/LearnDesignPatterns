package creational_pattern.builder;

import creational_pattern.builder.carparts.Engine;
import creational_pattern.builder.carparts.SeatBelt;
import creational_pattern.builder.carparts.Windscreen;

public interface ICarBuilder {
	CarBuilder addWhells(int numberOfWheels);
	CarBuilder addSeatBelts(SeatBelt seatBelt);
	CarBuilder addpaint(String color);
	CarBuilder addWindscreen(Windscreen windscreen);
	CarBuilder addEngine(Engine engine);
	Car Build();
	
}
