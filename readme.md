# JAVA REFERENCE



## String
- [how to use the trim method][trim]
- [how to use the substring][substring]

## Conversions
- [how to convert String to int][string-int]
- [how to convert String to double][string-double]
- [how to convert int to String][int-string]
- [how to convert char to String][char-string]

## Date

- [GregorianCalendar][greg-cal]
- [LocalDate.now][localD]
- [LocalDateTime][localDT]
- [How to format dates][format-date]
- [DateTimeFormatter table][time-table]

## Design Patterns
- [Singleton Pattern][singleton]

## Editors 
- [Eclipse shortcut keys][eclipse-shortcut]
- [How to create Getters and Setters in a class][eclipse-getset]

## Enumerations

- [how to create an enum][enum]
- [Enum.valueOf][enum-valueof]
- [Enum.values][enum-values]
- [Enum.ordinal][enum-ordinal]

## Classes

- [public, private, protected][access-modifiers]

## JAXB

- [how to create a JAXB][create-jaxb]

## Lambda Expressions
- [what is a lambda expression][what-lambda]

## Arrays
- [how to create an array][array]

**arraylist**
- [how to create an ArrayList][a-list]

## Collections

**hashmap**

- [how to create a hash map][hashmap]
- [how to add key-values into the map][key-values]
- [how to retrieves all the keys in the map][keySet]
- [how to determine if a map is empty][isEmpty]
- [how to receive all the values of a map][entry]
- [how to determine size of the map][size]

##  Scanner
- [how to use the scanner][scanner]
[create-jaxb]:#how-to-create-a-jaxb
[scanner]:#how-to-use-scanner
[singleton]:#singleton-pattern
[eclipse-getset]:#how-to-create-getters-and-setters-in-a-class
[eclipse-shortcut]:#eclipse-shortcut-keys
[greg-cal]:#gregoriancalendar
[char-string]:#how-to-convert-char-to-string
[string-double]:#how-to-convert-string-to-double
[string-int]:#how-to-convert-string-to-int
[int-string]:#how-to-convert-int-to-string
[enum-ordinal]:#enumordinal
[enum-values]:#enumvalues
[enum-valueof]:#enumvalueof
[enum]:#how-to-create-an-enum
[access-modifiers]:#public-private-protected
[what-lambda]:#what-is-a-lambda-expression
[localDT]:#localdatetime
[time-table]:#datetimeformatter-table
[format-date]:#datetimeformatterofpattern
[localD]:#localdatenow
[a-list]:#how-to-create-an-ArrayList
[substring]:#how-to-use-the-substring
[trim]:#how-to-use-the-trim-method
[entry]:#how-to-receive-all-the-values-of-a-map
[size]:#how-to-determine-size-of-the-map
[isEmpty]:#how-to-determine-if-a-map-is-empty
[keySet]:#how-to-retrieves-all-the-keys-in-the-map
[key-values]:#how-to-add-key-values-into-the-map
[home]:#java-reference
[array]:#how-to-create-an-array
[hashmap]:#how-to-create-a-hash-map

### how to create a jaxb 

<details>
<summary>
View Content
</summary>

So JAXB allows you to store values from an object into an XML file . 
The method name to store the file is called `marshall` which always reminds 
me of marshmellow. Anyways

1. create a simple class that has properties you can assign values to and
the **XML** element tags

```java
package jaxb;
import javax.xml.bind.annotation.*;

// you need to add this to the class that contain all the other elements
@XmlRootElement(name="Employee")
public class Employee {

	private String id, name, address;

	

	// This is an element you need to add if you want to store the properties in tags
	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public Employee(String id, String name, String address, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}


	public Employee(){

	}


}
```


2. Next you need to create a simple class that is going to store the values in XML 
with JAXB 

```java
package jaxb;

// make sure you add these libraries
import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.util.*;
import java.io.*;

public class EmployeeJAXB {


}

```

3. Next add the properties like path, that will create to store XML File. And xmlFile that will create a 
new file based on the path that you created 

```java

package jaxb;

// make sure you add these libraries
import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.util.*;
import java.io.*;

public class EmployeeJAXB {
private String path = "src\\data\\Employee.xml"; // the path to file you create
	 private JAXBContext jb; // this will be used to store or retrieve information 
	 private File xmlFile = new File(path);// this creates the new file that you will use later

}

```

4. now create a method that will store the properties and have the parameters of the method be the values 
of the Employee class 

