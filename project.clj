(defproject clj-ta-lib "0.0.2-SNAPSHOT"
  :description "Clojure Technical Analysis Library "
  :url "https://github.com/lunkdjedi/clj-ta-lib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.memoize "0.5.6"]]
  :main ^:skip-aot ta-lib.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

