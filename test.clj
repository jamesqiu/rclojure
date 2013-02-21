#lang clojure
(require rackunit)

(defn factorial [n]
  (cond
    (<= n 1) 1
    :else (* n (factorial (dec n)))))

(check-equal? #t (eq? (= 1 1) true))
(check-equal? 120 (factorial 5))
(check-equal? [1 2] (pop [1 2 3]))
(check-equal? '(2 3) (pop '(1 2 3)))
(check-equal? "yes" (if true "yes"))
(check-equal? [1 2 3 4] (conj [1 2 3] 4))
(check-equal? '(4 1 2 3) (conj '(1 2 3) 4))
(check-equal? [[1 2] [3 4] [5 6]] (conj [[1 2] [3 4]] [5 6]))
(check-equal?  [4 5 6 7] (subvec [12 3 4 5 6 7] 2))
(check-equal? [4 5] (subvec [12 3 4 5 6 7] 2 4))
(let [v [1 2 3]]
  (check-equal? [1 2 3 4] (conj v 4)))
(let [l '(1 2 3)]
  (check-equal? '(4 1 2 3) (conj l 4)))
(let [l (list 1 (list 2 3) 4)]
  (check-equal? 1 (first l)))
(let [l '(1 '(2 3) 4)]
  (check-equal? 1 (first l)))
(let [x 1 y 3]
  (check-equal? x 1)
  (check-equal? y 3))
(check-equal? 2 (get [1 2 3] 1))
(check-equal? nil (get [1 2 3] 5))
(check-equal? 1 (rem 10 9))
(check-equal? 0 (rem 2 2))
(check-equal? 0 (mod 10 5))
(check-equal? 0 (mod 10 10))
(check-equal? 0 (mod 10 -1))
(check-equal? 4 (mod 10 6))
(check-equal? 3 (mod -2 5))

(letfn [(twice [x]
               (* x 2))
        (six-times [y]
          (* (twice y) 3))]
  (println "Twice 15 = " (twice 15))
  (println "Six times 15 = " (six-times 15)))

(check-equal? (true? true) #t)
(check-equal? (true? 1) #f)
(check-equal? (true? (= 1 1)) #t)
(check-equal? (false? false) #t)
(check-equal? (false? true) #f)
(check-equal? (false? nil) #f)
(check-equal? (false? "foo") #f)
(check-equal? (max 1 2 3 4 5) 5)
(check-equal? (max 5 4 3 2 1) 5)
(check-equal? (max 100) 100)
(check-equal? (min 1 2 3 4 5) 1)
(check-equal? (nil? nil) #t)
(check-equal? (nil? 0) #f)
(check-equal? (nil? false) #f)
(check-equal? (reduce + [1 2 3 4 5]) 15)
(check-equal? (reduce + []) 0)
(check-equal? (reduce + 1 []) 1)
(check-equal? (reduce + 1 [2 3]) 6)