```java
package jaxb;

// make sure you add these libraries
import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.util.*;
import java.io.*;

public class EmployeeJAXB {
private String path = "src\\data\\Employee.xml"; // the path to file you create
	 private JAXBContext jb; // this will be used to store or retrieve information 
	 private File xmlFile = new File(path);// this creates the new file that you will use later
	 
	 
	 	public void storeXML(String id, String name, String address){
		
	
			Employee emp = new Employee(id, name,address);



}
```


5.  in order to make the JAXB work you have to put it in a try and catch block like so. 
and also add the marshall methods because this tutorial is taking too long 

```
package jaxb;

// make sure you add these libraries
import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.util.*;
import java.io.*;

public class EmployeeJAXB {
private String path = "src\\data\\Employee.xml"; // the path to file you create
	 private JAXBContext jb; // this will be used to store or retrieve information 
	 private File xmlFile = new File(path);// this creates the new file that you will use later
	 
	 
	 	public void storeXML(String id, String name, String address){
		
	
			Employee emp = new Employee(id, name,address);

			try{



			Employee emp = new Employee(id, name,address,salary);
			jb = JAXBContext.newInstance(Employees.class);


			


			// this creates the marshall or store the properties in a XML file
			Marshaller ms = jb.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emps, System.out);
			ms.marshal(emps, xmlFile);


		}catch(JAXBException e){
			System.out.println(e.getMessage());
	}


	}
}

```

6. Now in a Main.java file  create an instance of EmployeeJAXB and call the method storeXML

```java

import java.util.*;

import jaxb.*;

public class Main {

	public static void log(String val){

		System.out.println(val);
	}

	public static void main (String[] args){

		EmployeeJAXB obj = new EmployeeJAXB();

	// this will now execute the JAXB shit
		obj.storeXML("2", "jermaine", "123 main st");



	}

}

```

</details>

[go back :house:][home]

### how to use scanner

<details>
<summary>
View content
</summary>
`import java.util.*;`

```java
Scanner scan = new Scanner(System.in);
		String[] data = new String[4];
		int x = 0;
		String[] questions = {"what is your name?", "what city do you live in ",
				"how old are you", "what race are you"};


		for( String val: questions){
			System.out.println(val);
			data[x] = scan.nextLine();

			x++;
		};
		scan.close();
		System.out.println("your answers were");

		for(String val: data){

			System.out.println(val);
		}
```
</details>


[go back home][home]


### Singleton pattern

```java 
public class SingletonSample {
   private static SingletonSample instance = null;

   private SingletonSample() {
   }

   public static SingletonSample getInstance() {
      if(instance == null) {
         instance = new SingletonSample();
      }
      return instance;
   }
}
```


[go back  :house:][home]

### How to create getters and setters in a class 

1. In eclipse right click on the mouse and look for the option **Source**, then look 
for the option **Generate Getters and Setters**

2. This will send you to a new window where you can select which property you want get or set 

[go back home][home]

### Eclipse shortcut keys 

