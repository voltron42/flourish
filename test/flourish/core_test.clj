(ns flourish.core-test
  (:require [clojure.test :refer :all]
            [flourish.core :refer :all]))

(deftest test-file
  (clojure.pprint/pprint
    (parse (slurp "resources/test.md"))
    (clojure.java.io/writer "resources/parsed.edn")))