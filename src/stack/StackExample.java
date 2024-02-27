package stack;

import java.util.List;
import java.util.Stack;

public class StackExample 
{
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(10);// add the element in the stack..
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack);
		System.out.println(stack.peek());// to find the topmost of the element on the stack..
		System.out.println(stack.pop());//remove the element in the stack..
		System.out.println(stack);
		System.out.println(stack.search(60));//
		System.out.println(stack.empty());

		
	}

}
