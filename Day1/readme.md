# Factorial Calculator

This project implements a Java program to calculate the **factorial** of a given number using an iterative approach.

---

## 📚 What is a Factorial?

The **factorial** of a non-negative integer `n` is the product of all positive integers less than or equal to `n`. It is denoted as \( n! \).

### Examples:
- \( 5! = 5 × 4 × 3 × 2 × 1 = 120 \)
- \( 3! = 3 × 2 × 1 = 6 \)
- \( 0! = 1 \) (By definition)

For negative numbers, the factorial is undefined.

---

## 🧠 How the Program Works

1. The program prompts the user to input a number.
2. The `getFactorial` method calculates the factorial:
   - If the number is 0 or 1, it returns 1.
   - If the number is negative, it returns `-1` to indicate an error.
   - Otherwise, it calculates the factorial iteratively using a `for` loop.
3. The calculated factorial is printed to the console.

---

## 📝 Code Explanation

### `getFactorial(int n)`
- **Input:** An integer `n`.
- **Output:**
  - Returns `1` for \( n = 0 \) or \( n = 1 \).
  - Returns `-1` for negative numbers.
  - Returns the factorial for positive integers.

### `main(String[] args)`
- Reads input from the user.
- Calls the `getFactorial` method to compute the factorial.
- Displays the result.

---

## 💻 Example Input and Output

### Input: 5

### Output: 120


---

## 🔗 Applications

- Used in combinatorics, permutations, and probability calculations.
- Commonly found in mathematical and programming problems.

---

## 🚀 How to Run

1. Copy the code into a file named `Factorial_java.java`.
2. Compile the program using:
   ```bash
   javac Factorial_java.java
   java Factorial_java



