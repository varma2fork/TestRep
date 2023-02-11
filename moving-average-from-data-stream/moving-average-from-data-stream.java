class MovingAverage {
    int head=0;
    int count=0;
    int[] queue;
    int movAvg = 0;
    int size;
    public MovingAverage(int size) {
        this.size = size;
        queue = new int[size];
    }
    
    public double next(int val) {
        ++count;
        int tail = (head + 1)%size;
        movAvg = movAvg - queue[tail] + val;
        head = (head+1)%size;
        queue[head] = val;
        return movAvg * 1.0/Math.min(size,count);
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */