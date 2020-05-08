public class PrintParallelogram {

    public static void main(String[] args) {
        printParallelogram(10);
    }

    private static void printParallelogram(int size) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stars.append("*");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(stars);
        }
    }
}
