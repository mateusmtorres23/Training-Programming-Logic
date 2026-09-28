namespace Exercises;

public class InsufficientFundsException : Exception
{
    public decimal RequestedAmount { get; }
    public decimal CurrentBalance { get; }
    
    public InsufficientFundsException() : base ("Insufficient funds to complete the transaction") {}
    
    public InsufficientFundsException(string message) : base(message) {}
    
    public InsufficientFundsException(decimal requestedAmount, decimal currentBalance) 
        : base($"Requested: {requestedAmount:C}, Available: {currentBalance:C}. Transaction failed")
    {
        RequestedAmount = requestedAmount;
        CurrentBalance = currentBalance;
    }
    
    public InsufficientFundsException(string message, Exception inner) : base(message, inner) {}
}

public static class Ex04Exceptions
{
    public static void Run()
    {
        decimal balance = 500m;
        decimal withdrawalAmount = 600m;
        
        try
        {
            Withdraw(balance, withdrawalAmount);
            Console.WriteLine("Withdrawal successful.");
        }
        catch (InsufficientFundsException ex)
        {
            Console.WriteLine($"{ex.Message}");
        }
    }
    
    public static void Withdraw(decimal balance, decimal amount)
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException(amount, balance);
        }
        
        amount -= balance;
    }
}