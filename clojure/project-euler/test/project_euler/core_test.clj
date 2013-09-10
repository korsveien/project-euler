(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest multiples-of-3-and-5-test
  (testing "Problem 1: Multiples of 3 and 5"
    (is (= (multiples-of-3-and-5 (range 1000)) 233168))))

(deftest even-fibonacci-numbers-test
  (testing "Problem 2: Even Fibonacci numbers"
    (is (= (even-fibonacci-numbers) 4613732))))
