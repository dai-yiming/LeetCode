# :books: [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

### :star: Question

- Say you have an array for which the ith element is the price of a given stock on day i.
- If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
- Note that you cannot sell a stock before you buy one.

---

### :car: Example
```
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
}
```

---

### :pencil: [Explanation](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/)

---

### :pen: Author

YIMING DAI - 2019.06.25
