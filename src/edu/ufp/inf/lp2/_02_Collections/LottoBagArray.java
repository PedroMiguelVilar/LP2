package edu.ufp.inf.lp2._02_Collections;

import java.util.ArrayList;
import java.util.Random;

public class LottoBagArray {
    
    public static final int MIM_NUM = 1;
    public static final int MAX_NUM = 90;
    
    private int[] bagInts = new int[MAX_NUM];

    public int getnumberRemainingBalls() {
        return numberRemainingBalls;
    }

    private int numberRemainingBalls;
    private final Random rand = new Random();

    public LottoBagArray(){
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i<MAX_NUM; i++){
            while(!addLottoNumber(rand.nextInt(MAX_NUM)+MIM_NUM))continue;
        }
    }
    
    public boolean addLottoNumber(int n){
        if(!containsLootNumber(n)){
            this.bagInts[this.numberRemainingBalls++]=n;
            return true;
        }
        return false;
    }
    
    public boolean containsLootNumber(int n){
        for (int i : bagInts){
            if(i == n)return true;
        }
        return false;
    }
    
    public int removeLottoNumberRandom(){
        int index = rand.nextInt(this.numberRemainingBalls);
        return removeLottoNumberAtIndex(index);
    }

    public int removeLottoNumberAtIndex(int index){

        if (index>=0 && index<numberRemainingBalls) {
            int element = bagInts[index];
            for (int i = index; i < numberRemainingBalls; i++) {
                bagInts[i] = bagInts[i+1];
            }
            bagInts[numberRemainingBalls--] = 0;
            numberRemainingBalls--;
            return element;
        }
        return -1;
    }

    public ArrayList<Integer>toIntergerArrayList(){
        ArrayList<Integer>IntegerArrayList = new ArrayList<>(numberRemainingBalls);
        for (int i = 0; i < numberRemainingBalls; i++){
            IntegerArrayList.add(bagInts[i]);
        }
        return IntegerArrayList;
    }

    public static void main(String[] args){

        LottoBagArray lottoBagArray = new LottoBagArray();


    }




}
