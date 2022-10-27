public class Main {
    public static void main(String[] args) {

        int[] vector = {2, 3, 5, 7, 11, 13, 18, 34};

        for (int i = 0; i < 8; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println(vector[i]);
            }
        }
    }
}