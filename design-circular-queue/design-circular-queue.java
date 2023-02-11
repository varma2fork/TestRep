class MyCircularQueue {
    int head;
    int count;
    int max;
    int[] queue;
    
     private ReentrantLock queueLock = new ReentrantLock();

    public MyCircularQueue(int k) {
         queue = new int[k];
         max = k;
        head = 0;
        count = 0;
    }
    
    public boolean enQueue(int value) {
           queueLock.lock();
        try {
        if(!isFull()) {
            queue[(head + count)% max] = value;
        count++; 
            return true;
        } else {
            return false;
        }
        } finally {
      queueLock.unlock();
    }
    }
    
    public boolean deQueue() {
        if(!isEmpty()) {
        head = (head + 1)%max;
        count--;
         return true;
        } else {
            return false;
        }
    }
    
    public int Front() {
          if(count == 0) {
            return -1;
        }
       return queue[head];
    }
    
    public int Rear() {
        if(count == 0) {
            return -1;
        }
       return queue[(head+count-1)%max];
        
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == max;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */