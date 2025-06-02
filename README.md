# 📚 Java Testing Project with JUnit & AssertJ

## 📄 Description – Exercise Overview

This repository includes a collection of Java exercises designed to practice unit testing using **JUnit** and **AssertJ**, as well as test-driven development (**TDD**). The project also uses **Maven** as a build tool and dependency manager. Each level progressively introduces more complex concepts, starting from basic assertions to full TDD cycles with a calculator implementation.

---

## 💻 Technologies Used

- ☕ Java 17+
- 🧪 JUnit 5
- ✅ AssertJ
- 🧰 Gradle (Project Management & Build Tool)
- 🖥️ IDE: IntelliJ IDEA

---

## 📋 Requirements

- Java JDK 17 or higher
- Maven 8.14.1 or higher
- Git
- IDE (e.g., IntelliJ)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/luriguso/Task_S1_04_Testing.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Task_s1_04_Testing
   ```

3. Open with your preferred IDE and let Gradle download dependencies.

---

## ▶️ Execution

To run tests:

```bash
gradle test
```

You can also run individual tests directly from your IDE (IntelliJ/Eclipse) by right-clicking the test class and selecting `Run`.

---

## 🌐 Deployment

This project is not intended for production deployment as it is focused on educational unit testing. However, it follows standard Maven structure, so it can be extended into any backend project.

---

## 🤝 Contributions

Contributions are welcome!

1. Fork the repository
2. Create a new branch:
   ```bash
   git checkout -b feature/NewFeature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add NewFeature"
   ```
4. Push the branch:
   ```bash
   git push origin feature/NewFeature
   ```
5. Open a Pull Request

---

## 🧪 Exercise Summary

### 🧩 Level 1 – JUnit Basics

#### 📘 Exercise 1: Book Collection
- Create a class to manage a collection of books.
- Methods to:
    - Add books
    - Get all books
    - Get book by position
    - Add book at a specific position
    - Remove book by title
- Tests:
    - Verify size and non-null list
    - Ensure correct order and no duplicates
    - Alphabetical order checks

#### 🧮 Exercise 2: DNI Calculator
- Class `DniCalculator` calculates letter based on numeric ID.
- Test is parameterized to validate logic with 10 predefined DNIs.

#### ❗ Exercise 3: ArrayIndexOutOfBoundsException
- Method that throws the exception intentionally.
- Unit test checks that exception is correctly triggered.

---

### 🧩 Level 2 – AssertJ

#### ✔️ Exercise 1: Integer Assertions
- Assert two integers are equal or not.

#### 🧍 Exercise 2: Object Reference Assertions
- Assert whether two object references are the same or different.

#### 🔢 Exercise 3: Array Assertions
- Assert that two integer arrays are identical.

#### 📋 Exercise 4: Mixed Object List
- Create an ArrayList of custom objects (e.g., Android, Iphone).
- Assertions to:
    - Check object order
    - Check objects in any order
    - Confirm a specific object appears only once

#### 🗺️ Exercise 5: Map Key Assertion
- Create a map and assert it contains a specific key.

#### 🧨 Exercise 6: Array Index Exception
- Trigger an `ArrayIndexOutOfBoundsException`.
- Use AssertJ to verify exception is thrown.

#### 🟦 Exercise 7: Optional Object
- Create an empty `Optional` object and assert it is indeed empty.

---

### 🧩 Level 3 – TDD (Test-Driven Development)

#### 🧮 Exercise 1: Calculator (TDD Approach)
- Start by writing tests for:
    - `sum`, `subtract`, `multication`, and `division`
- Implement only after tests are written.
- Refactor iteratively using red-green-refactor cycle.

---

## 🎯 Objectives

- Gain hands-on experience with **JUnit 5** and **AssertJ**.
- Learn how to write robust, testable Java code.
- Practice TDD principles by writing tests before implementation.
- Understand how to verify object behavior, exceptions, collections, and more using assertions.

---

Happy Coding! 🚀