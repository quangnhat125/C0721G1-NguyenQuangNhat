package _04_oop_in_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
    }
//    public long getEndTime() {
//        return this.endTime;
//    }
    public void setEndTime(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        long startTime1 = getStartTime();
        long endTime1 = getEndTime();
        return endTime1 - startTime1;
    }
}
