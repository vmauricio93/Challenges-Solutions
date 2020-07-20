let sumTwoSmallestNumbers numbers =
    if Array.length numbers < 2 then
        invalidArg "numbers" "The array must have at least two elements."

    numbers
    |> Array.fold
        (fun (x, y) z ->
            if z < x
            then z, x
            else if z < y
            then x, z
            else x, y)
        (System.Int64.MaxValue, System.Int64.MaxValue)
    ||> (+)
