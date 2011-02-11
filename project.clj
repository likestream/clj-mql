(defproject com.twinql.clojure/mql
  "1.0.8"
  :description "Freebase MQL client library."

  :dev-dependencies [[lein-search "0.3.4"]
		     [swank-clojure "1.2.1"]
		     [lein-cdt "1.0.0"]
		     [lein-namespace-depends "0.1.0-SNAPSHOT"]]

  :hooks [leiningen.hooks.cdt]

  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [com.twinql.clojure/clj-apache-http "2.3.1"]])

