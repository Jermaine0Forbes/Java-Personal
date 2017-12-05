# Java Swing

## JButton

- [how to add name to button][nameBtn]


## JFrame

- [JFrame.setSize][setSize]
- [JFrame.setTitle][setTitle]
- [JFrame.setDefaultCloseOperation][closeOperation]
- [JFrame.setVisible][setvisible]
- [JFrame.setLocationRelativeTo][relativeTo]

## JLabel
- [how to add text to label][label]

## JPanel

- [JPanel.add][panel-add]
- [JPanel.setBackground][panel-background]

[label]:#how-to-add-text-to-label
[relativeTo]:#jframe.setlocationrelativeto
[panel-background]:#jpanel.setbackground
[panel-add]:#jpanel.add
[nameBtn]:#how-to-add-name-to-button
[closeOperation]:#jframe.setdefaultcloseoperation
[home]:#java-swing
[setSize]:#jframe.setsize
[setTitle]:#jframe.settitle
[setvisible]:#jframe.setvisible

### How to add text to label

**reference**
- [javat](https://www.javatpoint.com/java-jlabel)

```java

JLabel label = new JLabel("this is some text");

panel.add(label);

frame.add(panel);

```

[go back home][home]

### JFrame.setLocationRelativeTo

**reference**
- [java docs](https://docs.oracle.com/javase/7/docs/api/java/awt/Window.html#setLocationRelativeTo(java.awt.Component))

This sets the location of the window to be centered or not

```java
class Frame extends JFrame{

	public void Frame(){
		setTitle("This is a title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// this should center the window
	}
}
```

[go back home][home]

### JPanel.setBackground

Sets the background color of the panel. In order to change the color you have to
alter the **Color** class, in this example I only used black.

```java
	panel = new JPanel();

	panel.setBackground(Color.black);

	frame.add(panel);
```

[go back home][home]

### JPanel.add

```java
	panel = new JPanel();

		btn = new JButton("booty");

		panel.add(btn);// adds JComponents to the panel

		frame.add(panel);
```

[go back home][home]


### JFrame.setVisible

Allows the window JFrame to be visible, which is stupid since there is no reason
to make it invisible

```java
frame.setVisible(true);
```
[go back home][home]

### how to add name to button

```java

import java.awt.*;
import javax.swing.*;

public class JButton_1  {

	protected  JFrame frame;
	protected int height, width;
	protected JPanel panel;
	protected JButton btn;

	public JButton_1(int height,int width) {
		frame = new JFrame();
		this.height = height;
		this.width = width;

		frame.setTitle("This is a test title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(height,width);

		panel = new JPanel();

		panel.setSize(height,width);
		panel.setBackground(Color.black);

		btn = new JButton("booty"); // this creates and sets the name of the button


		btn.setBounds(50, 50, 50, 50);// this doesn't do shit for some reason

		panel.add(btn);// this adds the button to the panel and the panel get attached to the window

		frame.add(panel);


	}
```

[go back home][home]

### JFrame.setDefaultCloseOperation

when you click the exit button, it closes the application. If you did not have it
then it will just minimize the app

```java
import javax.swing.*;

public class Swing  {

	protected  JFrame frame;
	protected int height, width;
	protected JPanel panel;

	public Swing(int height,int width) {
		frame = new JFrame();
		this.height = height;
		this.width = width;
        frame.setTitle('This is a title');

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)// closes the window



	}

}
```
[go back home][home]


### JFrame.setTitle

```java
import javax.swing.*;

public class Swing  {

	protected  JFrame frame;
	protected int height, width;
	protected JPanel panel;

	public JButton_1(int height,int width) {
		frame = new JFrame();
		this.height = height;
		this.width = width;


		frame.setTitle('This is a title'); // this is it how it works

	}

}
```

[go back home][home]

### JFrame.setSize

```java
import javax.swing.*;

public class Swing  {

	protected  JFrame frame;
	protected int height, width;
	protected JPanel panel;

	public JButton_1(int height,int width) {
		frame = new JFrame();
		this.height = height;
		this.width = width;
		frame.setSize(height,width);

	}

}
```

[go back home][home]
