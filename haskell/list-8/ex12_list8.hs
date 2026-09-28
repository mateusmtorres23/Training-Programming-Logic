guessNum :: Int -> IO ()
guessNum n = do str <- getLine
                let gn = read str
                case compare gn n of
                    EQ -> putStrLn "Congratulations, you guessed correctly!"
                    GT -> putStrLn "Maior" >> guessNum n
                    LT -> putStrLn "Menor" >> guessNum n