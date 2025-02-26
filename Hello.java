import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Student{
    private String name;
    public int age;
    public Student(String n, int a){
        name= n;
        age=a;
    }

    public String toString(){
return this.name+""+this.age;

    }

}
public class Hello{

    public static void main (String[] args){
        Comparator c = new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                if(s1.age<s2.age){
return 1;
                }
                return -1;
            }
        };
        Set<Integer> s = new HashSet<Integer>();
       s.add(2);
       s.add(12);
       s.add(21);
        for(int num: s){
            System.out.println("setval "+num);
        }
       System.out.println(s);
 ArrayList<Student> students = new ArrayList<Student>();
 students.add(new Student("yash", 20));
 students.add(new Student("sagar", 30));
 students.add(new Student("adi", 25));


       Collections.sort(students, c);
System.out.println(students);

        // A a = (A) new A();

        // B b  =(B) (a);
        // b.show();
        // b.show1();

        // B bb = new B();

        // Status s = Status.yash;

        // switch (s) {
        //     case yash:
                
        //         break;
        
        //     default:
        //         break;
        // }

        // Integer  i = Integer.parseInt("12");
        // System.out.println(i*12);
        Example e = new Example();
        int x = Example.x;

        int y = 1;
         try{
        int z = 4/0;
         }
     
        finally{
            int xx[] = new int[10];
            for (int a: xx){
                System.out.println("a "+ a);
            }
            System.out.println("error caught in finally");
        }
        System.out.println("bue");

        // Scanner sc= new Scanner(System.in);
        
        // String  ss = sc.next();
        // System.out.println("Type4d string "+ s);
        // System.out.println("String type "+ ss);

            // AdvCalc adv = new AdvCalc();  
            // adv.add();   

            // System.out.println("=>>>>>>>>>>>>>>>>>>>");
            // System.out.println(adv.test());

             System.out.println("as");   


      
}
}

class A {
    final public void show(){
        System.out.println("in a");
    }
}

class B extends A{
    

    void show1(){
       System.out.println( ("in child"));
    }
}


interface InnerHello {
        int x=10;
        void show();

}

//  interface InnerHello_1  extends InnerHello{

    
// }

class Example implements InnerHello{
    public void show(){

    }
}
enum Status {
    yash, gandhi(10);

    Status(){

    }
    
        Status(int i) {
            //TODO Auto-generated constructor stub
        }
}
