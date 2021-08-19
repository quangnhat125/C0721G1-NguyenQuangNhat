package _04_oop_in_java.bai_tap;

import javafx.scene.paint.Stop;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++ ){
            array[i] = (int)(Math.random() * 1000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime();
//        int[] array = new int[1000000];
//        for (int i = 0; i < array.length; i++ ){
//            array[i] = (int)(Math.random() * 1000);
//        }
        array = selectionSort(array);
        stopWatch.setEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
    public static int[] selectionSort (int[] array) {
        for (int i =0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[j] < array[i]) {
                       int temp = array[i];
                       array[i] = array[j];
                       array[j] = temp;
                }
            }
        }
        return array;
    }
}
