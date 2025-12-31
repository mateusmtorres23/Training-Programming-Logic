import accounts
from abc import ABC, abstractmethod

class Person(ABC):
    def __init__(self, name, age):
        self._name = name
        self.age = age
    
    @property
    def name(self):
        return self._name

class Client(Person):
    def __init__(self, name, age, account):
        super().__init__(name, age)
        self.account = account

class Agency:
    def __init__(self, number, local):
        self.number = number
        self.local = local

class Bank:
    def __init__(self, clients = [], accounts = [], agencys = []):
        self.clients = clients
        self.accounts = clients
        self.agencys = clients
    
    def approve_transaction(self, client):
        if client not in self.clients:
            raise Exception("This client doesn't exist in the database")
        
        if client.account not in self.accounts:
            raise Exception("This account doesn't exist in the database")
        
        if client.account.agency not in self.agencys:
            raise Exception("This agency doesn't exist in the database")
        
        return True
        
