# :books: [Binary Watch](https://leetcode.com/problems/binary-watch/)

### :star: Question

- A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
- Each LED represents a zero or one, with the least significant bit on the right.
- Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
- Note:
  - The order of output does not matter.
  - The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
  - The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".

--- 

### :car: Example
```
Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
```
---

### :hammer: Code

#### :coffee: Java Version - 1

```java
public class Solution {
    String[][] hour = {{"0"},  // hours contains 0 1's
                {"1", "2", "4", "8"},   // hours contains 1 1's
                {"3", "5", "6", "9", "10"},  // hours contains 2 1's
                {"7", "11"}};  // hours contains 3 1's
    String[][] minute = {{"00"},  // mins contains 0 1's
                        {"01", "02", "04", "08", "16", "32"},  // mins contains 1 1's
                        {"03", "05", "06", "09", "10", "12", "17", "18", "20", "24", "33", "34", "36", "40", "48"},  // mins contains 2 1's
                        {"07", "11", "13", "14", "19", "21", "22", "25", "26", "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"},  // mins contains 3 1's
                        {"15", "23", "27", "29", "30", "39", "43", "45", "46", "51", "53", "54", "57", "58"},  // mins contains 4 1's
                        {"31", "47", "55", "59"}};  // mins contains 5 1's
    public List<String> readBinaryWatch(int num) {
		List<String> ret = new ArrayList();
            // loop from 0 to 3 which is the max number of bits can be set in hours (4 bits)
		for (int i = 0; i <= 3 && i <= num; i++) {
            // this if condition is to make sure the index from minutes array would be valid
			if (num - i <= 5) {
                // if we have i 1's in hours, then we need n - i 1's in minutes, that's why the arrays were created by grouping the number of 1's bits
				for (String str1 : hour[i]) {
					for (String str2 : minute[num - i]) {
						ret.add(str1 + ":" + str2);
					}
				}
			}
		}
		return ret;     
    }
}
```

- Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Watch.
- Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Binary Watch.

### :bulb: C++ Version - 1

```cpp
class Solution {
public:
    vector<string> readBinaryWatch(int num) {
        vector<string> res;
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if (bitset<10>((h << 6) + m).count() == num) {
                    res.push_back(to_string(h) + (m < 10 ? ":0" : ":") + to_string(m));
                }
            }
        }
        return res;
    }
};
```


### :bulb: C++ Version - 2

```cpp
class Solution {
public:
    vector<string> readBinaryWatch(int num) {
        vector<string> res;
        vector<int> hour{8, 4, 2, 1}, minute{32, 16, 8, 4, 2, 1};
        for (int i = 0; i <= num; ++i) {
            vector<int> hours = generate(hour, i);
            vector<int> minutes = generate(minute, num - i);
            for (int h : hours) {
                if (h > 11) continue;
                for (int m : minutes) {
                    if (m > 59) continue;
                    res.push_back(to_string(h) + (m < 10 ? ":0" : ":") + to_string(m));
                }
            }
        }
        return res;
    }
    vector<int> generate(vector<int>& nums, int cnt) {
        vector<int> res;
        helper(nums, cnt, 0, 0, res);
        return res;
    }
    void helper(vector<int>& nums, int cnt, int pos, int out, vector<int>& res) {
        if (cnt == 0) {
            res.push_back(out);
            return;
        }
        for (int i = pos; i < nums.size(); ++i) {
            helper(nums, cnt - 1, i + 1, out + nums[i], res);
        }
    }
};
```

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: O(n)
- Space complexity: O(1) / O(n)

---

### :pen: Author

YIMING DAI - 2019.07.17
