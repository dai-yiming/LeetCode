# :books: [Count Primes](https://leetcode.com/problems/count-primes/)

### :star: Question

Count the number of prime numbers less than a non-negative number, n.

--- 

### :car: Example
```
Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public int countPrimes(int n) {
   boolean[] isPrime = new boolean[n];
   for (int i = 2; i < n; i++) {
      isPrime[i] = true;
   }
   // Loop's ending condition is i * i < n instead of i < sqrt(n)
   // to avoid repeatedly calling an expensive function sqrt().
   for (int i = 2; i * i < n; i++) {
      if (!isPrime[i]) continue;
      for (int j = i * i; j < n; j += i) {
         isPrime[j] = false;
      }
   }
   int count = 0;
   for (int i = 2; i < n; i++) {
      if (isPrime[i]) count++;
   }
   return count;
}
```

- Runtime: 9 ms, faster than 95.07% of Java online submissions for Count Primes.
- Memory Usage: 34.3 MB, less than 10.60% of Java online submissions for Count Primes.

---

### :pencil: [Explanation](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

- Except the simplest solution which will cost O(n^2) time complexity, let's improve it
- The number must not divide by number > `n / 2`
- For reverse/duplicate combination of multiples, the number must not divide by number > `sqrt(n)`
- If we have multiple i, we mark i^2 + multiples of i to be false (not prime numbers)

---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(log(log(n)))

---

### :pen: Author

YIMING DAI - 2019.07.01
