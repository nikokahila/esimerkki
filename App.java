import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
       
        String input;
        int nro1; 
        int nro2;
        int nro3;
        int summa;
        
        System.out.println("First number?");
        input = in.nextLine();
        nro1 = Integer.parseInt(input);

        System.out.println("Second number?");
        input = in.nextLine();
        nro2 = Integer.parseInt(input);

        summa = nro1 + nro2;
        
        if(input.equals(""))
        {
            System.out.println("Error");
        }

        else
        {
         System.out.println(nro1 + "+" + nro2 + "="  + summa +".");
        }
        System.out.println("Error");
        System.out.println("Testi");
    }
}
