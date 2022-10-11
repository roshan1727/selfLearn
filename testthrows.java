import java.io.IOException;
class M{
    void method()throws IOException{  
        System.out.println("Thorws has worked properly");  
       }  
}
public class testthrows {
    public static void main(String args[])throws IOException{//declare exception  
        M m=new M();  
        m.method();  
     
       System.out.println("normal flow...");  
     }  
}
