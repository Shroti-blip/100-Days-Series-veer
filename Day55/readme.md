<!-- Butterfly pattern -->
 

### 📚 **Theory: Star Butterfly Pattern**

---

#### 🔹 **Definition:**

The **Star Butterfly Pattern** is a symmetrical output pattern printed using stars (`*`) that resembles both a **star shape** and a **butterfly structure**. It is commonly printed using nested loops in programming languages like C++, Java, or Python.

---

#### 🔹 **Pattern Structure:**

The pattern consists of two symmetrical halves:

* **Upper Half**: Stars increase from top to middle.
* **Lower Half**: Stars decrease symmetrically, forming a butterfly-like shape.

Each line contains:

* Left stars (`i` stars in increasing order),
* Center spaces (`2*(n-i)` spaces),
* Right stars (`i` stars mirroring the left side).

---

#### 🔹 **Example (n = 5):**

```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

---

#### 🔹 **Logic Breakdown:**

Let `n` be the number of rows in each half:

* **Upper Part** (from `i = 1` to `n`):

  * Print `i` stars
  * Print `2*(n - i)` spaces
  * Print `i` stars

* **Lower Part** (from `i = n` down to `1`):

  * Same logic as upper part to maintain symmetry

---

#### 🔹 **Algorithm Steps:**

1. Loop from `1` to `n`:

   * Print `i` stars
   * Print `2*(n - i)` spaces
   * Print `i` stars
2. Loop from `n` to `1`:

   * Repeat the same to mirror the upper half

---

#### 🔹 **Use Cases:**

* Learning nested loop structures
* Understanding symmetric pattern logic
* Practice with spacing and formatting in output
* Competitive programming warm-ups
 