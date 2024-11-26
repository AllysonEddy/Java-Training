public class WrapperClass {
    public static void main(String[] args) {
        Integer i = 100;
        Integer newi =i +1;
        System.out.println(newi);
        System.out.println(i);


        int randomInt = 20;
        String binary = Integer.toBinaryString(randomInt);
        System.out.println(binary);

        int bitcount = Integer.bitCount(randomInt);
        System.out.println(bitcount);
    }
}
