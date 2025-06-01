 
---

**Rotated Matrix (90° Clockwise Rotation)**

We are given a square matrix (for example, 3x3) and we want to rotate it by 90 degrees clockwise.

In a 90° clockwise rotation, the element at position `(i, j)` in the original matrix moves to position `(j, n - 1 - i)` in the rotated matrix, where `n` is the size (number of rows/columns).

For example, for the matrix:

```
1 2 3
4 5 6
7 8 9
```

After rotating 90° clockwise, it becomes:

```
7 4 1
8 5 2
9 6 3
```

**Steps to rotate the matrix:**

1. Create a new empty matrix of the same size.
2. For each element `m[i][j]` in the original matrix, place it at position `rotated[j][n - 1 - i]` in the rotated matrix.
3. After filling all positions, the rotated matrix is complete.

**Example in JavaScript:**

* We can create the rotated matrix using loops or array functions.

* A common method is to first create a blank matrix using:

  ```
  let rotated = Array.from({ length: n }, () => Array(n).fill(0));
  ```

  This makes sure we have space ready to assign new values.

* Then, using two loops over `i` and `j`, we place the original values into the rotated positions.

This method works for square matrices (same number of rows and columns).
For non-square matrices, the logic needs to be adjusted.

---

 
 
