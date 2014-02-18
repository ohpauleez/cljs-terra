(defproject clojurescript-terra "0.1.0-SNAPSHOT"
  :description "ClojureScript running on Terra"
  :url "https://github.com/ohpauleez/cljs-terra"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0-beta1"]
                 [org.clojure/clojurescript "0.0-2156" :exlusions [org.clojure/tools.reader]]
                 [org.clojure/tools.reader "0.8.3"]
                 [org.clojure/data.json "0.2.4"]
                 ;; Experiment with mapping an EDN AST, to a Terra.list AST,
                 ;;  then using the Terra language/compiler tooling
                 [org.clojure/tools.analyzer "0.1.0-beta4"]])

