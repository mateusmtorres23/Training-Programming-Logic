namespace Exercises.EX09Generics;

public class User : IEntity
{
    
    public Guid Id { get; }
    
    public User(Guid id )
    {
        Id = id;
    }
    
}