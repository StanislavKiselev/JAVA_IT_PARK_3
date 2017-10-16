public class Main2 {
    
    public static void main(String[] args) {
        int array[] = {2, 1, -4, 6, 1, 2, 5};
        int minIndex
        for (int i = 0; i < array.length; i++) {
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }
}