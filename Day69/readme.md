
---

## 📘 Theory: Finding the Missing Number in an Array

### 🔹 Objective:

To find a **single missing number** in an array containing `n - 1` distinct integers from the range `1` to `n`.

---

### 🔹 Core Idea:

If we know the sum of the first `n` natural numbers, and we subtract the sum of the given array from it, the result will be the missing number.

---

### 🔹 Formula Used:

To find the sum of first `n` natural numbers:

```
Sum = n * (n + 1) / 2
```

---

### 🔹 Steps Involved:

1. Calculate the **expected total sum** from `1` to `n` using the formula.
2. Calculate the **actual sum** of the elements in the array using a loop.
3. Subtract the actual sum from the total sum to get the **missing number**.

---

### 🔹 Example:

For input array `{1, 2, 4, 5, 6}`
The expected sequence is from `1` to `6`
Expected total sum = `21`
Actual array sum = `18`
**Missing number = 21 - 18 = 3**

---

### 🔹 Efficiency:

* **Time Complexity:** O(n) — one pass through the array
* **Space Complexity:** O(1) — no extra space used

---
 