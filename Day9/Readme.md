
# 📄 Count Digit Logic

**Purpose:**  
To count the total number of digits present in a number.

**Logic:**  
- Start with `count = 0`.
- Divide the number by `10` repeatedly.
- After each division, increment `count` by `1`.
- Stop when the number becomes `0`.
- The final value of `count` is the number of digits.

**Example:**  
For number `584`:
```
584 ÷ 10 → 58 → count = 1
58 ÷ 10 → 5 → count = 2
5 ÷ 10 → 0 → count = 3
```
Result: **3 digits**

