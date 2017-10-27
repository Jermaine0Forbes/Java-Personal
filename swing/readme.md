# Java Swing

## JFrame

[setSize][setSize]
[setTitle][setTitle]


[home]:#java-swing
[setSize]:#setSize
[setTitle]:#setTitle

### setTitle

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

### setSize

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
