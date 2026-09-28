namespace Exercises.EX09Generics;

public class Repository<T> where T : IEntity
{
    
    private List<T> _entities;

    public Repository(List<T> entities)
    {
        _entities = entities;
    }
    
    public T Add(T entity)
    {
        _entities.Add(entity);
        return entity;
    }
    
    public T GetById(Guid id)
    {
        return _entities.FirstOrDefault(e => e.Id == id)
            ?? throw new Exception($"Entity with id {id} not found");
    }
}