<details>
<summary>
View Content
</summary>
**reference**
- [linkedin](https://www.linkedin.com/pulse/top-30-eclipse-keyboard-shortcuts-java-programmer-jayveersinh-solanki/)

key|description
-|-
ctr + alt + down | duplicates line
ctr + d | deletes line
ctr + f | opens up the find and replace window
ctr + shift + l | shows the shortcut keys
ctr + shift + f | organizes your code
</details>

[go back :house:][home]

### GregorianCalendar

Field|Default Value
-|-
ERA|AD
YEAR|1970
MONTH|JANUARY
DAY_OF_MONTH|1
DAY_OF_WEEK|the first day of week
WEEK_OF_MONTH|0
DAY_OF_WEEK_IN_MONTH|1
HOUR, HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND|0


**reference**
- [java docs](https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html)

```java

Calendar cal = new GregorianCalendar();

Date d = new Date();

cal.setTime(d);

System.out.println(cal.get(Calendar.YEAR)); // 2018

```

[go back home][home]

### How to convert char to String

Here are the two methods
- **Character.toString(char)**
- **String.valueOf(char)**

**reference**
- [How to convert Character to String and a String to Character Array in Java](https://examples.javacodegeeks.com/core-java/character/how-to-convert-character-to-string-and-a-string-to-character-array-in-java/)

**Character.toString(char)**
```java
char ch = 'J';

String string1 = Character.toString(ch);


```
**String.valueOf(char)**
```java
char ch = 'J';

String string1 = String.valueOf(ch);

```

[go back home][home]

### How to convert String to double

Here are the several methods to do it
- **Double.parseDouble(string)**
- **Double.valueOf(string)**
- **new Double(string)**

**reference**
- [Java Convert String to Double examples](https://beginnersbook.com/2013/12/how-to-convert-string-to-double-in-java/)

**Double.parseDouble(string)**
```java
String str="122.202";
double var= Double.parseDouble(str);

```

**Double.valueOf(string)**
```java
String str="122.202";
double var= Double.parseDouble(str);

```

**new Double(string)**
```java
String str3 = "999.333";
double var3 = new Double(str3);
```

[go back home][home]

### How to convert String to int

There are several methods to do it

- **Integer.toString(string)**
- **Integer.valueOf(string)**

**Integer.toString(string)**
```java
String number = "10";
int result = Integer.parseInt(number);
System.out.println(result);

```

**Integer.valueOf(string)**
```java
String number = "10";
Integer result = Integer.valueOf(number);
System.out.println(result);
```

[go back home][home]


### How to convert Int to String

There are several methods to convert an integer to a string here are 
a couple 

- **String.valueOf(int)**
- **Integer.toString(int)**
- **String.format(String format, Object... args)**
- **StringBuilder.toString()**
- `String numberAsString = "" + number;`

**String.valueOf(int)**
```java
int number = -782;
String numberAsString = String.valueOf(number);

```
**Integer.toString(int)**
```java
int number = -782;
String numberAsString = Integer().toString(number);

```
**String.format(String format, Object... args)**
```java
int number = -782;
String numberAsString = String.format ("%d", number);

```
**StringBuilder.toString()**
```java
int number = -782;
StringBuilder sb = new StringBuilder();
sb.append(number);
String numberAsString = sb.toString();

```

[go back home][home]

### Enum.ordinal

Shows the index number of the enum as if they were like arrays

```java

public enum Cities{

		FLORIDA("Miami"),
		GEORGIA("Atlanta"),
		NEBRASKA("Omaha");

		public String get;
		private Cities(String city){

			get = city;
		}

		public String phrase(){
			return get+" is a great place to live";
		}
	}

	........................
	
for(Cities val : c){

			System.out.println(val.ordinal() +": "+ val.get);// Will output the index of the enum
		}

```

**Output**
```java
0: Miami
1: Atlanta
2: Omaha

```

[go back home][home]

### Enum.values 

The values **method** returns an array of all the enum constants. You can read through them 
with the for each loop

```java
public enum Cities{

		FLORIDA("Miami"),
		GEORGIA("Atlanta"),
		NEBRASKA("Omaha");

		public String get;
		private Cities(String city){

			get = city;
		}

		public String phrase(){
			return get+" is a great place to live";
		}
	}

	public static void main(String[] args) {

		Cities[] c = Cities.values();// This is how you collect the values

		for(Cities val : c){ // this is you print out the values

			System.out.println(val.ordinal() +": "+ val.phrase());
		}


	}
```


[go back home][home]

### Enum.valueOf

This **method** is pretty useless, it does not return the contained value of the 
ENUM constant it just returns the name of the string that you put into the method

```java
public class Enum2 {

	public enum MATH{

		ADD("add something"),
		SUB(" subtract something"),
		DIV("divide something");

		public String get;

		private MATH(String val){

			get = val;


		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MATH  x = MATH.valueOf("ADD");// Me using the method

	  System.out.println(x); // This literally only prints out "ADD", you know, the string I already put in
	}

}
```

[go back home][home]

### How to create an enum

**reference**
- [geeksforgeeks](https://www.geeksforgeeks.org/enum-in-java/)

```java
public enum Animal{
		DOG("dog"),
		CAT("cat"),
		OSTRICH("ostrich");

		public String get;

		private Animal(String val){
			get = val;
		}
	}
	
	public static void main(String args[]){
	
		Animal a = Animal.DOG;
		
		System.out.println(a.get); // outputs: dog
	
	}

```

[go back home][home]

### Public, Private, Protected

**references**
- [jenkov](http://tutorials.jenkov.com/java/access-modifiers.html)

Public, private, and protected are keywords that are called access modifiers. 
You can apply these modifiers to classes, class properties, and class methods. 
The reason you use the modifiers is to deny or allow access to the members.

#### Protected 

The protected modifier allows the **class, property, or method** to be used 
inside the class and outside the class. But, it will not work outside the package 
unless you switch it to public

Scenarios | Status 
-|-
Inside Class | Allows
Outside Class | Allows 
Outside Package | Denies

**inside class**
```java

package Animal;

public class Cat {
    
    protected String sound = "meow";

    public Cat(){

        System.out.println("created cat");
    }

    protected String getSound(){

        return this.sound;
    }

}


**outside class**
```java

package Animal;

public class Main {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // works
    }

}

```


**outside package**
```java

package otherPackage;

import Animal.*;

public class Other {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // does not work
    }

}

```

[go back home][home]


#### Public 

The public modifier allows the **class, property, or method** to be used 
inside the class, outside the class, and even outside the package that contains 
the class

Scenarios | Status 
-|-
Inside Class | Allows
Outside Class | Allows 
Outside Package | Allows

**inside class**
```java

package Animal;

public class Cat {
    
    public String sound = "meow";

    public Cat(){

        System.out.println("created cat");
    }

    public String getSound(){

        return this.sound;
    }

}


**outside class**
```java

package Animal;

public class Main {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // works
    }

}

```


**outside package**
```java

package otherPackage;

import Animal.*;

public class Other {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // works
    }

}

```

[go back home][home]

#### Private


The private modifier denies the **class, property, or method** to be used 
inside the class, outside the class, and even outside the package that contains 
the class

Scenarios | Status 
-|-
Inside Class | Denies
Outside Class | Denies 
Outside Package | Denies

**inside class**
```java

package Animal;

public class Cat {
    
    private String sound = "meow";

    public Cat(){

        System.out.println("created cat");
    }

    private String getSound(){

        return this.sound;
    }

}


**outside class**
```java

package Animal;

public class Main {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // does not work
    }

}

```


**outside package**
```java

package otherPackage;

import Animal.*;

public class Other {
    
    public static void main(String[]args){

        Cat c = new Cat();

        c.getSound(); // does not work
    }

}

```

[go back home][home]

### What is a Lambda Expression

**reference**
- (jenkov)[http://tutorials.jenkov.com/java/lambda-expressions.html]

A lambda expression is a way to write a shorthand function. It is like
the fat arrow function in javascript, except more clunky and unnecessary.
The reason why it is clunky and not efficient is that you need to create
an create a single method interface for to work, and you also need to have
Java 8 installed

```java

class Cat{

    public Cat(){
        System.out.println("Cat created");
    }

    public void meow(String sound){

       Lambda c = (sound) -> System.out.println("The cat said : "+sound);

       c.method();
    }

    public static void main (String args[]){

        Cat c = new Cat();

        c.meow();
    }

    interface Lambda{
        public void method(String sound);
    }
}
```

[go back home][home]

### LocalDateTime

**reference**
- [docs](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)


```java
LocalDateTime ldt = LocalDateTime.now();

DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" M - d - y");

System.out.println(ldt.format(dtf))
```
#### Methods

Returns | Method | Description

-|-|-
DayOfWeek|getDayOfWeek|Gets the day-of-week field, which is an enum DayOfWeek.
int|getDayOfYear|Gets the day-of-year field.
int|getDayOfMonth|Gets the day-of-month field.

[go back home][home]

### DateTimeFormatter Table

**reference**
- [java docs](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)

Letter|Date or Time Component|Examples
-|-|-
G|Era Designator|AD
y|Year|1996; 96
Y|Week year|2009; 09
M|Month in year|July; Jul; 07
w|Week in year|27
W|Week in month|2
E|Day name in week|Tuesday; Tue
e/c|localized day-of-week|1
D|day-of-the-year|189
d | day-of-the-month|27
a|am-pm-of-day|PM
h|clock-hour-of-am-pm (1-12)|12
k|clock-hour-of-am-pm (1-24)|14
m|minute-of-hour|30
s|second-of-minute|55
V|time-zone ID| America/Los_Angeles; Z; -08:30
z|time-zone name|Pacific Standard Time; PST

[go back home][home]

### DateTimeFormatter.ofPattern

this will change the pattern format of the date

```java
date = LocalDate.now();// this returns the current date

formatter = DateTimeFormatter.ofPattern("EEEE MMMM Y");// this modifies the date

dateString =  date.format(formatter)// this will change the output of the date

```

[go back home][home]

### LocalDate.now

Apparently this is a new class from Java 8 to use to get the Date

```java
import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDate1 {

	LocalDate date ;

	DateTimeFormatter formatter;

	public LocalDate1() {
		// TODO Auto-generated constructor stub

		date = LocalDate.now();// this returns the current date

		formatter = DateTimeFormatter.ofPattern("EEEE MMMM Y");// this modifies the date



		System.out.println(date.format(formatter));// this prints out the date


}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new LocalDate1();

	}

}
```

[go back home][home]


### how to create an ArrayList

```java

