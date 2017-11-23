import com.exceptions.MyQueueException;

public class MyQueue {

	int[] muQueue;
	int length;
	int front;
	int rear;
	boolean isEmpty;
	boolean isTurnedCicle;

	public MyQueue(int length) throws MyQueueException {
		setLenth(length);
		this.muQueue = new int[this.length];
		this.front = 0;
		this.rear = 0;
		this.isEmpty = true;
	}

	private void setLenth(int length) throws MyQueueException {
		if (length > 0) {
			this.length = length;
		} else {
			throw new MyQueueException();
		}
	}

	public boolean isEmpty() {
		return this.isEmpty;
	}

	public void put(int value) {
		if (this.front == 0 && this.rear == this.length) {
			this.length += this.length / 2;
			int[] newQueue = new int[this.length];

			for (int i = 0; i < this.muQueue.length; i++) {
				newQueue[i] = this.muQueue[i];
			}

			this.muQueue = newQueue;
			this.muQueue[this.rear++] = value;
			this.isEmpty = false;
		} else {
			if ((this.front != 0 && this.front == this.rear) && this.isTurnedCicle) {
				int temp = 0;
				this.length += this.length / 2;
				int[] newQueue = new int[this.length];
				for (int i = 0; i < this.muQueue.length; i++) {
					if (this.front < this.muQueue.length) {
						newQueue[i] = this.muQueue[front++];
					} else {
						newQueue[i] = this.muQueue[temp++];
					}
				}
				this.rear = this.muQueue.length;
				this.front = 0;

				this.muQueue = newQueue;
				this.muQueue[this.rear++] = value;
				this.isEmpty = false;
				this.isTurnedCicle = false;
			} else {
				this.muQueue[this.rear++] = value;
				if (this.rear == this.length) {
					this.rear = 0;
					this.isTurnedCicle = true;
				}
				this.isEmpty = false;
			}
		}
	}

}
