using Exercises;
using Exercises.EX09Generics;
using Exercises.Ex10DependencyInjection;

Console.WriteLine("Choose an exercise (1-10):");
string input = Console.ReadLine() ?? "1";

switch (input)
{
    case "1":
        Ex01Basics.Run();
        break;
    case "2":
        Ex02Records.Run();
        break;
    case "3":
        Ex03With.Run();
        break;
    case "4":
        Ex04Exceptions.Run();
        break;
    case "5":
        Ex05Linq.Run();
        break;
    case "6":
        Ex06Interface.Run();
        break;
    case "7":
        Ex07Delegates.Run();
        break;
    case "8":
        await Ex08_Async.Run();
        break;
    case "9":
        Ex09Generics.Run();
        break;
    case "10":
        Ex10DependencyInjection.Run();
        break;
    default:
        Console.WriteLine("Invalid option.");
        break;
}