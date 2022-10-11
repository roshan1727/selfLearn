class Child{
    //its default access modifier
    void print(){
        System.out.println("Child class has been displayed");
    }
}


public class Default {
    public static void main(String[]args){
        Child child=new Child();
        child.print();
    }
}
