package 栈;

import java.util.HashMap;
import java.util.Stack;

public class _20_有效的括号 {
	private static HashMap<Character, Character> map = new HashMap<>();
	//可以构造
/*	public _20_有效的括号{
		// key - value
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}*/
	//不依赖类名哦
	static {
		// key - value
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
	}
	
	public boolean isValid(String s) {
		//泛型不能放基本数据类型 引用类型 Character
		Stack<Character> stack = new Stack<>();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			//map 有没有c  key
			if (map.containsKey(c)) { // 左括号
				stack.push(c);
			} else { // 右括号
				if (stack.isEmpty()) return false;
				//( { [  get 对应的值 ) ] }  c是右括号了
				if (c != map.get(stack.pop())) return false;
			}
		}
		return stack.isEmpty();
    }

    //用系统的  自带的
	public boolean isValid1(String s) {
		Stack<Character> stack = new Stack<>();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') { // 左括号
				stack.push(c);
			} else { // 右括号
				if (stack.isEmpty()) return false;
				
				char left = stack.pop();
				if (left == '(' && c != ')') return false;
				if (left == '{' && c != '}') return false;
				if (left == '[' && c != ']') return false;
			}
		}
		return stack.isEmpty();
    }
	//查找 替换  不可变的字符串  非常耗费性能
	public boolean isValid2(String s) {
		while (s.contains("{}")
				|| s.contains("[]")
				|| s.contains("()")) {
			s = s.replace("{}", "");
			s = s.replace("()", "");
			s = s.replace("[]", "");
		}
		return s.isEmpty();
    }
    public boolean isValid3(String s){

		String[] strings = {};
		int length = strings.length;
		//数组 属性   字符串一个方法
		for (int i = 0; i < s.length(); i++) {

		}
		return  false;
	}
	
}
