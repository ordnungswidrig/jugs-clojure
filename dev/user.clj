(ns user
  (:require [jugsclojure.server :refer [restart-server]]
            [ring.middleware.reload :refer [wrap-reload]]
            [clojure.tools.namespace.repl :refer [refresh]]
            [figwheel-sidecar.repl-api :as figwheel]))

;; Let Clojure warn you when it needs to reflect on types, or when it does math
;; on unboxed numbers. In both cases you should add type annotations to prevent
;; degraded performance.
(set! *warn-on-reflection* true)
(set! *unchecked-math* :warn-on-boxed)
(def http-handler
  (wrap-reload #'jugsclojure.server/http-handler))

(defn go []
  (figwheel/start-figwheel!)
  (restart-server)
  (prn "Application restartet."))

(def run restart-server)

(def browser-repl figwheel/cljs-repl)


(comment

  (go)
;;
)
