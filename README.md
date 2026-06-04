# Smart Expense Tracker

A simple and user-friendly **Java Swing-based Expense Management Application** that helps users record, manage, and track their daily expenses. The application allows users to add expenses, categorize them, delete selected entries, clear all records, and view the total amount spent in real time.

---

## Overview

The Smart Expense Tracker is a desktop application built using Java Swing. It provides an easy way to manage daily expenses through a graphical user interface and automatically calculates the total expenditure based on the entered records.

---

## Features

* Add new expenses with amount and category
* Categorize expenses into:

  * Food
  * Travel
  * Shopping
  * Bills
  * Entertainment
  * Other
* Delete selected expense entries
* Clear all expense records with confirmation
* Automatically calculate and display total expenses
* Simple and interactive graphical user interface using Java Swing

---

## Technologies Used

* Java
* Swing (GUI Framework)
* AWT Event Handling
* JTable
* DefaultTableModel

---

## Project Structure

```text
SmartExpenseTracker.java
```

The entire application is implemented in a single Java file containing:

* GUI Components
* Event Handling
* Expense Management Logic
* Table Management

---

## How to Run

### Prerequisites

* Java Development Kit (JDK 8 or above)
* Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or Command Prompt

### Compile

```bash
javac SmartExpenseTracker.java
```

### Run

```bash
java SmartExpenseTracker
```

---

## Application Workflow

1. Enter the expense amount.
2. Select an expense category.
3. Click **Add Expense**.
4. The expense is added to the table.
5. The total expense amount is updated automatically.
6. Users can:

   * Delete selected expenses
   * Clear all expenses
   * Monitor total spending

---

## User Interface Components

| Component  | Purpose                           |
| ---------- | --------------------------------- |
| JTextField | Enter expense amount              |
| JComboBox  | Select expense category           |
| JTable     | Display expense records           |
| JButton    | Add, Delete, and Clear operations |
| JLabel     | Display total expense amount      |

---

## Expense Categories

```text
Food
Travel
Shopping
Bills
Entertainment
Other
```

---

## Key Concepts Demonstrated

* Java Swing GUI Development
* Event-Driven Programming
* JTable Operations
* Data Validation
* Dynamic UI Updates
* Object-Oriented Programming (OOP)

---

## Screenshot

Add a screenshot of the application here:

```text
screenshots/expense-tracker.png
```

Example:

```markdown
![Smart Expense Tracker](screenshots/expense-tracker.png)
```

---

## Future Enhancements

* Save expenses to a database
* Export expense reports to Excel or PDF
* Add expense date and description
* Monthly and yearly expense summaries
* Expense category charts and analytics
* Search and filter functionality
* User login and authentication

---

## Educational Purpose

This project demonstrates:

* Java Swing GUI programming
* Event handling using ActionListener
* Table management using JTable
* Basic expense tracking logic

It is suitable for students learning Java desktop application development.

---

## Author

**Karan Prajapati**


---

## License

This project is open-source and available under the MIT License.
