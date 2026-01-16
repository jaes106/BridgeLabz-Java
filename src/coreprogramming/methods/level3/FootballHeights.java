package coreprogramming.methods.level3;
class FootballHeights {

    static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++)
            heights[i] = (int) (Math.random() * 101) + 150;
        return heights;
    }

    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) min = Math.min(min, h);
        return min;
    }

    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) max = Math.max(max, h);
        return max;
    }

    static double findMean(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return (double) sum / heights.length;
    }

    static void main(String[] args) {
        int[] heights = generateHeights(11);

        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}

