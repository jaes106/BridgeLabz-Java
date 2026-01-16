package coreprogramming.methods.level2;
class RandomStatistics {

    static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }

    static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return new double[]{(double) sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] values = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(values);

        for (int v : values) System.out.print(v + " ");
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}

