(ns digital-root)

(defn digital-root [n]
  (if (< n 10) 
    n
    (recur (apply + (map #(Character/digit % 10) (str n))))))
