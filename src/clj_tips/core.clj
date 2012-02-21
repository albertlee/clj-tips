(ns clj-tips.core
  (:gen-class)
  (:use [clojure.string :only [join split-lines]])
  (:require [clj-time.core :as tm]
            [clojure.string :as string]
            )
  )


;; Tips:  clj-time 库包含一些方便的时间日期计算功能
;; Get current minutes 
;; 获取当前时间
(defn current-minute []
  (tm/minute (tm/now)))


;; Tips: 对文件按行进行处理
(defn process-file-by-lines [input output fun]
  (spit output (join "\n"
                     fun
                     (split-lines (slurp input)))
        :append true))

(defn ex-process-file-by-lines []
  (process-file-by-lines "input.txt" "output.txt" #(str "hello" % "!")))

;; Tips: 简单山寨的模板替换！
(defn template-replace [tmpl params]
  (reduce #(string/replace %1 (first %2) (second %2))
          (cons tmpl params)))

(defn ex-template-replace []
  (let [
        sql "AND add_time>=unix_timestamp('$startTm')
             AND add_time<unix_timestamp('$endTm')
             AND add_time>=unix_timestamp('$startTm')
             AND add_time<unix_timestamp('$endTm')"
        params [["$startTm" "2010-1-1"]
                ["$endTm" "2012-2-17"]]]
    (println (template-replace sql params))))
 

(defn -main [& args]
  (println "Clojure Tips")
  (ex-template-replace)
  (println "current minute: " (current-minute)))