package command;

import reciver.Light;

public class LightOffCommand implements Command {

	private Light light;

	private LightOffCommand() {
	}

	public LightOffCommand(Light light) {
		this();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.switchOffLight();
	}
}
