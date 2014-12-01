package reciver;

public class Light {
	private String name;
	
	private Light(){}
	
	public Light(String name){
		this();
		this.name = name;
	}
	
	public void switchOnLight(){
		System.out.println("Light ["+this.name+"] switched ON!");
	}
	
	public void switchOffLight(){
		System.out.println("Light ["+this.name+"] switched OFF!");
	}
	
}
