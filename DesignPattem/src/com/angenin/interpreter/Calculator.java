package com.angenin.interpreter;

import com.angenin.interpreter.expression.AddExpression;
import com.angenin.interpreter.expression.Expression;
import com.angenin.interpreter.expression.SubExpression;
import com.angenin.interpreter.expression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	//定义表达式
	private Expression expression;

	//构造函数传参并解析
	public Calculator(String expStr) {
		//安排运算后的顺序
		Stack<Expression> stack = new Stack<>();
		//表达式拆分成字符数组（例：expStr格式为 a+b-c ）
		char[] charArray = expStr.toCharArray();	//例：charArray = {a, +, b, -, c}

		Expression left = null;
		Expression right = null;
		//遍历数组
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop();		//从stack中取出left => a
				right = new VarExpression(String.valueOf(charArray[++i]));	//取出b
				stack.push(new AddExpression(left, right));	//根据left和right构建AddExpression加入stack
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				//如果是一个Var（变量），就创建VarExpression对象并push进stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//当遍历完数组后，得到stack中最后的Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		//把var传递给expression的interpreter方法进行解析执行
		return this.expression.interpreter(var);
	}
}