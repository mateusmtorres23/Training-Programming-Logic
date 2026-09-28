echoChar :: IO ()
echoChar = do chr <- getChar
              putChar chr
              putChar chr