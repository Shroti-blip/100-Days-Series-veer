 
---

### 📄 **README.md**

```markdown
# Rotate Matrix 90°

This project implements a program to rotate a square matrix by 90 degrees **clockwise**.

---

## 📚 What Does It Mean?

Rotating a matrix 90° clockwise means shifting:
```

Original → Rotated
\[1 2 3]    \[7 4 1]
\[4 5 6] →  \[8 5 2]
\[7 8 9]    \[9 6 3]

```

---

## 🧠 Logic

There are two common approaches:

---

### 🔹 **Approach 1: Using Extra Matrix**

1. Create a new matrix `rotated[n][n]`.
2. For each element:
```

rotated\[j]\[n - 1 - i] = matrix\[i]\[j];

```
3. Copy `rotated` back if needed.

---

### 🔹 **Approach 2: In-place Rotation (Without Extra Space)**

1. **Transpose the matrix** → swap across the diagonal:
```

matrix\[i]\[j] ↔ matrix\[j]\[i]

```
2. **Reverse each row**.

Example:
- After transpose:
```

\[1 4 7]
\[2 5 8]
\[3 6 9]

```
- After row reversal:
```

\[7 4 1]
\[8 5 2]
\[9 6 3]

```

---

## ✨ Output Example

```

Input:
1 2 3
4 5 6
7 8 9

Output after 90° rotation:
7 4 1
8 5 2
9 6 3

```

---

## 💻 Files

- `RotateMatrix90.java` (or `.py`, `.cpp`)

---

## 🔗 Applications

- Image rotation
- Computer graphics
- Data transformation

---

```

---

 