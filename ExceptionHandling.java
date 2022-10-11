public class ExceptionHandling {
    public static void main(String[]args){
        //try,catch and finall block      
        try{
            int a=5;
            int b=0;
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Exception occured: "+e);
        }
        finally{
            System.out.println("Print at the end of the all the statement of try and catch block");
        }

        }
    }

