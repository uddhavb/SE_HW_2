# HW2 

## Design Patterns:   
  
**a.	Creational Patterns:**   
These design patterns are about class instantiation which can be classified into class creational and object creational. Two of its types are:   
   
**1.	Prototype Design Pattern:**
This method specifies the kind of objects to be created using prototypical instance. New objects are created by copying this prototype. Here an abstract class is designed that specifies a clone method. All the cloned derivable classes are maintained in a dictionary. The abstract class defined uses a clone() method to get a polymorphic constructor capability. The class plays an active role in copying itself. The class of the object is hard wired into the new clones. Prototype co-opts one instance of a class for use as a breeder of all future instances.   
          
**2.	Object Pool Design Pattern:**
Object pooling boosts performance by allowing to use objects without instantiating a class. Here a process gets objects from the pool as and when it requires and returns them back to the pool when it is done. New objects are created as and when needed. Unused objects need to be cleaned up periodically. It is desirable to keep all reusable objects that are not currently used in the same object pool. Object pools are usually implemented as singletons.
     
**b.	Structural Patterns:**   
These design patterns are about class and object composition. Inheritance is used in structural class creation to compose interfaces, and structural object patterns are used to compose objects to obtain new functionalities. Two of its types are:    
    
**1.	Composite Design Pattern:**   
Hierarchies are formed by composing objects in tree structure. Individual objects and composition of objects can be treated equally. Here a base component class is defined that specifies the behavior that needs to be used uniformly across all primitive and composite objects. The primitive and composite classes are formed as a subclass of the component class. Each Composite object "couples" itself only to the abstract type Component as it manages its children. Child management methods must be defined in the composite class.    
     
**2.	Façade Design Pattern:**    
As the name suggests, façade provides a unified interface for a set of interfaces in a subsystem. This higher level interface makes it easier to use the subsystem. It provides a single interface for a set of clients that want to use the subsystem and simplifies learning for them. It also decouples the subsystem from its many clients. Facade objects are often singletons because only one facade object is required. The client is coupled to the Facade only. It needs to be decided whether new facades are needed to be created. 
    
**c.	Behavioral Patterns:**   
These patterns are concerned with communication between the objects of various classes.   
**1.	Chain of Responsibility:**   
The receiving objects are chained together and a request is passed along the chain until an objects handles the request. The request is launched into a pipeline that has many objects that can handle it. It is an object oriented linked list with recursive traversal. Instead of senders and receivers keeping reference of every receiver, each sender keeps a reference to the head of a chain and each receiver keeps a reference to its successor. We need to make sure that there exists a safety net to catch any requests which go unhandled.   
    
**2.	State Design Pattern:**    
An objects behavior is changed when it state changes. It appears to change its class. A state abstract base class is defined and different states of the state machine are represented as derived classes of the state base class. State specific behavior is defined in the state derived classes. A pointer is maintained to the current state in the context class and it is changed to change the state of the state machine. A state derived class is needed to be created for each domain state. These derived classes only override the methods they need to override.   
    
## Free Style:   

**1.	Join Design Pattern:**    
Provide a way to create concurrent, parallel and distributed programs by message parsing. This programming model uses communication constructs instead of threads and locks to abstract the complexity of the system and to enhance scalability. The focus here is on a sequence of messages that are taken in by a group of channels. The template uses join calculus and pattern matching. This is done by allowing the join  definition of several messages by matching concurrent calls and message patterns. It makes it easier for the entities to communicate and deal with multi-threaded programming paradigm.    
   
**2.	Thread Pool Pattern:**   
A thread pool is a software design pattern for achieving concurrency of execution in a computer program. A thread pool maintains multiple threads which are waiting for tasks to be allocated for concurrent execution. This is done by a supervising program. The pool of threads helps to increase performance of the system by preventing the creation and deletion of threads that may be needed for short time periods. The number of threads depends on the resources available to the computer running the program. Resources may be memory, processors, network sockets etc. The threads can be maintained in priority queues with separate queues for completed threads, pending threads, etc.
    
**3.	Layer Patterns:**    
Here the whole task is divided into sub tasks and each layer is assigned a set of tasks. These layers communicate with the layer immediately above and below them. Hence the functionalities of the layers are such that the any layer acts as a connector for two other layers. This applies to large systems that need decomposition. Also separate layers can be changed separately without affecting the other layers in any way. Networking protocols are the best known example for this type of design pattern.
Assume there are layer1, layer2, … layer x, … layer n.
The services provided by layer x to layer x+1 are composed of and derived from services generated by layer x-1.
    
## Selenium   
File containing the code uploaded as 'WebTest.java' in the repository.    
[WebTest.java](/WebTest.java) 

