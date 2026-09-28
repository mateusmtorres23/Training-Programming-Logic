import System.IO (hSetEcho, stdin)


obterChar :: IO Char
obterChar = do hSetEcho stdin False
               x <- getChar
               hSetEcho stdin True
               return x

obterLinha :: IO String
obterLinha = lerCaracteres ""

lerCaracteres :: String -> IO String
lerCaracteres lidos = do
    x <- obterChar
    processar x lidos

processar :: Char -> String -> IO String
processar '\n' lidos = do
    putChar '\n'
    return lidos
processar '\DEL' lidos
    | null lidos = lerCaracteres lidos
    | otherwise  = do
        putStr "\b \b"
        lerCaracteres (init lidos)
processar x lidos = do
    putChar x
    lerCaracteres (lidos ++ [x])
