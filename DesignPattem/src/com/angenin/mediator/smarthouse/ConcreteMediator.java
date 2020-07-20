package com.angenin.mediator.smarthouse;

import com.angenin.mediator.smarthouse.colleague.*;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {

	//集合，放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	//注册同事类
	@Override
	public void Register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);

		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

	//具体中介者的核心方法
	//1.根据得到消息,完成对应任务
	//2.中介者在这个方法,协调各个具体的同事对象,完成任务
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		//处理闹钟发出的信息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap
						.get("CoffeeMachine")))).StartCoffee();
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}
		//处理咖啡机发出的信息
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();

		//处理电视发出的信息
		} else if (colleagueMap.get(colleagueName) instanceof TV) {
		//处理窗帘发出的信息
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {

		}
	}

	@Override
	public void SendMessage() {
	}

}
