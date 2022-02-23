(ns clojure-spellchecker.core
  (:gen-class)
  (:require [clojure.string :as str]))

(def word-list (slurp "resources/english-words.txt"))

(str/split-lines word-list)




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))