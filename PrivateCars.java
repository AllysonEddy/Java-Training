//First Assignment

public class PrivateCars {
    private String model;
    private int maker;
    private double price;

    public PrivateCars(String model, int maker, double price){
        this.model =model;
        this.maker = maker;
        this.price =price;
    }
   
    public static void main(String[] args) {
        PrivateCars pc = new PrivateCars("Porsche GT3RS", 2024, 800000);
        System.out.println("model: "+ pc.model);
        System.out.println("maker: "+ pc.maker);
        System.out.println("price: $"+ pc.price);
    }

}
