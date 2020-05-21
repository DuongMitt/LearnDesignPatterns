package creational_pattern.builder.carparts;

public class Windscreen {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Windscreen(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Windscreen [name=" + name + "]";
	}
	
	
}
