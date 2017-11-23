public class Demo implements IInt {
	public static void main(String[] args) {
		Demo s = new Demo();
		int j = s.thevalue;
		int k = IInt.thevalue;
		int l = thevalue;
	}
}

interface IInt {
	int thevalue = 0;
}