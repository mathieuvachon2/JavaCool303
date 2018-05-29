First of all, the number of components and containers are hardcoded in the application, and
choosing the theme is hardcoded at the start of the application program (line 16). Change this line
to ''summer'' to test out the summer theme. I always use the methods setThemeColor() and 
paintComponent(Graphics g) to configure the object to the themes liking, so I put both those classes in my 
Cool303Theme interface. My Pastel and Summer type classes implement it.

As for the design patterns, component is used a lot. An example of its use is when 1 Cool303RootSummer composes 0 to 
many Cool303BoxSummer, and they both act the same way as they implement Cool303Theme. I also use the decorator pattern.
I use it when 1 Cool303ButtonPastel (or summer) extends 1 Cool303Button, which in turn extends 1 JButton. The
Cool303ButtonPastel just serves to decorate the JButton. My final design pattern is Model View Controller. An example
is where the application is the Controller, the Cool303Window is the model, and the Cool303WindowPastel and 
Cool303WindowSummer are the views. The final design pattern is the Strategy design pattern, as from application.java 
choosing the theme and sending to a Cool303Window subclass re-arranges everything.

