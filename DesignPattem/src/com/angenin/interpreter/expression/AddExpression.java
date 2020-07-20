package com.angenin.interpreter.expression;

import java.util.HashMap;

//加法解释器
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//处理相加
	//var依然是{a=10, b=20, c=30}
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var)：返回left表达式对应的值10
		//super.right.interpreter(var)：返回right表达式对应的值20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
