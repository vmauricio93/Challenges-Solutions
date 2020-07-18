digital_root <- function(n){
  if (n == 0) {
    return (0)
  }
  (n - 1) %% 9 + 1
}
