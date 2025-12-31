from bank import Bank, Client, Agency
from accounts import CheckingAccount, SavingsAccount

if __name__ == "__main__":
    agency_01 = Agency(number=1, local="Downtown")

    client_john = Client(name="John Doe", age=30, account=None)

    john_account = CheckingAccount(
        number=1001,
        owner=client_john,
        balance=1000.0,
        agency=agency_01,
        limit=500.0
    )

    client_john.account = john_account

    central_bank = Bank(
        clients=[client_john],
        accounts=[john_account],
        agencys=[agency_01]
    )

    try:
        print(f"Initial Balance: {john_account.balance}")
        
        central_bank.approve_transaction(client_john)
        john_account.withdraw(200.0)
        
        print("Withdrawal successful")
        print(f"Current Balance: {john_account.balance}")

        central_bank.approve_transaction(client_john)
        john_account.withdraw(2000.0)

    except Exception as e:
        print(f"Transaction Failed: {e}")