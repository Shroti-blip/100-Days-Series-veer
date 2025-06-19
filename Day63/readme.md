
---

# ⌛ Hourglass Star Pattern – Theory Only

## 📌 What is an Hourglass Pattern?

The **Hourglass Pattern** is a star (`*`) based pattern that visually resembles the shape of an hourglass or sand timer. It features an **inverted pyramid** on top and a **regular pyramid** at the bottom, both vertically aligned and joined at their tips, forming a symmetric figure.

---

## 🧠 Concept Behind the Hourglass Pattern

The Hourglass Pattern is typically created in **two parts**:

1. **Upper Half (Inverted Pyramid)**

   * The pattern starts with the maximum number of stars.
   * Each subsequent row has **one less star** than the previous.
   * **Spaces increase** to maintain symmetry.

2. **Lower Half (Regular Pyramid)**

   * The pattern continues with increasing stars.
   * Each row adds **one more star** than the one before.
   * **Spaces decrease** accordingly.

The pattern must maintain **center alignment**, which is achieved using spaces before the stars.

---

## ✅ Key Components

* **Total Rows**: Usually defined by an odd number (e.g., `n`), where `n` determines the height of the hourglass.
* **Outer Loop**:

  * First half: runs from 1 to `n/2 + 1` (top inverted triangle).
  * Second half: runs from `n/2 + 2` to `n` (bottom triangle).
* **Inner Loops**:

  * For spaces: Control left-padding to center-align the pattern.
  * For stars: Control the number of `*` to print per row.

---

## 🧩 Pattern Example (n = 5)

```
*****
 *** 
  *  
 *** 
*****
```

* The pattern is **symmetrical vertically**.
* The middle row contains only one star.
* Upper half decreases stars, lower half increases.

---

## 💡 Why Practice Hourglass Pattern?

* Enhances understanding of **nested loops**.
* Teaches **symmetry control** using spaces and stars.
* Strengthens ability to break down patterns into manageable parts.
* Common in **pattern-based coding interviews**.

---
 