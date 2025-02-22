Data types

# Java run behind the scene

    - JRE = JVM + LIB;
    - JVM Is platform dependet. but java code is platform indepedent.
    - SOURCE code -> byte code ->(jvm) -> machine code.

# data types.

    1. Primitive(builtin)
            - integer-> byte(1b), short(2b), int(4b) , long(8b)
                - when we define long , end number with 'l'. For eg long a = 23l;
                - u can define in any base for eg int a = 0b101 // 5, int b = 0x7f;
                - u can add underscore between digits for eg int num = 2_3 //23
            - float-> double(8b), float(4b)
                - java takes default for float is double
                - double= 2.3; float= 2.3f. To define as float, need to explicitly use 'f' after number.
            - char(2b)
                - always define in single quote
            - boolean
                - true or false only.
    2. Non primiitve
            - String
                - String s "yasj"

# literals

    - assigned value to variable is called literal

# type conversion and casting

    - implicit type convert -> conversio
    - explicit type convert -> casting.

# operators

    - airthmeic - +, - , / , *, %
    - relational - <, >, >=, <=, ==, !=
    - logical- And(&/&&), or(|/||), not(!), XOR

# ternary operator

    - let res = 12 >13 ? 12 : 13;

# switch case

    // older way
    let n = 1
    switch(n){
        case 1;
            sout("mon");
            break;
        case 2:
            sout("tue")
            break;
        default:
            sout("sdfsdf");
    }

    // newer way
    String day = "mon";
    switch(day){
        case "sat", "sun" -> Sout("alarm 6am"); // if day is either sat or sun
        case "mon"-> sout("alarm 8am");
        default -> sout("alarm 7am);
    }
    - no need of break
    - eiher use -> or :
    - if using '->' user '->'.
    - you can return value from switch.

    String res = ""
    res = switch(day){
        case "sat", "sun" -> "6am";  // return "6am";
        case "mon"-> 7am;
        default -> 8am;
    };
    sout(res)

    - if u dont want '->' and use ':'. Then we have to use keyword 'yield' with ':'
     res = switch(day){
        case "sat", "sun" : yield "6am";  // return "6am";
        case "mon": yield "7am";
        default : yield "8am";
    };

# method overloading

    - function with same name but differ in no of params or type of params.

# jvm

- it has two main things
  - stack memory
    - every function has separate stack.
    - local variable are part of stack
    - refrence variable store the object address which is in heap memory.
  - heap memory (can expand)
    - obj reside in heap
    - instance variables are part of heap
    - method defination part of heap actual implementaion will be in stack

# array

    - int nums[] ={3,2,5,8}
    - int nums[] = new int[4] // default initialize value with 0
    - int nums[][] = new int[3][4]
    - jagged array
        - int nums[][]= new int[3][] // jagged array where each arr size could be different so we need to explicitly tell the each arr size
         nums[0] = new int[3]
        nums[0] = new int[4]
        nums[0] = new int[5]
    - nums.length: actual length
    - array of objects
        - Student students[]= new Student[3]; // this will only create student array but u need to still create separately each studemt obj
        student[0] = new Student();
        student[1] = new Student();
        student[2] = new Student();

# for enhanceed loop

     - we dont want to explicitly defines the length or sometime we dont want to worry or care about the length
     - no need to define index or  counter and all unlike normal for loop
     - which wok on array and array type of data.
     int nums[] = new int[4];
     for(int n: nums){
        sout(n)
     }

# string

    - it should be in double quotes. String name = "yash";
    - two ways u can create string
        - String name= "yash"
        - String name = new String("yash")

    - In heap we have string contant pool.
    - It means when we create a string, it can be mutate, it is fixed.
    - if we try to concate to the current string it will create fresh new string the refrence variable point to the concated string.
    - let s1= "yash"
        s1 = s1+"gandhi"
        now here  we did not change "yash" string, instead a new string object will be created having  value "yash gandhi" that is now being referenced by s1 and there is no reference variable who is pointing or referring "yash" string. Since "yash" string obj is not being refrenced by any refrence variable it will picked by grabage collector.
    - Also if we create the same string that is already there in string pool it will not duplicate the same string object.
        - let s1 ="yash"
        - let s2 ="yash"
        s1==s2 // true bcz "yash" will not be created twice in the heap since both string contents are same. thats why reference variable s1 and s2 poinitng the same only one string object "yash".
    - In short, in java string is immutbale.
    - if u want mutuable string go for stringbuffer or stringbuilder.

# string buffer and string builder

    - SB are mutuable
    - StringBuffer sb  = new StringBUffer();
        - it will give buffer size 16 character by default.
        - sb.capacity() // 16
        - sb.length() // 0
    - StringBuffer sb  = new StringBUffer("yash);
        - sb.capacity() // 20 (16+4)
        - sb.length() // 0 4
    - convert SB to string. sb.toString()
    - string builder is same as String buffer. only one diff string buffer is thread safe and string builder is not.

# staric members.

    - shared by all the objects.
    - ClassName.staticvariable = "value".
    - ClassName.staticFun()
    - static variable can be use inside non static function
    - but non static variable cannot be use inside static fn. Indirectly we can use by pass obj as parameter inside the static fn.

# static block

    - we can use to instaitate static variable.
        syntax
        class Mobile{
            static name= "phone"
            static { // static block
                sout ("name", name)
            }
        }
    - irrespective how many times u create obj, it is called only one time at the time class load in jvm.
    - since it is getting called when the class load, so automatically it will be called before constructor.
    - without creating single object of a class static block wont execute since the class is not load. so to run the static block we atleast need one obj.
    - but if really want to run static block without having a single obj, we can acheve using java class "cass"
         - class.forName("Moile") // heere Mobile is the class. This load the class and executes the static block.

# encapsulation

    - no one from outside can direcly use. so it encapsule data inside class. aONly that class method has the access on the data.
    - making the class variable private, allow only that class method to access the class variable.
    - so through class method only u can set and get the class variable.

# constructor

    - it is method
    - constructor does not have return type
    - name should same as class
    - everytime create obj, it call construtor.
    - default constructor does not have any args, while parametrized has some args.
    - if u dont mention any constructor, java creates default constructor.
    - but if u define parametised constructot then java wont create default constructor.

# Naming convention

    - class, interface name should start with capital letter ( eg MyClass)
    - variable and method - start with small letter  ( eg myFun)
    - constans- all caps. (eg WEEKDAYS)

# inheritance

    - reuse the parent class features
    - multilevel iherotance (A <- B <- C). B inherits A features and C inherits B feature. Automatically  C also inherits A featuer since B     inherits A features.
    - Single level (A <- B).
    - Multiple inheritance does not work. Since it is possible two same function are present in both A and B class,  so C wont know which one to inherit thats why java does not support multiple inheritance. (A<-B->C) not possible.

    - Every class extends Object class in java  implicitly

    - if we want to override the function of parent class we can do it. In java, if i create child obj and call any function. It search first in its own class if it does not find it will go to parent class.

    - every class constructor by default has super() method. which call parent constructor.

    -  must refer #up and down casting below.

    // need more understanding of class variable overriding.

    - so basically ParentClass p = new ChildCLass();
    so with p object we can only call the methods which are present inside ParentClass. if you try to call
    a method which is only declared and defined in ChildClass that wont be possible.

# packages

    - it simply means folder.
    - you put related code/files inside a folder/package
    - for a java file belong to package
        just write
            package packagname; // first line of the code. for eg package test;
    - if any outside files from the package wants to acces class from that package it needs to import.
        import test.CalClass
        import test.AdvCalClass
        one more thing instead of two import, we could write
            import test.*; // remember * demotes all the files from the test folder, also '*' does not denote all the folder always denotes files.
    - When we use string class or System class we never write import, bcz java implicitly import from java.lang package.

# access modifier

    | cases                          | private | public | default | protected |
    | -----                          |  -----  | -----  | ------  | --------- |
    | same class                     |    yes  |   yes  |  yes    |  yes      |
    | same  package  subclass        |    no   |   yes  |  yes    |  yes      |
    | same  package non subcalss     |    no   |   yes  |  yes    |  yes      |
    | different  package  subclass   |    no   |   yes  |  no     |  yes      |
    | different  package non subclass|    no   |   yes  |  no     |  no       |

    - advices
        - two public class can't possible in one file.
        - one file one class.
        - make class public.
        - instance variable make private.
        - make your fn public.
        - try to avoid use default.
        - if u want other subclass only access from different package make it protected.

# polymorphism

    - many behaviour.
    - two types
        - compile time / early time binding for eg overloading
        - run time / late binding for eg overriding- We also call Dynamic method dispatch
        - Parent p = new Child() // Assume Child extends Parent.
            - so here p.show() // it will search show function first in child class if it finds it execute that only but if it does not find will execute the parent one.
            - so basically at run time we decide which methods to execute depends on the which class obj created, not the reference variable.

# final

- final keyword can be use with class, vairable , methid
- final is like Const in javascript. Means the value cant be changes, making constans
- for eg final num=2;
- if final use with class, then no other class is allwoed to extent the final class.
- if final use with method, then the child class cannot override the final method.

# Object class

    - when ever we print of any class obj, it gives className@hashcode.
    - basically java call .toString() method of object class when we write sout(myClassObjRef) basically means sout(myClassObjRef.toString()) // myClass@somehascode.
    - since every class extend object class. so u can override  toString method based on ur req.

# upcaasting and downcasting.

    - whenever we assign child obj to parent ref it is upcasting.
        for eg Parent p = new Child();  implictly java so this Parent p = (Parent) new child();
        // also notice since p is reference varaiable of class Parent so it can not acces method of class Child
    - whenever we assign  Parent class ref to child class ref it is downcasting.
        for eg Child c = (Child) p.

# warapper clas

    - for every prmitive we have classes like Integer, Double,  Character.
    - Interger num = new Integer(8); // sout(num) -> 8 , also this way depicrate warning come
    - Integer num = 8; // this is the new way
    - int num =10;
        Integer i = num;
        so bascailly num is primtive value and assigning to i object is called auto boxing since it convert num to obj
        so it called AutoBoxing.
    - int num2 = i.intValue()
        this is called autounboxing
    - paresInt basically convert a number string to numbegit remote add origin https://github.com/ganyash/revisit-core-java.gitr
         Integer.parseInt("12") // 12.

# abstract

    - if there is an abstract method in the class, the class also abastract.
    - abstract method cannot be defined it can only decalred that no open and close flower brackets.
    - object of abstract class cannot be created.
    - if any class extend abstract class, it must implement all the abstract method of an abastract class.
    - Note u cannot create obj of abstract class but u can create abstract class refrence variable,
    - Abstract clas may or may noy have abstract method.

# inner class

    - A class inside a outer class
    - A a= new A();// outer class obj;
    - A.B b = a.new B(); // proving class B is non static
    - A.B b = new A.B(); // proving class B is  static class
    - Yes we can have class static as well providing that is a inner otherwise class can't be static.

# anyonynms inner class

    - class A{
        public void show(){
            sout("printA")
        }
    }

    public class B{
        public static void main(String []){
            A a= new A()
            {
                 public void show(){
                    sout("print inner class");  // baically we are extending parent (A) class here kindof.
                }
            };
            a.show() // print inner class
        }

    }

# use of anyonynms inner class when we have abstract class

    - since we can't create object of an Abstract class, but with the help of 'anyonynms inner class', we can do that

    - foreg
        - abstract class A{
        public abstract void show();
    }
     public class B{
        public static void main(String []){
            A a= new A()  // it is possible since we creating object of ''anyonynms  inner class' not the abstract class obj.
            {
                 public void show(){
                    sout("print inner class");
                    // since we this is kind of inheritance, so it must implement all the  method classA .
                }
            };
            a.show() // print inner class
        }

    }

    - overall purpose of ''anyonynms inner class' is , when we know the child class obj is just creating once, so inorder to define new child class use 'anyonynms inner class'

# interface

    - when an abstract class only contains abstract method then we have another way which is interface.
    - interface is not class.
    - by default every method of interface is public abstract
    - interface  A {
            vois show();
            void config(); // default public abstract.
    }
    - class implements interface
    - if class implements interface // then it needs to define all the method of interface, otherwise the class become the abstract class
    - if u define variable in interface, they are default static and final.

    - class can implements more than one interface
        class C implements A, B {  // assume B is an interface too.

        }
    - an interface  can extends another interface.
    - when class implements interface, it also get interdace data member, which obviously are static and final.

# enums

    - everthing is object in java
    - so emum is kinda class
    - enum Status {
        Running, Failed, Pending. // so these are basically object of Status, these also called named constants
    }

    - public class Demo {
        psvm {
            Status s = Status.Running;
            sout(s) // Running

            Status[] s = Status.values(); //gives array of values.
            sout(s[0]) //Running
        }
    }

    - also these methods like values, ordindal are coming from enum class.
        sout(s.getClass().getSuperClass()) // java.lang.Enum

    - since enum is class so
        enum Laptop {
            Macbook(2000), XPS(2100), Dell; // here these are object of laptop, so basocally we are calling constructor of Laptop

            private int price;

            private Laptop(){
                price = 500; // assign 500 to Dell laptop since it will call default constructor.
            }

            private Laptop(int price){   // here constructor is private , since we are creating object inside enum class only.
                this.price= price;
            }
            // getter to get the price
        }

# functional interfce

    - interfcae having one method
    - take help of @FunctionInterface to give error if interaface has more than one method.
    - for eg
        @FunctionalInterface

            interface InnerHello {
                int x=10;
                void show();

            }

# lambda expression

    - this only works wth functional interface
    - since we know that functional interface has only one method
    - so
        public class A {
            psvm(String [] args){
                InnerHello ih = new InnerHello()
                {
                    public void show(){
                        sout(in inner anyoynms class);
                    }
                };
            }
        }

        INSTEAD OF THE ABOVE CODE WE CAN USE LAMBDA EXPRESSOIN

         public class A {
            psvm(String [] args){
                InnerHello ih =() ->
                {
                        sout(in inner anyoynms class);
                };
            }
        }

# types of interface

    - Normal (2 or more abstract method)
    - Functional Single abstract method. (only 1 abstract method)
    - Marker (has no abstract method)

    two more concepts
    Marker interfcae help in serializing and deserializing of object
    serializing: saving(write) obj into files
    deserializing: extracting(read) obj from files

# exception

    - Error
        - Complile time error
        - Run time error(Exception): Exceution of program stop
        - logical erro.
    - Runtime error
        - Multiple catch to handle different type of exception.
        - every exception type inheritd from Exception class.

# Class hierarchy in java for exception

- Object Class
  - Throwable Class
    - Error: can't handle ( ThreadDeath, Outofmemory, IoError)
    - Exception Class: can be handle
      - Run time exception- Unchecked exception ( unchecked means its upto u if u want u can handle)
        - Airthmrtic.
        - ArrayOutOfBound
        - NullPointerException
        - many more...
      - Sql exception - Checked exceptin (checked means must need to handle)
      - IO exception - Checked exception

# throw

    - you can throw the error from try blocl
    int i =1;
     try {
         i = 18/20
        if(i==0){
            throw new AirthmeticException("no zero value we want")
        }
     }
     catch(AirthmeticException e){
        i = 1;
        sout("default o/p "+ e) // default o/p java.lang.ArithmeticException: no zero value we want
     }

# create own exception class

- Class MyOwnException extends Exception {
  MyOwnException(String msg){
  super(msg);
  }
  }

- public class A {
  psvm{
  int i =1;
  try {
  i = 18/20
  if(i==0){
  throw new MyOwnException("no zero value we want")
  }
  }
  catch(MyOwnException e){
  i = 1;
  sout("default o/p "+ e) // default o/p MyOwnException: no zero value we want
  }
  }
  }

# throws

    - basically ducking the exception
    - instead a fn handle the exception, it just throws the exception, and the caller need to handle the exception

    class A {
        public void show() throws ClassNotFOundException{
            Class.forName("somerandomclassnamewhichdoesnotevenexist")
            // here line 549 we must need to handle this error either usign try catch block here itself or throws to the caller but it must to handle since it is checked exception.
        }
    }

    public Class B{
        psvm{
            A a = new A();
            try {
                a.show();  // need to handle the error which was thrown by show method of class A, so use try catch here
              }
            catch (ClassNotFOundException e){
                sout("error handled "+e)
            }
        }
    }
