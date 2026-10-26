import java.util.Scanner;

public class doing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String cash = scanner.nextLine();
        int change = Integer.parseInt(cash); 

        System.out.println("あなたの入力値は" + cash);

        ;
        System.out.println(cash(change));
        
    }

    public static String cash(int cash){
    Double math  = cash*1.8;
    String yen = String.valueOf(math);
    String total = "お返しは"+ yen +"円です";
    return total;
    }
}

