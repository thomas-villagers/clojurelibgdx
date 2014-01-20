clojurelibgdx
=============

A minimal Clojure LibGDX project template 

You need Leiningen (http://leiningen.org/) and LibGDX (http://libgdx.badlogicgames.com/).
I use Leiningen 2.0, but with some modifications it should work with 1.x as well. 

Create an Android project:

    android create project --target 8 --name GDXClojure --path . --activity LibGDXActivity --package com.friendlyvillagers.gdxclojure

Create a Clojure project:

    lein new app clojure.gdx

Edit project.clj; add gdx dependencies:

    [com.badlogic.gdx/gdx "0.9.7"]
    [com.badlogic.gdx/gdx-natives "0.9.7"]
    [com.badlogic.gdx/gdx-backend-lwjgl "0.9.7"]
    [com.badlogic.gdx/gdx-backend-lwjgl-natives "0.9.7"]

The jars need to be in your local Maven repository (on my machine it's ~/.m2/com/badlogic/gdx/gdx.jar;). 

If mvn is installed you can do this like so (repeat for gdx-natives etc.): 

    mvn install:install-file -Dfile=libs/gdx.jar -DgroupId=com.badlogic.gdx -DartifactId=gdx -Dversion=0.9.7 -Dpackaging=jar

Alternatively you can ask Leiningen to download the latest jars from the gdx repository (see https://code.google.com/p/libgdx/wiki/MavenProjectSetup). 
To do this, add this line to project.clj:

    :repositories [["libgdx" "http://libgdx.badlogicgames.com/nightlies/maven/"]]
    
and modify the dependencies, e.g.

    [com.badlogic.gdx/gdx "0.9.9-SNAPSHOTS"]

Now, fire up a repl:

    lein repl

Let's test if the gdx jars are there:

    => (com.badlogic.gdx.math.Vector2.)
    #<Vector2> [0.0:0.0]>

Write your game! 
Your Desktop Application is in src/clojure/gdx/core.clj
Run it: 

    lein run

or 

    lein repl 

When you're ready to test your code on Android, create the jar file:

    lein jar
    Created /home/thomas/dev/clojure/droid-gdx/clojure.gdx/target/clojure.gdx-0.1.0-SNAPSHOT.jar

Link that jar to your Android project's lib folder. 
Add the gdx jar files and clojure.jar to your Android project's lib folder. 

The class "MyGame" is the interface between your Java-written Android activity and your Clojure code (see LibGDXActivity.java). 

From your android project folder, build app:

    ant debug

As an alternative, you could use NEKO or Lein Droid (https://github.com/alexander-yakushev/lein-droid). 
I would prefer Lein Droid as it allows you to strip unused stuff from your clojure.jar and simplifies using proguard. 
However, I had some trouble building complex projects with Lein Droid so I came up with this simple method. 

Proguard
========

Use proguard with

    ant release

Read proguard-project.txt to see how it's done. You'll need to modify proguard-project.txt for your own projects.  
    
If you don't want to use proguard, comment out this line

    proguard.config=proguard-project.txt

in project.properties. 
    
Add a Splash Screen
===================
 
Every Clojure App takes a while to load. To give a feedback you can open a separate activity with a splash screen while the Clojure RT is loading. To see how that can be done switch to the branch "with-splashscreen":

    git checkout with-splashscreen


