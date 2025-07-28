# Employee-Salary-Management-System


This is a simple Java console application that manages employee details and calculates salaries based on designation and department. The project is designed as part of the **Tech Module 1** for **Wipro TalentNext java Full Stack**.

---

## 📌 Project Objective

The goal of this mini project is to:
- Accept an **employee ID** via command line.
- Search the employee in the predefined list.
- Display employee details including:
  - Name
  - Department
  - Designation (from code)
  - Final salary (based on DA, HRA, and IT)

---

## 💻 Technologies Used

- Java SE (Standard Edition)
- Command Line Interface (CLI)
- No external libraries

---

## 🗃️ Data Source

The application uses a hardcoded array to store employee records, including:

- Employee ID
- Name
- Join Date
- Designation Code
- Department
- Basic Salary, HRA, IT

A second mapping table is used to map Designation Code → Designation Name and Dearness Allowance (DA).

---

## 🧮 Salary Calculation Formula
Salary = Basic + HRA + DA - IT
