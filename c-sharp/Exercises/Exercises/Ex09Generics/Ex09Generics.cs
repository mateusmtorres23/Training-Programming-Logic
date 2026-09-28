namespace Exercises.EX09Generics;

public class Ex09Generics
{
    private static readonly Repository<User> _userRepository = new(new List<User>());
    private static readonly Repository<Product> _productRepository = new(new List<Product>());
    
    public static void Run()
    {
    
        User user =  new User(Guid.NewGuid());
        Product product = new Product(Guid.NewGuid());
        
        User user2 = new User(Guid.NewGuid());
        Product product2 = new Product(Guid.NewGuid());
        
        _userRepository.Add(user);
        _productRepository.Add(product);
        
        User foundUser = _userRepository.GetById(user.Id);
        Product foundProduct = _productRepository.GetById(product.Id);
        
        Console.WriteLine($"Found user with id {foundUser.Id}");
        Console.WriteLine($"Found product with id {foundProduct.Id}");

        try
        {
            _userRepository.GetById(Guid.NewGuid());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            throw;
        }
    }

}