import Data.Char (toUpper)
repeatTillExit :: IO ()
repeatTillExit = do str <- getLine
                    let strUpper = map toUpper str
                    case strUpper of
                        "EXIT" -> return ()
                        _ -> do putStrLn strUpper
                                repeatTillExit