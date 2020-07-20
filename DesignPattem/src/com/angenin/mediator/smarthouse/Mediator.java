package com.angenin.mediator.smarthouse;

import com.angenin.mediator.smarthouse.colleague.Colleague;

//中介者抽象类
public abstract class Mediator {

	//将同事对象加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收消息，具体的同事对象发出
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}
