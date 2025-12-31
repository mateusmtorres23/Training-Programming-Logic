# Exercise: Abstraction, Inheritance, Encapsulation, and Polymorphism

Create an extremely simple **Banking System** consisting of clients, accounts, and a bank. The concept is that a client has an account (Savings or Checking) and can withdraw/deposit into that account. Checking accounts have an extra overdraft limit.

### Class Hierarchy Structure

* **Account (ABC)**
    * CheckingAccount
    * SavingsAccount
* **Person (ABC)**
    * Client
        * Client -> Has an Account
* **Bank**
    * Bank -> Aggregates Clients
    * Bank -> Aggregates Accounts

### Tips & Implementation Details

**1. Create the `Client` class inheriting from `Person` (Inheritance)**
* `Person` has `name` and `age` (with getters).
* `Client` **HAS AN** account (Aggregation of the `CheckingAccount` or `SavingsAccount` class).

**2. Create `SavingsAccount` and `CheckingAccount` classes inheriting from `Account`**
* `CheckingAccount` must have an extra `limit`.
* Accounts have `agency`, `account_number`, and `balance`.
* Accounts must have a method for `deposit`.
* `Account` (Superclass) must have an **abstract** `withdraw` method (Abstraction and Polymorphism — the subclasses implement the specific withdrawal logic).

**3. Create the `Bank` class to AGGREGATE Client and Account classes (Aggregation)**

**4. Authentication Logic**
The Bank will be responsible for authenticating the client and the accounts as follows:
* The Bank has accounts and clients (Aggregation).
* **Check:** Does the agency belong to that bank?
* **Check:** Does the client belong to that bank?
* **Check:** Does the account belong to that bank?

> **Constraint:** It will only be possible to withdraw if the bank authentication (described above) is passed. The Bank performs this authentication via a method.