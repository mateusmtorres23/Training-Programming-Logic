countInp :: IO ()
countInp = do str <- getLine
              let len = show $ length str
              putStrLn $ "Você digitou " ++ len ++ " caracteres."
              