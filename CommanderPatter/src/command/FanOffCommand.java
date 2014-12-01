package command;

import reciver.CeilingFan;

public class FanOffCommand implements Command {

	private CeilingFan ceilingFan;

	private FanOffCommand() {
	}

	public FanOffCommand(CeilingFan ceilingFan) {
		this();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.switchOnFan();
	};

}
