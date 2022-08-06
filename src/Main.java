public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // сегодня поработаем с массивами
        // объявление массива. надо задать тип массива (только переменные этого типа могут храниться в массиве)

        int[] blackHole = new int[100];
        char[] chars = new char[15];
        double[] doubleArr = new double[10];
        long[] numbers = new long[82];
        boolean[] bools = new boolean[2];

        // нумерация ячеек в массиве идет от 0. т.е. в массиве blackHole первое значение будет 0, а последнее 100
        // чтобы узнать длину массива надо обратиться к его свойству .lenght

        int blackHoleLenght = blackHole.length;
        System.out.println(blackHoleLenght);

        // чтобы узнать значение переменной в массиве, надо воспользоваться ее индексом в массиве

        int i = blackHole[99];
        System.out.println(i);

        // чтобы задать значение переменной в массиве: в скобках индекс, после оператора присваивания значение

        blackHole[67] = 23;

    }
}