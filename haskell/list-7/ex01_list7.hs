myPutStr :: String -> IO ()
myPutStr xs = sequence_ [putChar x | x <- xs]