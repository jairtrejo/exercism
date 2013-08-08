(ns dna
  (:refer-clojure :exclude [replace])
  (:require [clojure.string :refer [replace]]))

(def thymine \T)
(def uracil \U)

(defn to-rna [dna]
  """
  Transcribes dna strings to rna strings.
  """
  (replace dna thymine uracil))
