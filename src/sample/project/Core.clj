(ns sample.project.Core
    (:gen-class))

(defn modify-data [strings suffix]
      (map #(str % suffix) strings)) ; Appending suffix to each string

(defn -main
      "I don't do a lot ... yet."
      []
      (let [data ["abc" "xyz" "pqr"]
            modified-data (modify-data data " - modified")]
           (println "Original Data:" data)
           (println "Modified Data:" modified-data)))