ArrayList<String> arr = new ArrayList<String>();

		// this is how you add values to the list		
		arr.add("Mario");
		arr.add("Luigi");
		arr.add("Wario");
		arr.add("Peach");

		Iterator loop = arr.iterator();

		// this one way to output the list
		while(loop.hasNext()){
			System.out.println(loop.next()+", ");
		}

		// outputs

		Mario,
		Luigi,
		Wario,
		Peach,

```
- here are the other ways to output an ArrayList

```java

// second way to do this

		for(String val:arr){
			System.out.println(val+'+');
		}

// third way to do this

		int x = arr.size();

		for(int y = 0; y < x ; y++){

			System.out.println(loop.next());

		}
```
[go back home][home]



### how to use the substring
- returns part of a string that was cut off based on the
 position of the index number

```java

    String msg = "This is a very long winded message";

    msg = msg.substring(5);

    System.out.println(msg);

    //ouputs

    is a very long winded message
```

[go back home][home]


### how to use the trim method
- this method trims whitespace from the left and right side

```java
    String msg = "This is my sad World            ";
    String exc = "!@#$%^";

    String both = msg+exc;
    System.out.println("Without trim!");
    System.out.println(both);

    // outputs
    Without trim!
    This is my sad World        !@#$%^

    System.out.println("\n With trim");
    msg = msg.trim();
    both = msg+exc;
    System.out.println(both);


    // outputs
    With trim!
    This is my sad World!@#$%^

