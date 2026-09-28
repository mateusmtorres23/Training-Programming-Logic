namespace Exercises;

public class Ex01Basics
{
    public static void Run()
    {
        string userName = "exercise user";
        int userLevel = 1;
        decimal performanceScore = 98.5m;
        bool isStudent = true;

        var studentInfo = new 
        {
            Name = userName,
            JoinedAt = DateTime.Now
        };

        string simpleInterpolation = $"User: {userName}, Level: {userLevel}";

        string rawString = """
                           <UserProfile>
                               <Name>{userName}</Name>
                               <Level>{userLevel}</Level>
                               <Status>Active</Status>
                           </UserProfile>
                           """;

        Console.WriteLine("--- Basic Info ---");
        Console.WriteLine(simpleInterpolation);
        Console.WriteLine($"Score: {performanceScore}% | Is Student: {isStudent}");
        Console.WriteLine("\n--- Raw Data Structure ---");
        Console.WriteLine(rawString);
        Console.WriteLine($"\nAnonymous Object Metadata: {studentInfo.Name} created at {studentInfo.JoinedAt}");
    }
}