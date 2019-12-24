# :books: [First Bad Version](https://leetcode.com/problems/first-bad-version/)

### :star: Question

- You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
- Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
- You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

--- 

### :car: Example
```
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
}
```

- Runtime: 10 ms, faster than 99.62% of Java online submissions for First Bad Version.
- Memory Usage: 33.1 MB, less than 100.00% of Java online submissions for First Bad Version.

---

### :pencil: Explanation

- Bisection search
- Avoid Overflow

---

### :computer: Complexity Analysis:

- Time complexity: O(log(n))
- Space complexity: O(1)

---

### :pen: Author

YIMING DAI - 2019.07.08
