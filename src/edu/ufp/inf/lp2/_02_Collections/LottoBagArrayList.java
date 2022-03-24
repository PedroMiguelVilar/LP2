package edu.ufp.inf.lp2._02_Collections;

import java.util.ArrayList;
import java.util.Random;

public class LottoBagArrayList {

    public static final int MIM_NUM = 1;
    public static final int MAX_NUM = 90;

    private ArrayList<Integer> bagInts = new ArrayList<>(MAX_NUM);
    private final Random rand = new Random();

    public int[] toIntArray(){
        int[] IntArray = new int[bagInts.size()];
        for (int i = 0; i < bagInts.size(); i++)
            IntArray[i] = bagInts.get(i);
        return IntArray;
    }


}
