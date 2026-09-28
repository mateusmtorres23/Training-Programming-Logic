prtStr :: String -> IO ()
prtStr "" = return ()
prtStr (x:xs) = do putChar x
                   prtStr xs