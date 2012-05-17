(ns journeyr.server
  (:require [noir.server :as server])
  (:use [journeyr.models.journeys]))

(server/load-views "src/journeyr/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "3000"))]
    (server/start port {:mode mode
                        :ns 'journeyr})))
