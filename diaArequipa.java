import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class diaArequipa {

    public static void main(String[] args) throws Exception {

        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        System.out.println("Ingrese la fecha de hoy : dd MM yyyy");
        Date dt1 = sdf.parse(br.readLine().trim());
        Date dt2 = sdf.parse("15 08 2022");

        long diff = dt2.getTime() - dt1.getTime();

        System.out.println("Days: " + diff / 1000L / 60L / 60L / 24L);

        if (br != null) {
            br.close();
        }
    }
}
