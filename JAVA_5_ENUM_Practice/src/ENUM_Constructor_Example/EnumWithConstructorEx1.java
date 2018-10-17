package ENUM_Constructor_Example;

enum TrafficSignal {
	// this will call enum constructor with one String argument
	RED("wait"), GREEN("go"), ORANGE("slow dawn");
	private String action;

	public String getAction() {
		return this.action;
	}

	// enum constructor - can not be public or protected
	TrafficSignal(String action) {
		this.action = action;
	}
}

public class EnumWithConstructorEx1 {
	public static void main(String args[]) {

		// let's print name of each enum and there action
		// - Enum values() examples
		TrafficSignal[] signals = TrafficSignal.values();

		for (TrafficSignal signal : signals) {
			// Java name example - Java getter method example
			System.out.println("name : " + signal.name() + " action: " + signal.getAction());
		}

	}
}
