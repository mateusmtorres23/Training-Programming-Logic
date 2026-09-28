namespace Exercises;

public class Ex07Delegates
{
    public static void Run()
    {
        
        Func<string, bool> isLongName = name => name.Length > 5;

        List<string> names = new() { "Ana", "Shannon", "Turing", "Ada" };
        
        var longNames =  names.Where(isLongName);
        
        Console.WriteLine("Long names:");
        Console.WriteLine(string.Join(", ", longNames));

    }
}