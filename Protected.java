class Child{
    protected void print(){
        System.out.println("Child class has been displayed");
    }
}

public class Protected {
    public static void main(String[]args){
        Child child=new Child();
        child.print();
    }
}
