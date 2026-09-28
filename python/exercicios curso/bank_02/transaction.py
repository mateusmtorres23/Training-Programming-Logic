from abc import ABC, abstractmethod
from account import Account

class Transaction(ABC):
    
    @abstractmethod
    def register(self, account: Account):
        pass


class Withdraw(Transaction):
    def __init__(self, value: float):
        self._value: float = value

    def register(self, account: Account):
        return account.withdraw(self._value)


class Deposit(Transaction):
    def __init__(self, value: float):
        self._value: float = value

    def register(self, account: Account):
        return account.deposit(self._value)

 
class History:
    def __init__(self):
        self._transactions: list = []

    def add_transaction(self, transaction: Transaction):
        self._transactions.append(transaction)