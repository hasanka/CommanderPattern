package controller;

import command.Command;

public class SimpleRemoteController {

	private Command command;

	private SimpleRemoteController() {

	}

	public SimpleRemoteController(Command command) {
		this();
		this.command = command;
	}

	public void switchPress() {
		this.command.execute();
	}

}
