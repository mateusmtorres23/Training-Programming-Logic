namespace Exercises;

public class Ex05Linq
{
    public static void Run()
    {
        List<Task> tasks = new List<Task>
        {
            new Task("Buy groceries", false, "High"),
            new Task("Clean the house", true, "Medium"),
            new Task("Finish project", false, "High"),
            new Task("Call mom", true, "Low"),
            new Task("Pay bills", false, "Medium")
        };

        var highPriorityTasks = tasks
            .Where(t => !t.IsCompleted & t.Priority == "High")
            .OrderBy(t => t.Priority)
            .Select(t => t.Title);

        Console.WriteLine("High priority tasks:");
        foreach (var task in highPriorityTasks)
        {
            Console.WriteLine($"- {task}");
        }

        var stats = tasks
            .GroupBy(t => t.Priority)
            .Select(g => new { Priority = g.Key, Count = g.Count() });

        foreach (var stat in stats)
        {
            Console.WriteLine($"{stat.Priority}: {stat.Count}");
        }

    }


    public record Task(string Title, bool IsCompleted, string Priority);
}