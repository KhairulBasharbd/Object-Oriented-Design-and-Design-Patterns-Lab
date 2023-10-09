# Banking Service with Facade Design Pattern

## Introduction

A `BankingFacade` class is implemented to provide a simplified interface for performing common banking operations, such as depositing, withdrawing, investing, and divesting. The facade class abstracts the complexity of the individual account classes, making it easier to interact with the banking system.

## Code Overview

### Subsystem Classes

We have three subsystem classes representing different types of accounts:

- `CheckingAccount`: Manages checking account operations such as depositing and withdrawing funds.
- `SavingsAccount`: Handles savings account operations such as depositing and withdrawing funds.
- `InvestmentAccount`: Manages investment account operations such as investing and divesting funds.

### Facade Class

The `BankingFacade` class acts as a facade for the banking subsystems. It initializes instances of the checking, savings, and investment accounts and provides simplified methods for performing operations on these accounts:

- `depositToChecking`: Deposits funds into the checking account.
- `withdrawFromChecking`: Withdraws funds from the checking account.
- `depositToSavings`: Deposits funds into the savings account.
- `withdrawFromSavings`: Withdraws funds from the savings account.
- `investInInvestment`: Invests funds in the investment account.
- `divestFromInvestment`: Divests funds from the investment account.

### Client Class

The `Client` class demonstrates the use of the facade pattern by creating a `BankingFacade` instance and using it to perform various banking operations.

## UML Diagram

![Link Name](Pet_management_system_UML_diagram.png) 



