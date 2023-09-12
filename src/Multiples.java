public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {

            // Assign name if divisible
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // check if divisibleBy3
            if (divisibleBy3 || divisibleBy5) {
                count += 1;
            }

        }
        System.out.println(count);
    }
}
