package com.alarm.controller;

import com.pi4j.io.gpio.*;

/**
 * Created by neira on 05/01/16.
 */
public class AlarmController {

	private static GpioPinDigitalOutput pin;

	public String light(){
		    return "test light";
	}

	public String turnOnAlarm(){
		if (pin==null){
			GpioController gpioController = GpioFactory.getInstance();
		  pin = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLed", PinState.LOW );
		}
		 pin.toggle();
		return "OK";
	}
}
