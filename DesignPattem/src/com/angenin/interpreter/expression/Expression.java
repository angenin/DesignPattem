package com.angenin.interpreter.expression;

import java.util.HashMap;

//抽象类表达式，通过HashMap的键值对获取到变量的值
public abstract class Expression {

	//	a + b - c
	//解释公式和数值的关系，key就是公式（表达式）参数【a, b, c】，value就是具体的值
	//HashMap<String, Integer> var = {a=10, b=20, c=30}
	public abstract int interpreter(HashMap<String, Integer> var);
}
