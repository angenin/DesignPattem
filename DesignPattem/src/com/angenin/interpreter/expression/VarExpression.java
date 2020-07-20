package com.angenin.interpreter.expression;

import java.util.HashMap;


//变量的解释器
public class VarExpression extends Expression {

	private String key;		//key=a, key=b, key=c

	public VarExpression(String key) {
		this.key = key;
	}

	//根据变量的名称，返回对应的值
	//var就是{a=10, b=20, c=30}
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
