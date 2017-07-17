package designpatterns.hf.combining.observer;

public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	@Override
	public String toString() {
		return "Goose";
	}
}