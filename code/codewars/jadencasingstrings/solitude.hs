module JadenCasing where

import Data.Char

toJadenCase :: String -> String
toJadenCase = unwords . map capitalize . words where
  capitalize [] = []
  capitalize (x:xs) = toUpper x : map toLower xs
