(defproject clj-tips "1.0.0-SNAPSHOT"
  :description "AlbertLee's personal code snippets"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 
                 
                 [org.clojure.contrib/standalone "1.3.0-alpha2"]

                 ;; JSON
                 [org.clojure/data.json "0.1.2"]

                 ;; Web
                 [ring/ring-core "1.0.2"]
                 [ring/ring-jetty-adapter "1.0.2"]
                 [compojure "1.0.1"]

                 ;; Mysql
                 [org.clojure/java.jdbc "0.0.6"]
                 [mysql/mysql-connector-java "5.1.18"]

                 ;; Beanstalk
                 [com.github.drsnyder/beanstalk "1.0.0-SNAPSHOT"]

                 ;; Quartz , Job Scheduler
                 [org.quartz-scheduler/quartz "2.1.3"]
                 
                 ;; util, time
                 [clj-time "0.3.7"]

                 ]
  :dev-dependencies [
                     [lein-eclipse "1.0.0"]
                     [swank-clojure "1.4.0"]
                     ]
  jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :main clj-tips.core
)
