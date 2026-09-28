from datetime import date

from account import CheckingAccount
from client import NaturalPerson
from transaction import Deposit, Withdraw


def print_menu() -> None:
    print("\n=== Simple Banking System ===")
    print("1 - Show account summary")
    print("2 - Deposit")
    print("3 - Withdraw")
    print("4 - Quit")


def show_account_summary(client: NaturalPerson, account: CheckingAccount) -> None:
    print("\n--- Account Summary ---")
    print(f"Client name: {client._name}")
    print(f"Client CPF: {client._cpf}")
    print(f"Address: {client._address}")
    print(f"Agency: {account._agency}")
    print(f"Account number: {account._number}")
    print(f"Account balance: $ {account.balance:.2f}")
    print(f"Overdraft limit: $ {account._limit:.2f}")
    print(f"Remaining withdrawals allowed: {account._withdraw_limits}")


def input_float(prompt: str) -> float:
    while True:
        value = input(prompt).strip()
        try:
            amount = float(value)
            return amount
        except ValueError:
            print("Invalid number. Please enter a valid amount.")


def perform_transaction(account: CheckingAccount, transaction) -> bool:
    success = transaction.register(account)
    return success


def main() -> None:
    client = NaturalPerson(
        name="Alice Silva",
        cpf="123.456.789-00",
        address="123 Flower Street",
        accounts=[],
        birth_date=date(1990, 3, 15),
    )

    account = CheckingAccount(
        number=1001,
        client=client,
        limit=500.0,
        withdraw_limits=3,
    )
    client.add_account(account)

    print("Welcome to the simple banking system.")
    show_account_summary(client, account)

    while True:
        print_menu()
        option = input("Choose an option: ").strip()

        if option == "1":
            show_account_summary(client, account)
        elif option == "2":
            amount = input_float("Enter deposit amount: ")
            transaction = Deposit(amount)
            if perform_transaction(account, transaction):
                print(f"Deposit successful. New balance: $ {account.balance:.2f}")
            else:
                print("Deposit failed. Amount must be greater than zero.")
        elif option == "3":
            amount = input_float("Enter withdrawal amount: ")
            transaction = Withdraw(amount)
            if perform_transaction(account, transaction):
                print(f"Withdrawal successful. New balance: $ {account.balance:.2f}")
            else:
                print("Withdrawal failed. Insufficient funds or invalid amount.")
        elif option == "4":
            print("Exiting the system. Have a nice day!")
            break
        else:
            print("Invalid option. Please select 1, 2, 3, or 4.")


if __name__ == "__main__":
    main()
