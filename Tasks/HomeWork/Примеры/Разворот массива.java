public class Main2 {
    
    public static void main(String[] args) {
        int array[] = {3, 5, 2, 3, 1, 6, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        // развернуть массив без использования
        // допольнительного массива
        /*
            a[0] <-> a[6]
            a[1] <-> a[5]
            a[2] <-> a[4]
            Таким образом, всего 7 элементов,
            нужно сделать 3 шага.
            Обобщаем задачу - пусть n - размер
            Следовательно нужно сделать
            n / 2 итераций
            a[i] <-> a[n - 1 - i]
            int temp = a;
            a = b;
            b = temp;
         */

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