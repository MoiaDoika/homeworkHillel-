public class arifmeticArrays {
    public static void main(String[] args) {
        int[] Arrays = {32,141,542,1,42,33};
        int result = 0;

        //перебираем и складываем элементы
        for (int rekt : Arrays){
            result+=rekt;
            //результат присваивания делим на длину массива
            System.out.println("Среднее арифметическое число "+result/ Arrays.length+"!");
        }
    }
}
