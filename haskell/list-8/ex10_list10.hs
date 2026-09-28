menu :: IO ()
menu = do putStrLn "1. Saudação\n2. Despedida\n3.Sair"
          opt <- readLn
          case opt of
            1 -> putStrLn "Olá, Mundo!" >> menu
            2 -> putStrLn "Até logo!" >> menu
            3 -> return ()
