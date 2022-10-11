class Human{
    public void behavior(){
        System.out.println("Soft person");
    }
    public void behavior(int age,String Type)
    {
        System.out.println(""+age+" "+""+Type);
    }
    public void behavior(int age,String Type,Boolean x)
    {
        if (x){
            System.out.println(""+age+" "+" "+Type);
        }
    }
}
public class Main {
    public static void main(String[]args)
    {
        //creating object
        Human object=new Human();
        object.behavior();
        object.behavior(21, "Anger");
        object.behavior(22, "Irritating", true);
    }
}
