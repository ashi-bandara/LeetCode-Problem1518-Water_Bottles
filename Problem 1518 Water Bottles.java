class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int exchBottles = numBottles;
        int fullBottles = numBottles;

        while(exchBottles>=numExchange){
            numBottles = exchBottles/numExchange;
            exchBottles = exchBottles % numExchange + numBottles;
            fullBottles = fullBottles + numBottles;
        }
        return fullBottles;
    }
}