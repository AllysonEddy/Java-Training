public class ArrayWithDiffDataTypes {
    public static void main(String[] args) {
        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = "Hello";
        arr[2] = 1.1;
        arr[3] = true;
        arr[4] = 0xFF;

        for (Object arr2 : arr){
            System.out.println(arr2);
        }

    }
}
