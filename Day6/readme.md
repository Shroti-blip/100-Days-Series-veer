# Armstrong Number Checker

This project implements a Java program to check whether a given number is an **Armstrong number**.

---

## 📚 What is an Armstrong Number?

An **Armstrong number** (also known as a narcissistic number) is a number that is equal to the sum of its digits raised to the power of the total number of digits.

### Example:

For the number `153`:
- It has **3 digits**.
- Sum of its digits raised to the power 3:  
  \( 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 \)  
- Since the result equals the original number, `153` is an Armstrong number.

---

## 🧠 How the Program Works

1. The program defines a number to check (`num`).
2. It calculates the number of digits using the `countDigits` method.
3. It computes the Armstrong value using the `calculateArmstrong` method:
   - Each digit is raised to the power of the total number of digits.
   - The results are summed up.
4. The program compares the calculated Armstrong value to the original number.
5. Based on the comparison, it prints whether the number is an Armstrong number.

---

## 📝 Code Explanation

### `countDigits(int num)`
- Counts the number of digits in the given number.

### `calculateArmstrong(int num)`
- Computes the Armstrong value by summing each digit raised to the power of the total number of digits.

### `main(String[] args)`
- Executes the program:
  - Defines the number to check.
  - Calls helper methods to calculate the Armstrong value.
  - Prints the result.

---

## 💻 Example Input and Output

### Input:
```java
static int num = 153; // Number to check
