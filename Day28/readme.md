# 🔢 LCM (Least Common Multiple) Calculator

## 📘 What is LCM?

The **Least Common Multiple (LCM)** of two or more integers is the **smallest positive integer** that is **divisible by all** of the given numbers without leaving a remainder.

### Examples:
- LCM of `4` and `5` is `20`
- LCM of `6` and `8` is `24`

---

## 🧠 Logic Behind LCM Calculation

There are multiple methods to calculate the LCM:

### 1. **Using Formula with HCF (Most Efficient)**

This method combines the LCM and HCF relationship:

\[
\text{LCM}(a, b) = \frac{a \times b}{\text{HCF}(a, b)}
\]

#### Steps:
1. Calculate the **HCF (Highest Common Factor)** of the two numbers using the Euclidean algorithm.
2. Apply the formula above to find the LCM.

#### Example:
For `a = 12`, `b = 18`:
- HCF = 6
- LCM = \((12 × 18) / 6 = 216 / 6 = 36\)

---

### 2. **Prime Factorization Method**
This method involves factorizing each number into its prime factors:

#### Steps:
1. Factorize each number into prime factors.
2. Use the **highest power** of each prime factor found in any of the numbers.
3. Multiply them to find the LCM.

#### Example:
- `12 = 2² × 3`
- `18 = 2 × 3²`
- LCM = \(2² × 3² = 36\)

---

### 3. **Brute Force Method (Inefficient)**
This is a simpler but less efficient approach:

#### Steps:
1. Start from the larger of the two numbers.
2. Check successive multiples of the larger number until you find one that is divisible by both numbers.

#### Example:
Find LCM of `6` and `8`:
- Multiples of `8`: `8, 16, 24, 32...`
- Check divisibility: `24` is divisible by both `6` and `8`.

> **Note**: This method is not recommended for large inputs due to performance limitations.

---

## 📌 Use Cases
- Synchronizing time intervals
- Solving scheduling problems
- Applications in computer algorithms

---

## 🧾 Note
This project focuses on understanding and documenting the **theory and logic** behind LCM calculation. Code implementations may be included in future updates.
