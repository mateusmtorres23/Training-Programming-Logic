from abc import ABC, abstractmethod

class Account(ABC):
    def __init__(self, number, owner, balance, agency):
        self.number = number
        self.owner = owner
        self.balance = balance
        self.agency = agency

    @abstractmethod
    def withdraw(self, value):
        self.balance -= value
    
    def deposit(self, value):
        self.balance += value

class CheckingAccount(Account):
    def __init__(self, number, owner, balance, agency, limit):
        super().__init__(number, owner, balance, agency)
        self.limit = limit

    def withdraw(self, value):
        if self.balance - value < -self.limit:
            raise ValueError("Insuficient limit for this withdrawl.")
        return super().withdraw(value)

class SavingsAccount(Account):
    def __init__(self, number, owner, balance, agency):
        super().__init__(number, owner, balance, agency)
    
    def withdraw(self, value):
        if self.balance - value < 0:
            raise ValueError("Balance cannot be less than 0")
        return super().withdraw(value)