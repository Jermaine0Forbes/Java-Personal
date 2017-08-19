# java reference


## data types

Type | Size | Range
--- | --- | ---
byte | 8 bits | -128 to 127
short | 16 bits | -32,768 to 32,767
int | 32 bits | -2,147,483,648 to 2,147,483,647
long | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float | 32 bits | 3.40282347 x 10<sup>38</sup> to 1.40239846 x 10<sup>-45</sup>
double | 64 bits | 1.7976931348623157 x 10 <sup>308</sup>  to  4.9406564584124654 x 10<sup>-324</sup>

## string
- [how to use the trim method][trim]

## oop


## arrays
- [how to create an array][array]

## collections

### hashmap

- [how to create a hash map][hashmap]
- [how to add key-values into the map][key-values]
- [how to retrieves all the keys in the map][keySet]
- [how to determine if a map is empty][isEmpty]
- [how to receive all the values of a map][entry]
- [how to determine size of the map][size]

[trim]:#how-to-use-the-trim-method
[entry]:#how-to-receive-all-the-values-of-a-map
[size]:#how-to-determine-size-of-the-map
[isEmpty]:#how-to-determine-if-a-map-is-empty
[keySet]:#how-to-retrieves-all-the-keys-in-the-map
[key-values]:#how-to-add-key-values-into-the-map
[home]:#java-reference
[array]:#how-to-create-an-array
[hashmap]:#how-to-create-a-hash-map



### how to use the trim method
```java

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
