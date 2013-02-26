(defproject clojure.gdx "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.badlogic.gdx/gdx "0.9.7"]
                 [com.badlogic.gdx/gdx-natives "0.9.7"]
                 [com.badlogic.gdx/gdx-backend-lwjgl "0.9.7"]
                 [com.badlogic.gdx/gdx-backend-lwjgl-natives "0.9.7"]]
  :main clojure.gdx.core
  :aot [clojure.gdx.MyGame])
