namespace Exercises;

public interface IMessageService
{
    void SendMessage(string recipient, string message);
}

public class EmailService : IMessageService
{
    public void SendMessage(string recipient, string message) => 
        Console.WriteLine($"[EMAIL] To {recipient}: {message}");
}

public class SmsService : IMessageService
{
    public void SendMessage(string recipient, string message) => 
        Console.WriteLine($"[SMS] To {recipient}: {message}");
}

public class NotificationManager
{
    private readonly IMessageService _service;

    public NotificationManager(IMessageService service)
    {
        _service = service;
    }

    public void Notify(string msg) => _service.SendMessage("Admin", msg);
}

public static class Ex06Interface
{
    public static void Run()
    {
        var emailManager = new NotificationManager(new EmailService());
        emailManager.Notify("System Update");

        var smsManager = new NotificationManager(new SmsService());
        smsManager.Notify("Security Alert");
    }
}