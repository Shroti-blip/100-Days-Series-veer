
---

## 📘 Print Perfect Square Numbers from 1 to N — Java Program

### 🔍 **What the Program Does:**

This Java program prints all the **perfect square numbers** from 1 up to a user-defined number `N`.

A **perfect square** is a number that is the square of an integer.
For example: `1 (1×1), 4 (2×2), 9 (3×3), 16 (4×4), ...`

---

### 🧠 **Logic Explanation:**

Instead of checking every number between 1 and N, the program:

* Iterates from `i = 1` to `i*i <= N`
* In each step, calculates `i*i` and prints it

This is more efficient because:

* We only loop until the square exceeds `N`
* No need to check or filter numbers manually

---

### 💻 **Sample Output:**

```
Enter the value of N : 30
Perfect Square Number between 1 and 30+ :

1 4 9 16 25 
```

These are the perfect squares ≤ 30:

* 1 (1×1)
* 4 (2×2)
* 9 (3×3)
* 16 (4×4)
* 25 (5×5)

---

### 🔧 **How the Program Works:**

1. Takes user input `N` using `Scanner`
2. Calls `getPrintPerfectSquareNumber(n)`
3. Loops from `i = 1` to `i*i ≤ n`
4. Prints each perfect square `i*i`

---

### ✅ **Why This Program Is Useful:**

* Helps beginners understand **loops**, **conditions**, and **square math**.
* Efficient way to generate perfect squares (not brute force).
* Can be extended to:

  * Print square roots
  * Check if a given number is a perfect square

---

### 🧾 BONUS: Edge Case Handling (Optional)

To make the program stronger, you can:

* Check if `n` is positive before running the loop
* Handle invalid inputs

---
 