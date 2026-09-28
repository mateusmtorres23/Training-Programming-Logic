namespace Exercises;

public static class Ex08_Async
{
    public static async Task Run()
    {
        Console.WriteLine("Iniciando operações...");

        Task<string> apiTask = FetchDataFromApiAsync();
        Task<string> fileTask = ProcessFileAsync();

        Console.WriteLine("Fazendo outras coisas enquanto as tarefas rodam...");

        string[] results = await Task.WhenAll(apiTask, fileTask);

        foreach (var result in results)
        {
            Console.WriteLine(result);
        }
        
        Console.WriteLine("Operações finalizadas.");
    }

    private static async Task<string> FetchDataFromApiAsync()
    {
        await Task.Delay(2000); 
        return "Dados da API recuperados.";
    }

    private static async Task<string> ProcessFileAsync()
    {
        await Task.Delay(1000); 
        return "Arquivo processado com sucesso.";
    }
}