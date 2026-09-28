import System.IO (hSetBuffering, stdout, BufferMode( NoBuffering ))

somador :: IO ()
somador = do hSetBuffering stdout NoBuffering
             putStr "How many numbers? "
             amtStr <- getLine
             let amt = read amtStr
             numbers <- sequence $ replicate amt readLn
             let total = sum numbers
             putStrLn $ "The total is: " ++ show total