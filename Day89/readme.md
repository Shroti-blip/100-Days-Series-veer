 
---

# 🔢 Count Even and Odd Numbers in an Array

## 📌 Description

This Java program counts how many **even** and **odd** numbers are present in a user-defined array.

---

## 📚 Theory

### 🔹 What is an Even Number?

An even number is any integer divisible by 2 with no remainder.
For example: 2, 4, 6, 10, etc.
Mathematically:
`number % 2 == 0` → Even

### 🔹 What is an Odd Number?

An odd number is any integer that is **not** divisible by 2.
For example: 1, 3, 5, 9, etc.
Mathematically:
`number % 2 != 0` → Odd

---

## 🧠 Program Logic

1. The user inputs the size of the array and its elements.
2. The program iterates through each element of the array.
3. For each element:

   * If the element is divisible by 2 (`% 2 == 0`), it’s counted as **even**.
   * Otherwise, it’s counted as **odd**.
4. Finally, the total counts of even and odd numbers are displayed.

---

## 💡 Example

**Input:**

```
Enter the size of the array: 5
Enter the elements of the array:
10 5 8 3 6
```

**Output:**

```
Even Numbers : 3
Odd Numbers : 2
```

---
 