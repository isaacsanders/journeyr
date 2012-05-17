(ns journeyr.views.journeys
  (:use [journeyr.views.common]))

(defn journey-page [journey]
  (let [title (:title journey)]
    (swap! page-title (fn [_] (str title " | " "Journeyr")))
    (layout
      [:h1 title])))
