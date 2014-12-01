package main;

import command.FanOffCommand;
import command.FanOnCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import reciver.CeilingFan;
import reciver.Light;
import controller.SimpleRemoteController;

public class RemoteControler {

	public static void main(String[] args) {
		Light l1 = new Light("Kitchen");
		CeilingFan f1 = new CeilingFan("Bath Room");
		
		FanOnCommand fo1 = new FanOnCommand(f1);
		FanOffCommand fo2 = new FanOffCommand(f1);
		
		LightOnCommand lo1 = new LightOnCommand(l1);
		LightOffCommand lo2 = new LightOffCommand(l1);

		SimpleRemoteController simpleRemoteController = new SimpleRemoteController(lo1);
		simpleRemoteController.switchPress();
		
		simpleRemoteController = new SimpleRemoteController(lo2);
		simpleRemoteController.switchPress();
		
		
		simpleRemoteController = new SimpleRemoteController(fo1);
		simpleRemoteController.switchPress();

		simpleRemoteController = new SimpleRemoteController(fo2);
		simpleRemoteController.switchPress();
		
	}

}
