# 🏧 ATM Automation System

![Java](https://img.shields.io/badge/Language-Java-orange) ![OOP](https://img.shields.io/badge/Concept-OOP-blue)

A robust console-based ATM simulation system developed in Java. This project demonstrates the practical application of **Object-Oriented Programming (OOP)** principles to handle secure banking transactions efficiently.

## 🚀 Overview

The ATM System allows users to perform essential banking operations through a user-friendly command-line interface. It focuses on data integrity and secure transaction processing, ensuring that operations like withdrawals do not exceed account balances.

## 🛠 Technical Highlights

This project is built with a focus on modularity and clean code:

* **Encapsulation:** Sensitive data (like account balance and PIN) is protected using private fields and accessed only through secure public methods.
* **Input Validation:** The system prevents invalid inputs (e.g., negative deposits) to ensure data consistency.
* **Control Flow:** Utilizes efficient logical structures (`switch-case`, `do-while` loops) to manage the user menu and session lifecycle.
* **Class Structure:** Designed with separation of concerns in mind (separating the logic of the *Account* from the *Main* execution flow).

## ✨ Key Features

* 🔐 **Secure Authentication:** PIN-based user login system.
* 💰 **Balance Inquiry:** Real-time view of available funds.
* 📥 **Deposit System:** Safe addition of funds to the account.
* 📤 **Withdrawal System:** Logic-checked withdrawal (prevents overdrafts).
* 🔄 **Interactive Menu:** Continuous operation loop until the user decides to exit.

## 💻 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/hallbrahmelk/ATM-System.git](https://github.com/hallbrahmelk/ATM-System.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd ATM-System
    ```
3.  **Compile and Run:**
    Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, VS Code) and run the `Main` class.

## 🔮 Future Improvements

* Adding a Graphical User Interface (GUI) with JavaFX.
* Integrating a database (SQL) for persistent data storage.
* Multi-user support with transaction history logs.

---
*Developed by [Halil Ibrahim Celik /hallbrhmelk]*
