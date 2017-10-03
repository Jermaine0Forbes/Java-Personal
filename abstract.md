# abstract class


[what is an abstract class][what]

[home]:#abstract-class
[what]:#what-is-an-abstract-class

### what is an abstract class
- [jenkof](http://tutorials.jenkov.com/java/abstract-classes.html): A Java abstract class is a class which cannot be instantiated, meaning you cannot create new instances of an abstract class. The purpose of an abstract class is to function as a base for subclasses. 
- [javatpoint](https://www.javatpoint.com/abstract-class-in-java): 
- My definition: it is a base class that is used for a sub class to inherit
and define its methods

#### what I learned about abstract class

- An abstract class cannot be instantiated like a regular class can
- abstract classes can define methods within its classes, so it does 
not only create abstract methods. For example: 

```java
abstract class Example{
	
	// both of these work 
	
	abstract public void run();

	public void walk(){
		System.print.out("I am walking");
	}
}

``` 

