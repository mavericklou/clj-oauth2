(def dev-dependencies
  '[[ring "1.2.0-beta3"]])

(defproject net.likestream/clj-oauth2 "0.5.3"
  :description "clj-http and ring middleware for OAuth 2.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.2"]
                 [uri "1.1.0"]
                 [commons-codec/commons-codec "1.7"]]
  :exclusions   [org.clojure/clojure-contrib]
  :dev-dependencies ~dev-dependencies
  :profiles {:dev {:dependencies ~dev-dependencies}}
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"}
  :aot [clj-oauth2.OAuth2Exception
        clj-oauth2.OAuth2StateMismatchException])

