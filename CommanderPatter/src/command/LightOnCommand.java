package command;

import reciver.Light;

public class LightOnCommand implements Command{

	private Light light;
	
	private LightOnCommand(){}
	
	public LightOnCommand(Light light){
		this();
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.switchOnLight();
	}

}
