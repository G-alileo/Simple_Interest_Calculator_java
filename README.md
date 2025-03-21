# Simple Interest Calculator (Java CLI)

## Overview

This is a **Java-based Command Line Interface (CLI) application** that calculates **Simple Interest** based on user input. The program provides a menu-driven interface for users to either start the calculator or exit the application. The implementation ensures proper input validation, exception handling, and efficient use of resources.

## Features

- Menu-based interface with user options.
- Calculates Simple Interest using the formula:

  \(\text{Simple Interest} = \frac{P \times R \times T}{100}\)

  where:
  - **P** = Principal Amount
  - **R** = Rate of Interest
  - **T** = Time (Years)
- Handles incorrect input using `InputMismatchException`.
- Uses a **single Scanner instance** to avoid resource leakage.
- Allows users to retry in case of invalid input.

## Prerequisites

- **Java Development Kit (JDK) 8+**
- A command-line terminal (Command Prompt, Terminal, or any Java IDE)

## Installation & Execution

1. **Clone the repository** or create a new Java file and copy the source code.
2. **Compile the program** using the command:
   ```sh
   javac Main.java
   ```
3. **Run the program** using:
   ```sh
   java Main
   ```

## Code Structure

### **Main.java**

- **`main()`**: Displays a menu and handles user input.
- **`LogicMethod(Scanner user_val)`**: Manages user input for principle, rate, and time, then calculates and displays Simple Interest.
- **`SimpleInterest(double principle, double rate, double time)`**: Computes and returns the Simple Interest.

## Example Usage

```sh
===========================================================================================
                Menu

        1. Start the calculator.
        2. Exit

Your choice : 1
===========================================================================================
                Welcome to the Simple Interest Calculator.
Enter the Principle : 1000
Enter your rate : 5
Enter your time in years : 2
===========================================================================================

                Results

        Principle = KSH 1000.0
        Rate = 5.0 %
        Time = 2.0 yr(s)
        Simple Interest = KSH 100.0
===========================================================================================
```

## Error Handling

- **Invalid Input Handling:** If a user enters non-numeric input, the program catches `InputMismatchException` and prompts the user again.
- **Safe Scanner Closure:** The program ensures that the `Scanner` instance is closed **only after the user exits**, avoiding `java.util.NoSuchElementException`.

## Future Enhancements

- Add **Compound Interest Calculation**.
- Implement a **GUI version using Java Swing or JavaFX**.
- Allow users to perform **multiple calculations in one session**.

## Author

- **[Jamespeter Murithi.]**

## License

This project is open-source and available under the **MIT License**.

