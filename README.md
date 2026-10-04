# 💰 Loan Banking Application (Java)

## 📌 Project Overview

This is a **console-based Loan Banking Application** developed using **Core Java** concepts.
The project demonstrates how banking systems validate user details and determine loan eligibility based on conditions like salary, age, and CIBIL score.

The application supports different loan types such as:

* 🏠 Home Loan
* 💳 Personal Loan

---

## 🎯 Objective

To implement **Object-Oriented Programming (OOP)** concepts like:

* Inheritance
* Method Reusability
* Input Validation
* Basic Business Logic (Loan Eligibility)

---

## 🚀 Features

### 👤 Customer Validation

* Phone number validation using Regex
* Aadhaar validation
* PAN card validation

### 🏦 Loan Processing

* Capture customer details (Name, Age, Salary)
* Check CIBIL score
* Decide loan eligibility

### 💸 Loan Types

* Home Loan eligibility rules
* Personal Loan eligibility rules
* Dynamic Interest Rate calculation based on CIBIL

---

## 🧰 Technologies Used

* Java (Core Java)
* OOP Concepts (Inheritance, Methods)
* Regex (for validation)
* Scanner class (User Input)

---

## 🏗️ Project Structure

```id="loanstr01"
com.inheritance
│
├── Loan.java          // Parent class (common functionalities)
├── PersonalLoan.java // Child class
├── HomeLoan.java     // Child class
```

---

## ⚙️ How It Works

1. User enters:

   * Phone number
   * Aadhaar number
   * PAN card

2. If validation is successful:

   * Enter Name, Age, Salary
   * Enter CIBIL Score

3. System checks:

   * Salary criteria
   * Age limit
   * CIBIL score

4. Displays:

   * ✅ Eligible / ❌ Not Eligible
   * 💰 Interest Rate

---

## 📊 Eligibility Criteria (Example)

### 🏠 Home Loan

* Salary ≥ 6 LPA
* Age: 21 – 60
* CIBIL: 300 – 900

### 💳 Personal Loan

* Salary ≥ 7 LPA
* Age: 21 – 55
* CIBIL: 300 – 900

---

## 🔐 Validation Patterns

* 📱 Phone: `^[6-9][0-9]{9}$`
* 🆔 Aadhaar: `^[2-9][0-9]{11}$`
* 🪪 PAN: `^[A-Z]{5}[0-9]{4}[A-Z]$`
