
---

# ♟️ Checkerboard Pattern in Java – README (Theory Only)

## 📌 Overview

The **Checkerboard Pattern** (also known as a chessboard pattern) is a square matrix layout where cells alternate between filled (`*`) and empty (`space`) blocks in a grid-like structure. This Java program generates a checkerboard of size `n x n`, based on user input.

---

## 🧠 Concept Behind the Checkerboard Pattern

The core idea is to **alternate characters** in a square pattern based on the position `(i, j)`:

* If the **sum of the row index and column index** is even, place a `*`.
* If the sum is odd, place a space (`"  "`) to maintain spacing.

This creates a **black-and-white checker-like effect** similar to a chessboard.

---

## 🔍 Logic Breakdown

### ✅ Key Components:

* **Outer Loop (`i`)**: Iterates through rows.
* **Inner Loop (`j`)**: Iterates through columns for each row.
* **Condition**:

  ```java
  if((i + j) % 2 == 0)
  ```

  * If true: print `"* "` (star + space).
  * Else: print `"  "` (two spaces).

### 📌 Space Alignment:

* Two spaces (`"  "`) are used instead of one to ensure that stars in adjacent columns align vertically and form perfect boxes.

---

## 📥 Sample Input:

```
Enter the size of Checkerboard : 5
```

## 📤 Sample Output:

```
*   *   *  
  *   *   *
*   *   *  
  *   *   *
*   *   *  
```

---

## 💡 Why Practice This Pattern?

* Sharpens understanding of **modulus (%)** and **index-based logic**.
* Enhances control over **nested loops** and **pattern alignment**.
* Great introduction to **grid-based logic**, useful in game development and matrix operations.

---
