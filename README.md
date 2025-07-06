project:
  title: "🏦 Bank System OOP Project in Java"
  description: >
    This is a simple console-based Bank Management System developed using Java
    to demonstrate core Object-Oriented Programming (OOP) concepts in a real-world scenario.
    The system allows users to open and manage Savings and Current accounts with essential banking operations.

features:
  - "🔐 Open & close bank accounts"
  - "💰 Deposit & withdraw money"
  - "🏦 Support for Savings Account with interest"
  - "💳 Support for Current Account with overdraft facility"
  - "👤 View account information"
  - "💹 Apply interest (for savings accounts only)"

oops_concepts:
  - concept: "Abstraction"
    implementation: "Abstract class `BankService` defines bank operations"
  - concept: "Encapsulation"
    implementation: "Private fields in `Account` with controlled access"
  - concept: "Inheritance"
    implementation: "`SavingsAccount` and `CurrentAccount` inherit `Account`"
  - concept: "Polymorphism"
    implementation: "Method overriding like `withdraw()` and `displayAccountInfo()`"

run_instructions:
  ide: "Use any Java IDE like IntelliJ, Eclipse, or terminal"
  compile_command: "javac BankApp.java"
  run_command: "java BankApp"

future_improvements:
  - "🔐 Add login/PIN verification"
  - "💾 Store user data using file handling or databases"
  - "🌐 Convert to web-based version using Java + Spring Boot"
  - "🎨 GUI with JavaFX or Swing"

author:
  name: "Megha Venkattachalam"
  linkedin: "https://www.linkedin.com/in/meghasree-v"
  github: "https://github.com/your-username"

license:
  type: "MIT License"
  file: "LICENSE"
