
---

### 📘 README-style Theory: Alphabet Inverted Pyramid Pattern in Java

#### 🔹 Program Purpose:

This Java program prints an **inverted pyramid** pattern using **uppercase English alphabets** starting from 'A'. The number of rows is based on user input.

### ✅ Sample Output

**If the user enters `5`:**

```
A B C D E 
A B C D 
A B C 
A B 
A 
```
---

#### 🔹 Pattern Logic:

* The outer loop runs from `rows` down to `1`, reducing one row each time (for the inverted shape).
* For each row:

  * The character `ch` is initialized to `'A'`.
  * Inner loop runs from `1` to `i`, printing characters from `A` onwards.
  * After printing each character, `ch` is incremented using `ch++`.

#### 🔹 Example:

If `rows = 4`, the output will be:

```
A B C D 
A B C 
A B 
A 
```

#### 🔹 Concepts Used:

* Loops (`for`)
* Character manipulation (`char ch = 'A';`, `ch++`)
* Scanner for user input

#### 🔹 Applications:

* Learning nested loops
* Understanding character printing
* Pattern-based coding interview questions

---


