# :books: [Valid Phone Numbers](https://leetcode.com/problems/valid-phone-numbers/)

### :star: Question

- Given a text file file.txt that contains list of phone numbers (one per line), write a one liner bash script to print all valid phone numbers.
- You may assume that a valid phone number must appear in one of the following two formats: (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means a digit)
- You may also assume each line in the text file must not contain leading or trailing white spaces.

--- 

### :car: Example
```
- Assume that file.txt has the following content:
987-123-4567
123 456 7890
(123) 456-7890
- Your script should output the following valid phone numbers:
987-123-4567
(123) 456-7890
```
---

### :hammer: Code

#### :coffee: Bash Version - 1

```bash
# Read from the file file.txt and output all valid phone numbers to stdout.
egrep '^(\([0-9]{3}\)\ |[0-9]{3}-)[0-9]{3}-[0-9]{4}$' "file.txt"
```

- Runtime: 0 ms, faster than 100.00% of Bash online submissions for Valid Phone Numbers.
- Memory Usage: 3 MB, less than 99.92% of Bash online submissions for Valid Phone Numbers.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.06.30
