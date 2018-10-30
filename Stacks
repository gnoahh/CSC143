package stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public StackTest() {
		Stack <Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(5);
		stack.push(8);
		stack.push(6);
		stack.push(3);
		
		Queue <Integer> queue = new LinkedList<Integer>();
		queue.add(1);	
		queue.add(2);		
		queue.add(3);		
		queue.add(4);		
		queue.add(5);		
		
		print(copyStack(stack));
		

	}
	public void mix(Stack<Integer> stack, Queue<Integer> queue) {
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
	
	public void printQueue(Queue<Integer> queue) {
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}
	public int max(Stack<Integer> stack) {
		int temp = 0;
		int currentValue = 0;
		while(!stack.isEmpty()) {
			temp = stack.pop();
			System.out.println(temp);
			if(temp > currentValue) {
				currentValue = temp;
			}
		}
		return currentValue;
	}
	public void print(Stack<Integer> stack) {
		while(!stack.isEmpty()) {
			System.out.print("\t" + stack.pop());
			
		}
	}
	public Stack<Integer> copyStack(Stack<Integer> stack){
	    Stack<Integer> CStack = new Stack<Integer>();
	    Queue<Integer> queue = new LinkedList<Integer>();
	    int temp;
	    while(!stack.isEmpty()){
	        queue.add(stack.pop());
	    }
	    while(!queue.isEmpty()){
	        temp = queue.remove();
	        CStack.push(temp);
	        
	    }
	    return CStack;
	}
	public static void main(String[] args) {
		new StackTest();

	}

}
