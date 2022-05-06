package assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class Assignment4 {
    public class currentQueue<T> {
        Queue<T> que;
        public Object objLock = new Object();
        public currentQueue() {
            que = new LinkedList<>();
        }
        public void add(T data) {
            synchronized (objLock) {
                que.add(data);
            }
        }
        public T remove() {
            T data;
            synchronized (objLock) {
                data = que.remove();
            }
            return data;
        }
        public T peek() {
            T data;
            synchronized (objLock) {
                data = que.peek();
            }
            return data;
        }
        public boolean isEmpty() {
            synchronized (objLock) {
                return que.isEmpty();
            }
        }
    }
}
