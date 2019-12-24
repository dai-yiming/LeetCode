# :books: [Tenth Line](https://leetcode.com/problems/tenth-line/)

### :star: Question

- Given a text file file.txt, print just the 10th line of the file.

--- 

### :car: Example
```
- Assume that file.txt has the following content:

Line 1
Line 2
Line 3
Line 4
Line 5
Line 6
Line 7
Line 8
Line 9
Line 10

- Your script should output the tenth line, which is:
Line 10
```
---

### :hammer: Code

#### :whale: Bash Version - 1

```bash
# Read from the file file.txt and output the tenth line to stdout.
index=0
while read line && [ $index -le 10 ]; do
    let 'index = index + 1'
    if [ $index -eq 10 ]; then
        echo $line
        exit 0
    fi
done < file.txt
```

- Runtime: 4 ms, faster than 86.01% of Bash online submissions for Tenth Line.
- Memory Usage: 3.8 MB, less than 9.45% of Bash online submissions for Tenth Line.

#### :tropical_fish: Bash Version - 2

```bash
awk 'NR == 10' file.txt
```

- Runtime: 0 ms, faster than 100.00% of Bash online submissions for Tenth Line.
- Memory Usage: 3.8 MB, less than 12.90% of Bash online submissions for Tenth Line.

#### :dolphin: Bash Version - 3

```bash
tail -n+10 file.txt | head -1
```

- Runtime: 4 ms, faster than 86.01% of Bash online submissions for Tenth Line.
- Memory Usage: 3.6 MB, less than 84.60% of Bash online submissions for Tenth Line.

---

### :pencil: Explanation



---

### :computer: Complexity Analysis:

- Time complexity: 
- Space complexity: 

---

### :pen: Author

YIMING DAI - 2019.06.30
