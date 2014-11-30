(ns authenticated-compojure-api.handler
  (:require [compojure.api.sweet :refer :all]
            [authenticated-compojure-api.routes.token :refer :all]
            [authenticated-compojure-api.middleware.basic-auth :refer [basic-auth-mw]]
            [ring.util.http-response :refer :all]
            [schema.core :as s]))

(defn init []
  (println "Application starting up...."))

(defapi app
  (swagger-ui)
  (swagger-docs
    :title "Authenticated-compojure-api"
    :apiVersion "0.0.1" )

  (swaggered "Token"
    :description "Get and refresh tokens"
    token-routes))