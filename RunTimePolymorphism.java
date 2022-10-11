class Parent{
    public void displayName(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    @Override
    public void displayName(){
        System.out.println("This is child class");
    }
}




public class RunTimePolymorphism {
    public static void main(String[]args)
    {
        Child child=new Child();
        child.displayName();
    }
}
