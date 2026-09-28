namespace Exercises;

public class Ex02Records
{
    public static void Run()
    {
        var investor = new Investor("Alice", 150000, 5);

        string category = investor switch
        {
            { ExperienceLevel: < 2 } => "Beginner - High Risk",
            { PortfolioValue: > 100000, ExperienceLevel: > 4 } => "Elite - Low Risk",
            { PortfolioValue: > 50000 } => "Standard - Medium Risk",
            _ => "Basic - Evaluation Required"
        };

        string message = $"""
                          Investor Report:
                          Name: {investor.Name}
                          Status: {category}
                          """;

        Console.WriteLine(message);
    }
    public record Investor(string Name, decimal PortfolioValue, int ExperienceLevel);
}