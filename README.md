# Mr-Potato-Head_App

Mr. Potato Head (thanks to Victoria Kirst for original assignment idea and images!) Write an app that displays a "Mr. 
Potato Head" toy on the screen as an ImageView. The toy has several accessories and body parts that can be 
placed on it, such as eyes, nose, mouth, ears, hat, shoes, and so on. We will provide you with image files for 
each body part and accessory, such as body.png, ears.png, hat.png, and so on. Initially your image view 
should display only the toy's body, but if the user checks/unchecks any of the check boxes below
the toy, the corresponding body part or accessory should appear/disappear. The way to display the various 
body parts is to create a separate ImageView for each part, and lay them out in the XML so that they are 
superimposed on top of each other. You can achieve this with a RelativeLayout in which you give every 
image the same position, though you should probably nest it in some other overall layout for the screen. The 
check boxes should align themselves into a grid of rows and columns. You can set whether or not an image (or 
any other widget) is visible on the screen by setting its android:visibility property in the XML, and/or 
by calling its setVisibility method in your Java code. The setVisibility method accepts a parameter 
such as View.VISIBLE or View.INVISIBLE. There is also a getVisibility method if you need to check 
whether a widget is currently visible.
