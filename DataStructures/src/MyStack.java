import com.exceptions.StackException;

public class MyStack {

	private int stackSize;
	private int[] myStack;
	private int top;

	public MyStack() {
		this.stackSize = 10;
		this.top = -1;
		this.myStack = new int[stackSize];
	}

	public MyStack(int stackSize) throws StackException {
		setStackSize(stackSize);
		this.top = -1;
		this.myStack = new int[this.stackSize];
	}

	private void setStackSize(int stackSize) throws StackException {
		if (stackSize > 0) {
			this.stackSize = stackSize;
		} else {
			throw new StackException();
		}
	}

	public boolean isEmpty() {
		return this.top == -1 ? true : false;
	}

	public void push(int num) {
		if (this.myStack.length == (this.top + 1)) {
			int[] newStack = new int[this.myStack.length + (this.myStack.length / 2)];
			for (int i = 0; i < this.myStack.length; i++) {
				newStack[i] = this.myStack[i];
			}
			newStack[++top] = num;
			this.myStack = newStack;
			this.stackSize = myStack.length;
		} else {
			this.myStack[++top] = num;
		}
	}

	public int pop() throws StackException {
		if (this.top != -1) {
			return myStack[top--];
		} else {
			throw new StackException();
		}

	}

	public int peak() throws StackException {
		if (top != -1) {
			return myStack[top];
		} else {
			throw new StackException();
		}
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(myStack[i] + " ");
		}
	}
}
