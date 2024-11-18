import java.util.Scanner; // Import the Scanner class

public class CarAverage {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model car 1: ");
        String model1 = scanner.nextLine();
        System.out.println("Enter year car 1: ");
        int year1 = scanner.nextInt();
        System.out.println("Enter price car 1: ");
        Double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter model car 2: ");
        String model2 = scanner.nextLine();
        System.out.println("Enter year car 2: ");
        int year2 = scanner.nextInt();
        System.out.println("Enter price car 2: ");
        Double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter model car 3: ");
        String model3 = scanner.nextLine();
        System.out.println("Enter year car 3: ");
        int year3 = scanner.nextInt();
        System.out.println("Enter price car 3: ");
        Double price3 = scanner.nextDouble();
        double averagePrice =(price1+price2+price3)/3;


        System.out.println("car model 1:"+model1+" Year:"+year1+" Price:"+price1);
      
        System.out.println("car model 2:"+model2+" Year:"+year2+" Price:"+price2);
     
        System.out.println("car model 3:"+model3+" Year:"+year3+" Price:"+price3);
 
        System.out.format("Average Price: %.2f",averagePrice);
        
    }
    
}