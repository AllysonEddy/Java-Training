

public class MatrixCar {
    String [][] carModel ={
        {"GT3RS","SF90","Myvi"},
        {"Bezza", "Viva", "Kancil"},
        {"GTR","Mustang","Hurrican"}};

    int [][] carPrice ={
        {2000000,1500000,49000},
        {39000,25000,9000},
        {500000,450000,1200000}
    };

    public void fetchCar(){
        for(int row=0; row <carPrice.length;row++){
            for(int col=0;col<carPrice[row].length;col++){
                if (carPrice[row][col]>50000) {
                    System.out.println("Car Model: "+carModel[row][col]+"  Price     RM"+carPrice[row][col]+"");  
                }
            }
        }
    }
    
    public static void main(String[] args) {
       
        MatrixCar fc =new MatrixCar();
        fc.fetchCar();
       
    }
}



// [2][2]
//[car][price]
//
