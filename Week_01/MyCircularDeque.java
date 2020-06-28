/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class MyCircularDeque {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int count;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        arr = new int[k];
        front = 0;
        rear = 1;
        capacity = k;
        count = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        arr[front] = value;
        front = (front - 1 + capacity) % capacity;
        count++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        count++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        count--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        int temp = (front + 1) % capacity;
        return (!isEmpty()) ? arr[temp] : -1;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        int temp = (rear - 1 + capacity) % capacity;
        return (!isEmpty()) ? arr[temp] : -1;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return count == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return count == capacity;
    }
}
