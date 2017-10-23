import com.exceptions.StackException;

public class Demo {

	public static void main(String[] args) {

		try {
			MyStack stack = new MyStack(2);
			stack.push(1);
			stack.pop();
			stack.pop();
			stack.pop();

		} catch (StackException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
