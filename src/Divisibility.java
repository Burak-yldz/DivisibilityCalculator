import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args) {

        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        k = input.nextInt();


        System.out.println("1 den" + k + "'ya kadar olan sayilardan 3 ve 4'e bolunen sayilar: ");

        for (int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                System.out.println(i);
            }

        }
        /*for (int i = 1; i <= k; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/
    }
}