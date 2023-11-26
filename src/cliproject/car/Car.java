package cliproject.car;

import java.util.UUID;

/**
 * Car
 */
public class Car {

	private UUID id;
	private Model model;
	private boolean isElectric;
	private Color color;

	public Car(Model model, boolean isElectric, Color color) {
		id = UUID.randomUUID();
		this.model = model;
		this.isElectric = isElectric;
		this.color = color;
	}

	public UUID getId() {
		return id;
	}

	public Model getModel() {
		return model;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", isElectric=" + isElectric + ", color=" + color + "]";
	}
	
	
}