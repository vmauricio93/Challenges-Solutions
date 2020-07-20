(ns jaden-case
  (:require [clojure.string :as s]))

(defn jaden-case [s]
  (->> (s/split s #" ")
       (map s/capitalize)
       (interpose " ")
       (apply str)))
