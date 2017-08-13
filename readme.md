# java reference


## data types


## oop


## arrays
- [how to create an array][array]

## collections

- [how to create a hash map][hashmap]
- [how to add key-values into the map][key-values]
- how to retrieves all the keys in the map[keySet]
- how to determine if a map is empty[isEmpty]
- how to receive all the values of a map[Entry]
- how to determine size of the map[size]

[key-values]:#how-to-add-key-values-into-the-map
[home]:#java-reference
[array]:#how-to-create-an-array
[hashmap]:#how-to-create-a-hash-map

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
- **javatpoint** Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.
- **my definition** It is an object that holds **key-value pairs** that you can customize to
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
