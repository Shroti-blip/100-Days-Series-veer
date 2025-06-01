 
---

**Transposing a Matrix**

The **transpose** of a matrix is obtained by **flipping it over its diagonal** — meaning, we switch the row and column indices.

In simpler words:
If you have a matrix `A`, its transpose `Aᵗ` is formed by swapping each element `A[i][j]` with `A[j][i]`.

---

### Example

Original matrix:

```
1 2 3
4 5 6
7 8 9
```

Transpose:

```
1 4 7
2 5 8
3 6 9
```

Notice:

* The element at row 0, column 1 (which is `2`) moves to row 1, column 0.
* The element at row 2, column 0 (which is `7`) moves to row 0, column 2.

---

### Steps to transpose a matrix

1. **Start with a matrix** (can be square or rectangular).
2. **Create a new matrix** where the number of rows equals the number of columns of the original matrix and vice versa.
3. **For each element** in the original matrix at position `[i][j]`, place it in the new matrix at position `[j][i]`.

---

### Important Points

✅ For **square matrices** (same rows and columns), you can sometimes do the transpose **in-place** (without extra space), by swapping elements above the diagonal with those below.

✅ For **rectangular matrices** (different rows and columns), you need to create a new matrix because the shape changes.

✅ The transpose is commonly used in:

* Linear algebra
* Solving matrix equations
* Graphics transformations
* Machine learning (especially for aligning data shapes)

---

 
 
