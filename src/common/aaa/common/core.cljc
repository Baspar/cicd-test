(ns aaa.common.core)

(defn plus [x y]
  (+ x y))

(def hello-world
  (str "I'm a common Hello World. (But technically I'm run on a "
       #?(:clj "Clojure"
          :cljs "ClojureScript")
       " project)"))
