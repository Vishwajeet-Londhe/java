package Leetcode;

public class GasStation134 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int diff = 0;    // total gas - total cost
        int res = 0;     // current tank gas
        int ans = 0;     // candidate starting index
        for(int i = 0; i < gas.length; i++) {
            diff += (gas[i] - cost[i]);
            res += (gas[i] - cost[i]);
            if(res < 0) {         // if can't reach station i+1
                res = 0;          // reset tank
                ans = i + 1;      // try starting from next station
            }
        }
        return (diff < 0) ? -1 : ans;
    }
}
