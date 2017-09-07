# logs


## 9/4/17

###	tasks
- try to read up interfaces and abstracts and take notes
- create two files for abstract and interface
- create a whatis.md file to explain concepts

### what I learned about abstract class

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

### what I learned about interfaces

- properties declared in interfaces default as final
- interfaces cannot be instantiated 
- interfaces are slow compared to abstract classes
- a class can inherit multiple interfaces

### what I think an abstract class is 
I think an abstract class is a base class that you do not define 
the methods of the class. It is essentially a skeleton class where you 
create the methods and properties, but you do not write code for those methods.
I think you can assign values for properties in the classes. But when you want
add code into the methods then you need to extend it into a class so that you 
will finally be able to define the methods

### what I think a interface is 
I think an interface is similar to an abstract class, except that you can 
extend or **implement** multiple interfaces into one class as opposed to abstract
class can only  extend one. There is probably more to learn about it, but I think 
that is the major difference.