namespace Exercises;

public class Ex03With
{
    public static void Run()
    {
        var initialScore = new GameScore("Player1", 100, 1);

        var updatedScore = initialScore with { Points = 250, Level = 2 };

        var identicalScore = new GameScore("Player1", 100, 1);

        Console.WriteLine($"Original: {initialScore}");
        Console.WriteLine($"Updated: {updatedScore}");
        Console.WriteLine($"Are they reference equal? {ReferenceEquals(initialScore, identicalScore)}");
        Console.WriteLine($"Are they value equal? {initialScore == identicalScore}");
    }
    public record GameScore(string PlayerName, int Points, int Level);
}