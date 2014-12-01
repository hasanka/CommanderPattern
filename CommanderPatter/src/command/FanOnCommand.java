package command;

import reciver.CeilingFan;

public class FanOnCommand implements Command {

	private CeilingFan ceilingFan;

	private FanOnCommand() {
	}

	public FanOnCommand(CeilingFan ceilingFan) {
		this();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.switchOnFan();
	};

}
