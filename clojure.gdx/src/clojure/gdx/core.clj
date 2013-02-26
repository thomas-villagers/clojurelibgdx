(ns clojure.gdx.core
  (:import (com.badlogic.gdx Game)
           (com.badlogic.gdx.backends.lwjgl LwjglApplication)))

(defn App[]
  (LwjglApplication. (clojure.gdx.MyGame. ) "Hello Clojure" 800 480 true))

(App)

