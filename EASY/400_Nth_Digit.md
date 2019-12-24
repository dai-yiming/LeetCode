# :books: [Nth Digit](https://leetcode.com/problems/nth-digit/)

### :star: Question

Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

--- 

### :car: Example
```
Input: 11
Output: 0
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
/*
假设我们要找第2886 个位 (就target数 是998，target bit 是8)
1~9, 10 ~ 99, 100 ~ 999
9个 910个 91010个
9bit 910*2 bit 9 * 10 * 10 * 3 bit

那么2886 - 9 - 9 * 10 * 2 = 2697 < 9*10*10*3 = 2700
那么target 就落在了区域3中( 100- 999 )

我们知道区域3 是由3bit的数组成的
所以target数是以 100 为起始数，(2697 - 1)/3 = 898 为100以后的数
target 数 = 100 + 898 = 998
(2697-1) % 3 = 2 就是 998 的target bit 
target bit = 998.charAt( 2 ) = 8;

解题思路
2886 = 9*1 + 90 * 2 + 2697
*/
public int findNthDigit(int n) {
    int start = 1;
    int len = 1;
    long base = 9;
    while( n > len * base ){    //判断n落在的区间
        n = n - len * (int)base;     
        len++;              //len 用来记录target 数的长度
        start *= 10;        //循环的时候不用，等会用来重组target 数
        base *= 10;
    }
    int target = start + (n - 1)/len;   //减1是因为start 自己算一个数，要把start 从计算中抠掉
    int reminder = (n - 1)%len;         //在target 中的位置
    return Character.getNumericValue( Integer.toString(target).charAt(reminder) );
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Nth Digit.
- Memory Usage: 33 MB, less than 5.05% of Java online submissions for Nth Digit.

---

### :pencil: [Explanation](https://leetcode.com/problems/nth-digit/discuss/88363/Java-solution)

1. find the length of the number where the nth digit is from
2. find the actual number where the nth digit is from
3. find the nth digit and return

---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.07.15
