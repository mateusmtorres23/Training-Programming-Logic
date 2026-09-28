import System.IO (hSetBuffering, stdout, BufferMode( NoBuffering ))

while :: Int -> IO Int
while 0 = do return 0
while c = do str <- getLine
             let numero = read str
             recursion <- while (c-1)
             return $ numero + recursion

somador :: IO ()
somador = do hSetBuffering stdout NoBuffering
             putStr "How many numbers? "
             amt <- getLine
             result <- while (read amt)
             putStrLn $ "The total is: " ++ show result
             return ()
