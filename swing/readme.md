# Java Swing

## JButton

- [how to add name to button][nameBtn]


## JFrame

- [JFrame.setSize][setSize]
- [JFrame.setTitle][setTitle]
- [JFrame.setDefaultCloseOperation][closeOperation]
- [JFrame.setVisible][setvisible]

## JPanel

- [JPanel.add][panel-add]

[panel-add]:#jpanel.add
[nameBtn]:#how-to-add-name-to-button
[closeOperation]:#jframe.setdefaultcloseoperation
[home]:#java-swing
[setSize]:#jframe.setsize
[setTitle]:#jframe.settitle
[setvisible]:#jframe.setvisible

### JPanel.add

```java
	panel = new JPanel();

		panel.setSize(height,width);
		panel.setBackground(Color.black);

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
