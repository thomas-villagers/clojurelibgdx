(ns clojure.gdx.myscreen
  (:import (com.badlogic.gdx Gdx Screen)
           (com.badlogic.gdx.scenes.scene2d Stage)
           (com.badlogic.gdx.scenes.scene2d.ui Label Label$LabelStyle)
           (com.badlogic.gdx.graphics Color)
           (com.badlogic.gdx.graphics.g2d BitmapFont)))

(declare ^Stage stage)

(defn screen []
  (proxy [Screen] []
    (show []
      (def stage (Stage.))
      (let [font (BitmapFont.)
            style (Label$LabelStyle. font (Color. 1.0 1.0 1.0 1.0))
            label (Label. "Hello Clojure!" style)]
            (.addActor stage label)))
            
    (render [delta]
      (doto stage
        (.act delta)
        (.draw)))
    
    (dispose[])
    (hide [])
    (pause [])
    (resize [w h])
    (resume [])))

