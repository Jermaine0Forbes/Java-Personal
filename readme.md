# JAVA REFERENCE



## String
- [how to use the trim method][trim]
- [how to use the substring][substring]

## Date

- [LocalDate.now][localD]
- [how to format dates][format-date]
- [DateTimeFormatter table][time-table]


## Classes


## Lambda Expressions

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

[time-table]:#datetime-table
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


### DateTimeFormatter Table

**reference**
- [java docs](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)

Letter|Date or Time Component|Examples
-|-|-
G|Era Designator|Text|AD
y|Year|1996; 96
Y|Week year|2009; 09
M|Month in year|July; Jul; 07
w|Week in year|27
W|Week in month|2
E|Day name in week|Tuesday; Tue
e/c|localized day-of-week|1
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
