(ns jugsclojure.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [jugsclojure.core-test]
   [jugsclojure.common-test]))

(enable-console-print!)

(doo-tests 'jugsclojure.core-test
           'jugsclojure.common-test)
