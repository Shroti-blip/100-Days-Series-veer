 
---

## 📘 Binary Search – Theory

**Binary Search** is an efficient algorithm used to find the position of a target element (called `key`) in a **sorted array**. It works on the principle of **divide and conquer**.

### 💡 How It Works:

1. Start with two pointers – one at the beginning (`left`) and one at the end (`right`) of the array.
2. Find the middle index:
   `mid = left + (right - left) / 2`
3. Compare the middle element (`arr[mid]`) with the target key:

   * If `arr[mid] == key`: the element is found, return the index.
   * If `arr[mid] < key`: discard the left half by updating `left = mid + 1`.
   * If `arr[mid] > key`: discard the right half by updating `right = mid - 1`.
4. Repeat steps 2 and 3 until the key is found or the search space becomes empty (`left > right`).

### 🧠 Key Points:

* **Time Complexity:** O(log n) – because the array is halved in each step.
* **Space Complexity:** O(1) – iterative approach uses no extra space.
* **Precondition:** The array **must be sorted** in ascending order.
* Efficient for large datasets where linear search (O(n)) would be slow.

### ✅ Example:

For array: `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`
To find key = `6`, binary search will locate it at index `5` in just a few steps.

---
 