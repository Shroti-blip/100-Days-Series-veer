
---

## 📘 README: Alphabet Palindromic Pattern in Java

### 🔹 Program Purpose:

This Java program prints a **palindromic pyramid pattern using alphabets**, where each row mirrors the alphabet sequence to form a symmetric shape. The total number of rows is user-defined.

---

### 🔹 Pattern Description:

For input `rows = 5`, the output looks like:

```
        A 
      A B C 
    A B C D E 
  A B C D E F G 
A B C D E F G H I 
```

### 🔹 How it Works:

* Each row starts with **spaces** to center-align the pyramid.
* Then it prints an **increasing sequence of alphabets** starting from `'A'` up to `i` characters.
* After that, it continues printing the **next set of alphabets**, again starting from the next alphabet after the last used, making it **non-repeating** and **palindromic by structure** (not by content).

> Note: Unlike a true mirrored palindrome (like `A B C B A`), this program keeps incrementing characters and does **not reuse** earlier characters.

---

### 🔹 Logic Breakdown:

For each row `i` from `1` to `rows`:

1. **Spaces:** Print `2 * (rows - i)` spaces (each `"  "` is two characters wide) to center the row.
2. **Left Side:** Print `i` alphabets starting from `'A'`, using `ch++` each time.
3. **Right Side:** Continue printing the next `(i - 1)` alphabets (again with `ch++`).

---

### 🔹 Key Concepts Used:

* Nested `for` loops
* Character data type and manipulation (`char ch = 'A'; ch++`)
* Pattern alignment using spaces
* Scanner class for user input

---

### 🔹 Learning Outcomes:

* Understand character handling in Java
* Practice of symmetric patterns using nested loops
* Grasp how to structure and center a pyramid-style output

---

