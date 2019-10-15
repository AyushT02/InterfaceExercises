import java.util.*;

public class MyQueue implements Queue
{
    ArrayList<Integer> numList = new ArrayList<Integer>(6);
    public void add(int a1) {
        numList.add(a1);
    }
    public void remove(int a2) {
        numList.remove(a2);
    }
    public boolean isEmpty() {
        if(numList.size() == 0) {
            System.out.println("The queue is empty");
            return true;
        } else {
            return false;
        }
   
    }
    public void tooSmall() {
        if(numList.size() > 6) {
           ArrayList<Integer> numList2 = new ArrayList<Integer>(numList.size() * 2);
           numList2 = new ArrayList<>(numList);
        }
    }
}
