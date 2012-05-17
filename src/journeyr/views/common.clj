(ns journeyr.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css
                                    include-js
                                    html5]]))

(def page-title (atom "Journeyr"))

(defpartial layout [& content]
            (html5
              [:head
               [:title @page-title]]
              [:body
               [content]]))
