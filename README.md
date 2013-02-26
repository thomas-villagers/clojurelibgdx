clojurelibgdx
=============

A minimal Clojure LibGDX project template 

TODO: - write proper readme

Create an android project:

android create project --target 8 --name GDXClojure --path . --activity LibGDXActivity --package com.friendlyvillagers.gdxclojure

Create a Clojure project:

lein new app clojure.gdx

edit project.clj; add gdx dependencies:

[com.badlogic.gdx/gdx "0.9.7"]
[com.badlogic.gdx/gdx-natives "0.9.7"]
[com.badlogic.gdx/gdx-backend-lwjgl "0.9.7"]
[com.badlogic.gdx/gdx-backend-lwjgl-natives "0.9.7"]

the jars need to be in your local repository (something like ~/home/.m2/com/badlogic/gdx/gdx.jar); there is a command to do this -- sorry, I forgot. 

Now, fire up a repl:

lein repl

Let's test if the gdx jars are there:

=> (com.badlogic.gdx.math.Vector2.)
#<Vector2> [0.0:0.0]>

Write your game! 
Your Desktop Application is clojure/gdx/core.clj
Run it: 

lein run

or 

lein repl 

When ready to test your code on Android, create the jar file:

lein jar
Created /home/thomas/dev/clojure/droid-gdx/clojure.gdx/target/clojure.gdx-0.1.0-SNAPSHOT.jar

Link that jar to your Android project's lib folder. 
Add the gdx jar files and clojure.jar to your Android project's lib folder. 

The class "MyGame" is the interface between your Java written Android activity and your clojure code (see LibGDXActivity.java). 

From your android project folder, build app:

ant debug


