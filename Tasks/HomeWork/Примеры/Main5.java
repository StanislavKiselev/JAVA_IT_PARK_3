
public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        int i = 0;
        for (i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
                    }
        System.out.print("Исходный массив: " );
        for (i = 0; i < arraySize; i++) {
             System.out.print( array[i]+ " ");
        }
        System.out.print('\n');
        int sumChet = 0;
        int sumNechet = 0;
        int sumChetPosition = 0;
        int sumNechetPosition = 0;
        for (i = 0; i < arraySize; i++) {
            int b = array[i] % 2;
            if (b == 0) {
                sumChet = sumChet + array[i];
            } else {
                sumNechet = sumNechet + array[i];
            }
            b = i % 2;
            if (b == 0) {
                sumChetPosition = sumChetPosition + array[i];
            } else {
                sumNechetPosition = sumNechetPosition + array[i];
            }
        for (i=0; i< (arraySize-1); i++){
            if (array[i] ==0) {
            array [i] = - array [i+1];
            }
            System.out.println("1. Сумма четных элементов: " + sumChet);
            System.out.println("2. Сумма нечетных элементов: " + sumNechet);
            System.out.println("3. Сумма элементов четных позиций: " + sumChetPosition);
            System.out.println("4. Сумма элементов нечетных позиций: " + sumNechetPosition);
            }
        }