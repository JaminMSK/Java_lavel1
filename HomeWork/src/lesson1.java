public class lesson1 {
        public static void main (String [] args){
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }
        //task2
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        //task3
        public static void checkSumSign() {
            int a = 1;
            int b = 2;
            if (a + b >= 0) {
                System.out.println ("Сумма положительная");
            } else {
                System.out.println ("Сумма отрицательная");
            }
        }
        //tas4
        public static void printColor() {
            int value = 77;
            if (value <= 0) {
                System.out.println ("Красный");
            } else if (value > 0 & value <= 100){
                System.out.println("Желтый");
            } else  {
                System.out.println("Зеленый");
            }
        }
        //task5
        public static void compareNumbers(){
            int a = 5;
            int b = 7;
            if (a >= b) {
                System.out.println("a >= b");
            }else {
                System.out.println("a < b");
            }
        }
}
