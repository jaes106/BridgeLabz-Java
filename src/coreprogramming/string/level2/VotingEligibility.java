package coreprogramming.string.level2;

class VotingEligibility {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int) (Math.random() * 60) - 10;
        return ages;
    }

    static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] table = checkEligibility(generateAges(10));

        System.out.println("Age\tCanVote");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
