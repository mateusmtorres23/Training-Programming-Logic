from abc import ABC, abstractmethod

class Account(ABC):
    def __init__(self, number, owner, balance, agency):
        self.number = number
        self.owner = owner
        self.balance = balance
        self.agency = agency

    @abstractmethod
    def withdraw(self):
        ...
    
    def deposit(self, value):
        self.balance += value

class CheckingAccount(Account):
    def __init__(self, number, owner, balance, agency, limit):
        super().__init__(number, owner, balance, agency)
        self.limit = limit

class SavingsAccount(Account):
    def __init__(self, number, owner, balance, agency):
        super().__init__

        
