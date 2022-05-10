import java.util.Scanner;

public class url
{ 
    public static void main(String[] args) 
    {
        System.out.println("Ingrese url: ");
        Scanner scan=new Scanner(System.in);
        String url1=scan.next();
    	String MyString = url1;
        System.out.println("La url original es   : " + MyString); 
        MyString = MyString.replace("-", ""); 
        System.out.println("la url sin guiones es: " + MyString); 
    } 
}
