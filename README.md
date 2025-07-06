# 🏦 Bank System OOP Project in Java

This is a simple **console-based Bank Management System** developed using **Java** to demonstrate core **Object-Oriented Programming (OOP)** concepts in a real-world scenario. The system allows users to open and manage Savings and Current accounts with essential banking operations.

---

## 🚀 Features

- 🔐 Open & close bank accounts  
- 💰 Deposit & withdraw money  
- 🏦 Support for Savings Account with interest  
- 💳 Support for Current Account with overdraft facility  
- 👤 View account information  
- 💹 Apply interest (for savings accounts only)  

---

## 🧠 OOPS Concepts Used

| Concept         | Implementation                                             |
|-----------------|------------------------------------------------------------|
| **Abstraction** | Abstract class `BankService` defines bank operations       |
| **Encapsulation** | Private fields in `Account` with controlled access        |
| **Inheritance** | `SavingsAccount` and `CurrentAccount` inherit `Account`     |
| **Polymorphism** | Method overriding like `withdraw()` and `displayAccountInfo()` |

---

## 💻 How to Run

- 💻 **IDE**: Use any Java IDE like IntelliJ, Eclipse, or terminal  
- 🔧 **Compile Command**:
  ```bash
  javac BankApp.java

