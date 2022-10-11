class Parent{
    public void print(){
        System.out.println("Parent class has been displayed");
    }
}


public class Public {
    public static void main(String[]args){
        Parent child=new Parent();
        child.print();
    }
}
