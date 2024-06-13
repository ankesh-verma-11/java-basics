
public class Exception {
    public static void main(String[] args) {
        int a[] = new int[7];
        System.out.println(a[0]);
        
        try {
           // int b = 4/0;
            System.out.println(a[9]);
        } 
        catch(ArithmeticException e){
            System.out.println(e);

        }
        finally{
            System.out.println("always executed when error occurs or not");
        }
        System.out.println("program succesfully run");
    }
}
