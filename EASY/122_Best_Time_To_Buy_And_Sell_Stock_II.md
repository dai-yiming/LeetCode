# :books: [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/)

### :star: Question

- Say you have an array for which the ith element is the price of a given stock on day i.
- Design an algorithm to find the maximum profit. 
- You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
- Note that You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

---

### :car: Example
```
Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
// Refer-Beat 99.98% !!
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            while (i < prices.length - 1 && prices[i + 1] <= prices[i])
                i++;
            int min = prices[i++];
            while (i < prices.length - 1 && prices[i + 1] >= prices[i])
                i++;
            profit += i < prices.length ? prices[i++] - min : 0;
        }
        return profit;
    }
}

// Refer-Best. Same ideas as me :-)
class Solution {
    public int maxProfit(int[] prices) {
        // Thought: whenever finding the next day > prev day,  buy prev and sell next
        // max profit = sum of all (sell-buy)s
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i])
                total += prices[i + 1] - prices[i];
        }
        return total;
    }
}
```


---

### :pencil: [Explanation](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solution/)

---

### :pen: Author

YIMING DAI - 2019.06.25
