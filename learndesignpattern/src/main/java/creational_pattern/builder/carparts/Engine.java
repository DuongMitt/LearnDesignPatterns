package creational_pattern.builder.carparts;

public class Engine {
	public String name;

	public Engine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}

	
}
