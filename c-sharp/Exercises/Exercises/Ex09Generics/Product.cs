namespace Exercises.EX09Generics;

public class Product : IEntity
{
    
    public Guid Id { get; }
    
    public Product( Guid id )
    {
        Id = id;
    }
}