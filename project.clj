(defproject authenticated-compojure-api "0.1.0-SNAPSHOT"
  :description "An example compojure-api app with authentication using buddy"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [metosin/compojure-api "0.16.5"]
                 [metosin/ring-http-response "0.5.2"]
                 [metosin/ring-swagger-ui "2.0.17"]
                 [buddy "0.2.0"]]

  :ring {:handler authenticated-compojure-api.handler/app
         :init    authenticated-compojure-api.handler/init}

  :uberjar-name "server.jar"

  :profiles {:uberjar {:resource-paths ["swagger-ui"]}
             :dev     {:dependencies   [[javax.servlet/servlet-api "2.5"]
                                        [midje                     "1.6.3"]
                                        [ring-mock                 "0.1.5"]
                                        [cheshire                  "5.3.1"]]
                       :plugins        [[lein-ring  "0.8.13"]
                                        [lein-midje "3.1.3"]]}})