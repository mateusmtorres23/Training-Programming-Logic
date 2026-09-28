namespace Exercises.Ex10DependencyInjection;

public class OperationService : IScopedService,  ISingletonService,  ITransientService
{
    public Guid Id { get; } = Guid.NewGuid();
}