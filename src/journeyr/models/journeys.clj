(ns journeyr.models.journeys)

(def journeys (atom []))

(defrecord Journey [])

(defn journey [user title & description]
  (Journey. nil {:user user
                 :title title
                 :description description
                 :steps []}))

(defn add-journey [user title]
  (let [journey (atom (journey user title))]
  (swap! journeys conj journey)
  journey))

(defn find-journey [title]
  @(some #(re-find (re-pattern title) (:title %)) @journeys))
