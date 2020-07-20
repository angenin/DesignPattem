package com.angenin.mediator.smarthouse.colleague;

import com.angenin.mediator.smarthouse.Mediator;

//同事抽象类
public abstract class Colleague {

	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
