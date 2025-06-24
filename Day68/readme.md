 
---

## 📘 README: Hourglass Pattern with Numbers in Java

### 🔹 Program Purpose:

This program prints an **hourglass-shaped pattern using numbers**. The pattern is symmetric vertically and formed by two mirrored number pyramids — one upright and one inverted.

---

### 🔹 Sample Output (`n = 5`):

```
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5 
      1 2 3 
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
```

---

### 🔹 Pattern Structure:

The hourglass is made of two parts:

#### 1️⃣ **Top (Inverted Pyramid)**:

* Rows go from `n` down to `1`.
* Spaces increase with each row.
* Numbers start from `1` to `2*i - 1`.

#### 2️⃣ **Bottom (Upright Pyramid)**:

* Rows go from `2` up to `n`.
* Spaces decrease with each row.
* Numbers again start from `1` to `2*i - 1`.

---

### 🔹 Logic Explanation:

* Outer loops (`for i`) control the number of rows in each part.
* Inner loop 1: Prints spaces → `n - i`
* Inner loop 2: Prints numbers from `1` to `2*i - 1` (makes it pyramid-like)

---

### 🔹 Key Concepts Used:

| Concept            | Purpose                            |
| ------------------ | ---------------------------------- |
| `for` loops        | Control rows and columns           |
| Nested loops       | Manage spaces and numbers          |
| Pattern symmetry   | Create hourglass shape             |
| `System.out.print` | For aligned output without newline |

---

### 🔹 Applications:

* Understanding nested loop behavior
* Practicing pattern-based logic
* Useful in coding interviews and loop-based exercises

---

 