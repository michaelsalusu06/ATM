# Java Console ATM & Transaction Tracker

A simple, interactive console-based ATM application built in Java. This project simulates essential banking operations including secure PIN authentication, real-time balance tracking, deposit and withdrawal validation, and a rolling transaction log.

## Features

* **PIN Authentication:** Secure access control using PIN verification method.
* **Balance Inquiry:** Real-time display of current account funds.
* **Deposit System:** Input-validated deposit functionality to prevent negative amounts.
* **Withdrawal System:** Checks for valid input amounts and prevents overdrawing beyond the available balance.
* **Rolling Transaction Log:** Uses a fixed-size array (`String[5]`) to store and display the 5 most recent deposits and withdrawals.
* **Interactive Console Menu:** Continuous `while` loop interface driven by user menu selections.

## Concepts Demonstrated

This project applies core Java fundamentals learned from Sololearn's *Introduction to Java* course:

* **Control Flow:** `while` loops, `for` loops, and `if-else` conditional branching.
* **Data Structures:** Fixed-size 1D Arrays (`String[]`) with index wrapping logic.
* **User Input Handling:** `java.util.Scanner` for handling strings and numeric types (`nextInt()`, `nextDouble()`).
* **Modular Design:** Custom `static` methods with return values (`CheckPin`).
* **Variable Operations:** Double-precision arithmetic (`+=`, `-=`) and logic checks (`&&`, `||`).

## Getting Started

### Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher installed on your machine.
* **IDE / Text Editor:** Visual Studio Code, Eclipse, or any terminal environment.

### Installation & Execution

1. **Clone or Download the Repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git)
   ```

2. **Navigate to the Project Folder:**
   ```bash
   cd YOUR_REPOSITORY_NAME
   ```

3. **Compile and Run:**
   * **In VS Code:** Open the folder, select `main.java`, and click **Run** above the `main` method.
   * **Via Terminal:**
     ```bash
     javac -d . main.java
     java ATM.main
     ```

## Program Usage Example

```text
Name: Alex
Pin: 1234

1.Check Balance
2.Deposit
3.Withdraw
4.Transaction History
5.Exit
Select Options: 2

Input your pin, type -1 to quit: 1234
Input the amount you want to deposit: 100
100.0 has been deposited
Your balance is now: 100.0
```
