(apply + (filter #(zero? (min (mod % 5) (mod % 3)) (range 1000)))
