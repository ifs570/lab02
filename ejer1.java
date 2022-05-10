import java.util.Date;  
  
public class ejer1 {  
  
    public static void main(String[] args) {  
        Date d=new Date();   
        
        if(d.getDay()==0) {
        	System.out.println("Hoy es Domingo");
        }
        else if(d.getDay()==1) {
        	System.out.println("Hoy es Lunes");
        }
        else if(d.getDay()==2) {
        	System.out.println("Hoy es Martes");
        }
        else if(d.getDay()==3) {
        	System.out.println("Hoy es Miercoles");
        }
        else if(d.getDay()==4) {
        	System.out.println("Hoy es Jueves");
        }
        else if(d.getDay()==5) {
        	System.out.println("Hoy es Viernes");
        }
        else if(d.getDay()==6) {
        	System.out.println("Hoy es Sabado");
        }
    }  
}
