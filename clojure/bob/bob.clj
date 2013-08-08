(ns bob
  (:use [clojure.string :only [upper-case]]))

(defn response-for [q]
  """
  Simulates a lackadaisical teenager.
  """
  (let
    [is-silence #(empty? %)
     is-shouting #(= (upper-case %) %)
     is-question #(.endsWith % "?")]
    (cond
      (is-silence q)   "Fine, be that way."
      (is-shouting q)  "Woah, chill out!"
      (is-question q)  "Sure."
      :else            "Whatever.")))
