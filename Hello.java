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

public class Hello{

    public static void main (String args[]){
        A a = (A) new A();

        B b  =(B) (a);
        b.show();
        b.show1();

        Integer  i = Integer.parseInt("12");
        System.out.println(i*12);
            // AdvCalc adv = new AdvCalc();  
            // adv.add();   

            // System.out.println("=>>>>>>>>>>>>>>>>>>>");
            // System.out.println(adv.test());

            // System.out.println(adv.a);   
}
}