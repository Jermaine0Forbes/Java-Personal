# logs

---




## 3/2/18


## jaxb tutorial links 

:link: https://www.javatpoint.com/jaxb-tutorial
:link: https://www.javacodegeeks.com/2014/12/jaxb-tutorial-xml-binding.html


### how to create a `List`

:link: http://tutorials.jenkov.com/java-collections/list.html

```java
List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List listD = new Stack();
```

### if file exists

checking to see if a file exists 

```java
File f = new File(filePathString);
if(f.exists() && !f.isDirectory()) { 
    // do something
}

```

### using jaxb and appending data to xml files 

**Server**
```java
package com.tools;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "server")
public class Server {

    private String servername;
    private String ipaddress;
    private int port;

    public Server() {
    }

    public Server(String servername, String ipaddress, int port) {
        super();
        this.servername = servername;
        this.ipaddress = ipaddress;
        this.port = port;
    }

    @XmlElement
    public String getServerName() {
        return servername;
    }

    public void setServerName(String servername) {
        this.servername = servername;
    }

    @XmlElement
    public String getIpAddress() {
        return ipaddress;
    }

    public void setIpAddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    @XmlElement
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return servername + " " + ipaddress + " " + port;
    }
}
```
**Servers**
```java
package com.tools;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "servers")
public class Servers {

    private List<Server> servers;

    public List<Server> getServers() {
        return servers;
    }

    @XmlElement(name = "server")
    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    @Override
    public String toString() {
        return servers.toString();
    }

}
```

**Main File**
```java
package com.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ToolConfiguration {
    public static void main(String args[])
    {
        String configFileName = "/config.xml";
        File configFile = new File(ToolConfiguration.class.getResource(configFileName).getFile());
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Servers.class);
            // Read XML
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Servers servers = (Servers) unmarshaller.unmarshal(configFile);

            Server server = new Server("abv", "1.9.3.5", 8080);

            List<Server> serversList = servers.getServers();
            serversList.add(server);

            servers.setServers(serversList);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(servers, configFile);

            /*List<Server> serversList = servers.getServers();
            for (Server server : serversList) {
                System.out.println(server.toString());
            }*/

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
```


## 11/7/17

### shit about threads

- when you execute `Thread t = new Thread();`, it is not running until you write
out the start method `t.start()`, that is when it is runnable state.
	- when it is in **runnable state** it doesn't execute code, but it now has the
	ability to execute code
- There are four types of states that threads can be in and that is
**sleep, wait, blocked, and running**
- the sleep method accepts time in milliseconds



## 10/6/17

### tasks
- just learning more about threads, and hopefully remember to take notes

## 10/5/17

### this is one way to run a thread

```java

Downloader implements Runnable{
	private String url ;

	public Downloader(url){
		this.url = url;
	}

	public void run(){
		System.out.println(url);
	}
}

Downloader d = new Downloader();

Thread t = new Thread(d)

t.start();

```

## 10/3/17

### tasks
- learn about multithreading
- practice multithreading
- create a guide about multihthreading




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
