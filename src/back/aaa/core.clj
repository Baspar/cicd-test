(ns aaa.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [aaa.common.core :refer [hello-world]]))

(defroutes app-routes
  (GET "/api" [] hello-world)
  (route/resources "/")
  (route/not-found "Not Found"))

(defn handler []
  "DOC"
  nil)

(def main
  (wrap-defaults app-routes site-defaults))