```

[go back home][home]

### how to determine size of the map
- map.size() will give you the number

```java

    animals.put("whale", 5000);
    animals.put("cheetah", 230);
    animals.put("peacock", 40);
    animals.put("eagle", 15);
    animals.put("giraffe", 2350);

    System.out.println(animals.size)

    // output
    5
```
[go back home][home]

### how to receive all the values of a map
- map.values() will return all the values

```java

    animals.put("whale", 5000);
    animals.put("cheetah", 230);
    animals.put("peacock", 40);
    animals.put("eagle", 15);
    animals.put("giraffe", 2350);

    System.out.println(animals.values());

    //  output
    [5000, 2350, 40, 15, 230]


```
[go back home][home]

### how to determine if a map is empty
- map.isEmpty returns a boolean value of whether the map is empty or not

```java
    Map <String , Integer> animals = new HashMap <>();

    animals.isEmpty();
    // will return true because I did not add any values
```
[go back home][home]

### how to retrieves all the keys in the map
- map.keySet returns all the keys in a array like output

```java

Map <String , Integer> animals = new HashMap <>();

		animals.put("whale", 5000);
		animals.put("cheetah", 230);
		animals.put("peacock", 40);
		animals.put("eagle", 15);
		animals.put("giraffe", 2350);

    System.out.println(animals.keySet)

    // output
    [whale, giraffe, peacock, eagle, cheetah]

```
[go back home][home]

### how to add key-values into the map
- easy, it is with the put method

```java
 map.put(key,value);
```
- example

```java

	Map <String,Integer> animals = new HashMap <>();

	animals.put("dog",1);
	animals.put("beaver",2);
```

[go back home][home]


### how to create a hash map
#### what is a hash map?
- **javatpoint**: Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.
- **my definition**: It is an object that holds **key-value pairs** that you can customize to
be any data type that you like

```java
	Map <String,Integer> animals = new HashMap <> ();
```
[go back home][home]

### how to create an array
- there are several ways to create an array
1. Here is the first option

```java

	String[] arry = new String[4];
	// this declares an array, and states how many items will be in it
```
2. the second option

```java
	int[] arry = {1,2,5,9};
	// you declare the array and add in the values immediately
```
3. the third option is similar to the first option

```
	String arry[] = new String[9];
```

[go back home][home]
