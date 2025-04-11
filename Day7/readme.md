


**GCD** stands for **Greatest Common Divisor**. It's the **largest positive number** that **divides two or more integers without leaving a remainder**.

### Example:
Let’s find the GCD of **12** and **18**.

- Factors of 12: 1, 2, 3, 4, 6, 12  
- Factors of 18: 1, 2, 3, 6, 9, 18  
- Common factors: 1, 2, 3, 6  
- **GCD = 6**

### Other Names:
- Also called **HCF (Highest Common Factor)**.



### Quick Method (Using Euclidean Algorithm):

```plaintext
gcd(a, b) = gcd(b, a % b)// swapping concept
```

Example: gcd(18, 12)
- gcd(18, 12) → gcd(12, 6)
- gcd(12, 6) → gcd(6, 0)
- Final answer = 6
