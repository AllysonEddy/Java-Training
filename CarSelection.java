import java.util.Scanner;
public class CarSelection {
    
    public static void main(String[] args) {
        int carPrice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a car: \n 1.Honda \n 2.Proton \n 3.BMW \n(Type the number)");
        int carSelect = scanner.nextInt();

        switch (carSelect){
            case 1:
                carPrice =70000;
                break;
            case 2:
                carPrice=50000;
                break;
            case 3:
                carPrice=150000;
                break;
            default:
               System.out.println("Invalid Car");
                break;

        }
        if(carSelect<4){
        System.out.println("The price of the car you chose is RM"+ carPrice);
        }
        if (carPrice>100000){
            System.out.println("You are VIP");
        }
        

    }
}
