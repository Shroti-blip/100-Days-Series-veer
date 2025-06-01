 

### **Matrix Multiplication Basics**

Given two matrices:

* Matrix A of size `m × n`
* Matrix B of size `n × p`

The result matrix C will be size `m × p`.

To compute each entry `C[i][j]`:

```
C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ... + A[i][n-1]*B[n-1][j]
```

**Example:**

```
A (2×3)         B (3×2)
[1 2 3]         [1 2]
[4 5 6]         [3 4]
                [5 6]

Result C (2×2):
[
  [1*1 + 2*3 + 3*5, 1*2 + 2*4 + 3*6],
  [4*1 + 5*3 + 6*5, 4*2 + 5*4 + 6*6]
]
```

---

### **Naive Algorithm**

* Use three nested loops:

  * Loop over `i` (rows of A)
  * Loop over `j` (columns of B)
  * Loop over `k` (common dimension)

Time Complexity → O(m × n × p)

---

### **Optimized Approaches**

✅ **1️⃣ Loop Order Optimization**
Even in the naive approach, changing loop order to fit **CPU cache better** can improve performance:

* Instead of `i → j → k`, some cases run faster with `i → k → j` or `j → i → k`.

✅ **2️⃣ Strassen’s Algorithm**
For square matrices (n × n), Strassen reduces time:

* Standard: O(n³)
* Strassen: O(n^2.807)
* Works by dividing matrices into blocks and doing fewer multiplications.

✅ **3️⃣ Block / Tiled Multiplication**
For **large matrices**, divide them into blocks that fit into the cache:

* Multiply smaller blocks one at a time.
* Great for improving real-world speed, even if asymptotic time stays the same.

✅ **4️⃣ Parallelization (Multi-core / GPU)**
Matrix multiplication is highly parallelizable:

* You can compute multiple `C[i][j]` entries at the same time.
* Libraries like **BLAS**, **NumPy**, **TensorFlow** use this under the hood.

✅ **5️⃣ Sparse Matrix Multiplication**
If matrices are **sparse** (lots of zeros), skip zero multiplications.

* Use compressed formats (like CSR or CSC).
* Only multiply nonzero values, cutting time from O(n³) to O(k), where `k` is nonzero count.

---

### **Summary Table**

| Method                     | Time Complexity          | When Useful                    |
| -------------------------- | ------------------------ | ------------------------------ |
| Naive 3-loop               | O(m × n × p)             | Small to medium dense matrices |
| Strassen’s Algorithm       | O(n^2.807)               | Large square matrices          |
| Block/Tiled Multiplication | O(m × n × p), but faster | Huge matrices, cache-optimized |
| Parallel/GPU Libraries     | Hardware-dependent       | Max speed on multi-core/GPU    |
| Sparse Multiplication      | \~O(k) (nonzero terms)   | Sparse data, graphs, networks  |

---
 
