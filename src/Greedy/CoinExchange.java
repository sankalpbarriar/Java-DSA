package Greedy;

import java.util.Arrays;

public class CoinExchange {
    public static void main(String[] args) {
        int amount = 27;
        Integer[] coins = {10, 5, 1};
        int res = 0;

        // Sorting in descending order
        Arrays.sort(coins, (a, b) -> b - a);

        int amt = amount;
        for (int i = 0; i < coins.length && amt > 0; i++) {
            int pick = coins[i];
            while (amt >= pick) {
                amt -= pick;
                res++;
            }
        }
        System.out.println(res);
    }
}
