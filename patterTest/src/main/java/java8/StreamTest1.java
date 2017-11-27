package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamTest1 {
    static List<Integer> myList =new ArrayList<>();
    public static void main(String[] args){
        for(int i=0;i<500000;i++){
            myList.add(i);
        }
        int result = 0;
        long loopStartTime = System.currentTimeMillis();
        for (int i: myList){
            if(i%2==0){
                result+=i;
            }
        }
        long loopEndtime= System.currentTimeMillis();
        System.out.println(result);
        System.out.println("loop time: "+ (loopEndtime - loopStartTime));

        long streamStart = System.currentTimeMillis();
        System.out.println(myList.stream().filter(value -> value%2==0).mapToInt(Integer::intValue).sum());
        long streamEnd =System.currentTimeMillis();
        System.out.println("Stream time "+ (streamEnd -streamStart));

        long paralleStreamStartTime = System.currentTimeMillis();
        System.out.println(myList.parallelStream().filter(value -> value%2==0).mapToInt(Integer::intValue).sum());
        long paralleStreamEndTime = System.currentTimeMillis();
        System.out.println("parallel stream total time = "+(paralleStreamEndTime -paralleStreamStartTime));
    }

}
