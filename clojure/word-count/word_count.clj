(ns phrase
  [:require [clojure.string :refer [lower-case]]])

(defn word-count [phrase]
  """
  A function to count word frequencies in a phrase
  """
  (let [words (re-seq #"\w+" phrase)
        normalized (map lower-case words)]
    (frequencies normalized)))
