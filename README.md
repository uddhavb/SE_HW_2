# HW2 

## Design Patterns:   
  
**a.	Creational Patterns:**   
These design patterns are about class instantiation which can be classified into class creational and object creational. Two of its types are:   
**1.	Prototyping:**
This method specifies the kind of objects to be created using prototypical instance. New objects are created by copying this prototype. Here an abstract class is designed that specifies a clone method. All the cloned derivable classes are maintained in a dictionary. The abstract class defined uses a clone() method to get a polymorphic constructor capability. The class plays an active role in copying itself. The class of the object is hard wired into the new clones.   
**2.	Object Pool Design Pattern:**
Object pooling boosts performance by allowing to use objects without instantiating a class. Here a process gets objects from the pool as and when it requires and returns them bac to the pool when it is done. New objects are created as and when needed. Unused objects need to be cleaned up periodically.
    
**b.	Structural Patterns:**   
These design patterns are about class and object composition. Inheritance is used in structural class creation to compose interfaces, and structural object patterns are used to compose objects to obtain new functionalities. Two of its types are:    
**1.	Composite Design Pattern:**   
Hierarchies are formed by composing objects in tree structure. Individual objects and composition of objects can be treated equally. Here a base component class is defined that specifies the behavior that needs to be used uniformly across all primitive and composite objects. The primitive and composite classes are formed as a subclass of the component class.    
**2.	Façade Design Pattern:**    
As the name suggests, façade provides a unified interface for a set of interfaces in a subsystem. This higher level interface makes it easier to use the subsystem. It provides a single interface for a set of clients that want to use the subsystem and simplifies learning for them. It also decouples the subsystem from its many clients.
    
**c.	Behavioral Patterns: **   
These patterns are concerned with communication between the objects of various classes.   
**1.	Chain of Responsibility:**   
The receiving objects are chained together and a request is passed along the chain until an objects handles the request. The request is launched into a pipeline that has many objects that can handle it. It is an object oriented linked list with recursive traversal. Instead of senders and receivers keeping reference of every receiver, each sender keeps a reference to the head of a chain and each receiver keeps a reference to its successor.    
**2.	State Design Pattern:**    
An objects behavior is changed when it state changes. It appears to change its class. A state abstract base class is defined and different states of the state machine are represented as derived classes of the state base class. State specific behavior is defined in the state derived classes. A pointer is maintained to the current state in the context class and it is changed to change the state of the state machine.   
    
##Free Style:   

**1.	Broker Design:**  
The broker architectural patterns can be used to structure distributed software systems with components that are decoupled and interact by remote service invocations. These patterns offer good performace, scalability and reliability. The broker component in these architectures is responsible for forwarding requests, coordinating communication as well as transmitting results and exceptions.
The environment is distributed and heterogenous and a broker acts as the communication link between the subsystems. Servers register themselves to brokers and make services available to clients through	method interfaces.   
   
**2.	Model View Controller:**   
The concept of Model View Controller uses
Models to represent knowledge. There must be one to one correspondence between model and its sub parts and the represented world as viewed by the user.
A view is a visual presentation of a model that visually highlights certain parts of the model and suppresses others. A view is attached to a model and gets data necessary for the presentation by asking questions and it also updates the model by sending messages.
A controller is a link between the user and the system. It provides the user with input by arranging the various relevant views in appropriate places on the screen.   
    
**3.	Layer Patterns:**    
Here the whole task is divided into subtasks and each layer is assigned a set of tasks. These layers communicate with the layer immediately above and below them. Hence the functionalities of the layers are such that the any layer acts as a connector for two other layers. This applies to large systems that need decomposition. Also separate layers can be changed separately without affecting the other layers in any way. Networking protocols are the best known example for this type of design pattern.
Assume there are layer1, layer2, … layer x, … layer n.
The services provided by layer x to layer x+1 are composed of and derived from services generated by layer x-1.
    
## Selenium   
File containing the code uploaded as 'WebTest.java' in the repository.    
[WebTest.java](/WebTest.java) 

