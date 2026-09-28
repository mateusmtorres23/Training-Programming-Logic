from account import Account
from transaction import Transaction
from datetime import date

class Client:
    def __init__(self, address: str, accounts: list):
        self._address: str = address
        self._accounts: list = accounts

    def add_account(self, account: Account):
        return self._accounts.append(account)
    
    def register_transaction(self, account: Account, transaction: Transaction):
        transaction.register(account)

class NaturalPerson(Client):
    def __init__(self, name: str, cpf: str, address: str, accounts: list, birth_date: date):
        super().__init__(address, accounts)
        self._name: str = name
        self._cpf: str = cpf
        self._birth_date: date = birth_date

