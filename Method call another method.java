package Defaultt;
public class FooBarBazMumble {
    public static void main(String[] args) {
      
 //A method can call another method
        foo();
        baz();
        System.out.println("mumble");
    }
    public static void foo() {
    	System.out.println("foo");
    }
    public static void baz() {
    	System.out.println("baz");
    	bar();
    }
    public static void bar() {
    	System.out.println("bar");
    }
    
}