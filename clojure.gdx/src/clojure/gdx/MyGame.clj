(ns clojure.gdx.MyGame 
  (:import (com.badlogic.gdx Game Screen Gdx))
  (:require (clojure.gdx [myscreen :as myscreen])))

(gen-class
 :name clojure.gdx.MyGame
 :extends com.badlogic.gdx.Game)
 
(defn -create [^Game this]
  (.setScreen this (myscreen/screen)))
