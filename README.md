# Banking System

## Project Description

The Banking System is a Java console-based application developed using Object-Oriented Programming (OOP) concepts and the Java Collections Framework. It allows users to create bank accounts, deposit money, withdraw money, check balances, and view account details.

---

## Features

- Create Account
- Deposit Money
- Withdraw Money
- Check Balance
- View All Accounts
- Menu-Driven Console Application

---

## Technologies Used

- Java
- OOP Concepts
- Java Collections Framework (HashMap)

---

## OOP Concepts Implemented

### Class and Object
The `Account` class represents a bank account, and objects are created for each account.

### Encapsulation
Account details are stored in private variables and accessed through methods.

### Constructor
Constructors are used to initialize account objects.

### Methods
Methods are used to perform banking operations such as deposit, withdrawal, and balance checking.

---

## Collection Used

```java
HashMap<Integer, Account> accounts = new HashMap<>();
```

The HashMap stores account numbers as keys and account objects as values.

---

## Menu Options

```text
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. View All Accounts
6. Exit
```

---

## Sample Execution

```text
Enter Choice: 1
Enter Account Number: 1001
Enter Account Holder Name: Srushti
Enter Initial Balance: 5000

Account Created Successfully!
```

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Create Account | O(1) |
| Deposit | O(1) |
| Withdraw | O(1) |
| Check Balance | O(1) |
| Search Account | O(1) |

---

## Future Enhancements

- Savings Account and Current Account
- Transaction History
- Money Transfer
- Interest Calculation
- PIN Authentication

---

## Learning Outcomes

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- HashMap Collection
- Menu-Driven Programming
- CRUD Operations

---

## Author

**Adarsh**
