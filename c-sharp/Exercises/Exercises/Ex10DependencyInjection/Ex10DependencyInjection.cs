using Microsoft.Extensions.DependencyInjection;

namespace Exercises.Ex10DependencyInjection;

public class Ex10DependencyInjection
{
    public static void Run()
    {
        var services = new ServiceCollection();

        services.AddTransient<ITransientService, OperationService>();
        services.AddScoped<IScopedService, OperationService>();
        services.AddSingleton<ISingletonService, OperationService>();

        var provider = services.BuildServiceProvider();

        Console.WriteLine("--- First Phase ---");
        using (var scope1 = provider.CreateScope())
        {
            var p = scope1.ServiceProvider;
            
            PrintService(p.GetRequiredService<ITransientService>(), "Transient 1");
            PrintService(p.GetRequiredService<ITransientService>(), "Transient 2 (Deve mudar)");
            
            PrintService(p.GetRequiredService<IScopedService>(), "Scoped 1");
            PrintService(p.GetRequiredService<IScopedService>(), "Scoped 2 (Deve ser igual ao Scoped 1)");
            
            PrintService(p.GetRequiredService<ISingletonService>(), "Singleton 1");
        }

        Console.WriteLine("\n--- Second Phase ---");
        using (var scope2 = provider.CreateScope())
        {
            var p = scope2.ServiceProvider;
            
            PrintService(p.GetRequiredService<IScopedService>(), "Scoped 3 (Deve ser diferente do Scoped 1)");
            PrintService(p.GetRequiredService<ISingletonService>(), "Singleton 2 (Deve ser igual ao Singleton 1)");
        }
    }

    private static void PrintService(object service, string label)
    {
        var id = (service as dynamic).Id;
        Console.WriteLine($"{label}: {id}");
    }
}