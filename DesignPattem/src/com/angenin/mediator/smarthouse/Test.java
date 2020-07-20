package com.angenin.mediator.smarthouse;

import com.angenin.mediator.smarthouse.colleague.Alarm;
import com.angenin.mediator.smarthouse.colleague.CoffeeMachine;
import com.angenin.mediator.smarthouse.colleague.Curtains;
import com.angenin.mediator.smarthouse.colleague.TV;

public class Test {

	//测试中介者模式
	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();

		//创建一个闹钟对象，并把自己加入到mediator对象的HashMap中
		Alarm alarm = new Alarm(mediator, "alarm");
		//创建了一个咖啡机对象，并把自己加入到mediator对象的HashMap中
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//创建了一个窗帘对象，并把自己加入到mediator对象的HashMap中
		Curtains curtains = new Curtains(mediator, "curtains");
		//创建了一个电视对象，并把自己加入到mediator对象的HashMap中
		TV tV = new TV(mediator, "TV");

		//让闹钟发出消息（打开咖啡机和电视机）
		alarm.SendAlarm(0);
		System.out.println("-----------");
		//咖啡机煮好咖啡，并且打开窗帘
		coffeeMachine.FinishCoffee();
		System.out.println("-----------");
		//让闹钟发出消息（关闭电视）
		alarm.SendAlarm(1);
	}

}
