(ns reversi.core
  (:gen-class))

(def board-size 8)
(def empty 0)
(def black 1)
(def white 2)

(def empty-board (into [] (repeat board-size
                                  (into [] (repeat board-size empty)))))

(defn setup-initial-board [board]
  (-> board
      (assoc-in [2 2] black)
      (assoc-in [3 3] black)
      (assoc-in [2 3] white)
      (assoc-in [3 2] white)))

;; (setup-initial-board board)

(defn find-stretch [board [start-row start-col :as pos]]
  (for [h-index (range (inc start-col) board-size)]
    [start-row h-index]))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
