from client import Client
from transaction import History

class Account:
    def __init__ (self, number, client):
        self._balance: float = 0.0
        self._number: int = number
        self._agency: str = "0001"
        self._client: Client = client
        self._history: History = History()

    @classmethod
    def new_account(cls, number: int, client: Client):
        return cls(number, client)
    
    @property
    def balance(self):
        return self._balance

    def withdraw(self, value: float) -> bool:
        if value > self._balance:
            return False
        self._balance -= value
        return True
    
    def deposit(self, value: float) -> bool:
        if value <= 0:
            return False
        self._balance += value
        return True
    
class CheckingAccount(Account):
    def __init__(self, number, client, limit: float, withdraw_limits: int):
        super().__init__(number, client)
        self._limit: float = limit
        self._withdraw_limits: int = withdraw_limits

    
