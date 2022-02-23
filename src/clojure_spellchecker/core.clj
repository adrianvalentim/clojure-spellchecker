(ns clojure-spellchecker.core
  (:require [clojure.string :as str]))

;loads words.txt, creates a list, trims white spaces and turns it into a set
(def word-list
  (set 
   (map str/trim (str/split-lines (slurp "resources/english-words.txt")))))

(defn listed? [word] (contains? word word-list))


(defn -main [& args]
  (let [word (first args)]
    (if (listed? word)
      (println "Correct.")
      (println "Incorrect."))))