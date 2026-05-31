# Banking Management System (Java Swing GUI)

## Project Overview

The **Banking Management System** is a desktop-based Java application developed using **Java Swing GUI** and **Object-Oriented Programming (OOP)** concepts.
The system allows users to perform banking operations such as:

* Customer Registration
* Deposit & Withdrawal
* Money Transfer
* Loan Management
* Transaction History Tracking
* Employee Management

This project demonstrates the practical implementation of:

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Exception Handling
* ArrayList Collections
* GUI Development using Swing

---

# Features

## 1. Customer Registration

Users can create new customer accounts with:

* Account Number
* Customer Name
* Initial Deposit Balance

---

## 2. Deposit Money

Customers can deposit money into their accounts.

### Validation:

* Deposit amount must be greater than 0

---

## 3. Withdraw Money

Customers can withdraw money from their accounts.

### Validation:

* Withdrawal amount must be positive
* Insufficient balance checking implemented

### Exception Used:

`InsufficientBalanceException`

---

## 4. Money Transfer

Transfer money between two customer accounts.

### Features:

* Sender balance deduction
* Receiver balance addition
* Transfer activity logging

### Validation:

* Same account transfer not allowed
* Insufficient balance checking

---

## 5. Loan Management

Customers can apply for loans.

### Loan Features:

* Loan Approval
* Interest Calculation
* Total Payable Amount Calculation
* Loan Information Display

---

## 6. Transaction History

Each customer has a complete transaction history including:

* Deposits
* Withdrawals
* Loan approvals
* Transfers

---

## 7. Employee Information

Employee data is managed using inheritance from the `person` superclass.

---

# Technologies Used

| Technology         | Purpose                   |
| ------------------ | ------------------------- |
| Java               | Core Programming Language |
| Java Swing         | GUI Development           |
| OOP Concepts       | System Design             |
| ArrayList          | Dynamic Data Storage      |
| Exception Handling | Error Management          |

---

# Object-Oriented Programming Concepts Used

## 1. Abstraction

Implemented using:

```java
abstract class person
```

The abstract class contains:

* Common properties
* Common methods
* Abstract `display()` method

---

## 2. Inheritance

Classes extending `person`:

```java
class Customer extends person
class employee extends person
```

---

## 3. Encapsulation

Private variables used:

```java
private int AccountNumber;
private String AccountHolder;
private double balance;
```

Access controlled through getter methods.

---

## 4. Polymorphism

Method overriding used:

```java
void display()
```

Different implementations in:

* Customer
* Employee

---

## 5. Exception Handling

Custom exception class:

```java
class InsufficientBalanceException extends Exception
```

Used for:

* Invalid withdrawals
* Invalid deposits
* Insufficient balance errors

---

# Project Structure

## Classes Used

### 1. person (Abstract Class)

Contains:

* Account Information
* Employee Information
* Balance Management Methods

---

### 2. Customer

Handles:

* Deposit
* Withdraw
* Transaction History
* Loan Application

---

### 3. Transaction

Handles:

* Money transfer between customers

---

### 4. Loan

Handles:

* Loan approval
* Interest calculation
* Total payable calculation

---

### 5. employee

Stores:

* Employee Name
* Employee Role

---

### 6. InsufficientBalanceException

Custom exception handling class.

---

### 7. driver

Main GUI class of the project.

Contains:

* Full banking interface
* Event handling
* User interactions

---

# GUI Sections

## Registration Panel

Used for:

* New customer registration

---

## Account Management Panel

Used for:

* Deposit
* Withdraw
* View account details

---

## Transfer Panel

Used for:

* Sending money between accounts

---

## Loan Management Panel

Used for:

* Loan approval
* Loan information viewing

---

## Activity Log Section

Displays:

* All banking operations
* System activities

---

# Sample Functionalities

## Deposit Example

```java
s.Deposite(5000);
```

---

## Withdraw Example

```java
s.withdraw(2000);
```

---

## Loan Example

```java
Loan loan = new Loan(101, 50000, 10.0);
loan.approveLoan();
```

---

# Exception Example

```java
throw new InsufficientBalanceException("Insufficient Balance");
```

---

# Future Improvements

Possible future upgrades:

* Database Integration (MySQL)
* ATM Simulation
* Online Banking
* Password Authentication
* Account Search System
* Interest-Based Savings Account
* Admin Dashboard
* File Handling
* Multi-user Login System

---

# How to Run the Project

## Step 1

Install:

* JDK 8 or higher
* VS Code / IntelliJ / NetBeans

---

## Step 2

Compile all Java files:

```bash
javac *.java
```

---

## Step 3

Run the project:

```bash
java driver
```

---

# Learning Outcomes

Through this project, the following concepts were learned:

* Java GUI Programming
* Event Handling
* Object-Oriented Design
* Exception Handling
* Banking System Logic
* Java Collections Framework

---

# Author

Developed as a Java OOP & GUI Project.

Course:
**CSE282.6 – Object Oriented Programming using Java**

---

# Conclusion

This Banking Management System is a complete Java GUI application demonstrating real-world banking operations using advanced OOP principles and Swing-based user interface design.

The project successfully integrates:

* Banking functionalities
* Exception handling
* Loan system
* Transaction tracking
* GUI-based interaction

making it an effective academic and practical Java project.
