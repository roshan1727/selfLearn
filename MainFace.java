//interface
interface MainFace {
    static void display(){
        System.out.println("Hello Purni!");
    }
}
//now the class MainClass immplements the interface MainFace
class Mainclass implements MainFace{
    public static void main(String[] args) {
        MainFace.display();
    }
}
