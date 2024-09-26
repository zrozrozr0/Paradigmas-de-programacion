(defun raizpow10 (x)
           (cond ((null x) 0)
                 (T (expt (expt x 10) (/ 1 3)))))