package reciver;

public class CeilingFan {
	private String name;

	private CeilingFan() {
	}

	public CeilingFan(String name) {
		this();
		this.name = name;
	}

	public void switchOnFan() {
		System.out.println("Fan [" + this.name + "] switched ON");
	}

	public void switchOffFan() {
		System.out.println("Fan [" + this.name + "] switched OFF");
	}

}
