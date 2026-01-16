package coreprogramming.string.level2;
class StudentGradeCalculator {

    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int) (Math.random() * 90) + 10;
        return scores;
    }

    static String[][] calculateGrades(int[][] scores) {
        String[][] result = new String[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double percent = total / 3.0;

            result[i][0] = String.valueOf(total);
            result[i][1] = String.valueOf(Math.round(percent * 100.0) / 100.0);
            result[i][2] = percent >= 90 ? "A" :
                    percent >= 75 ? "B" :
                            percent >= 60 ? "C" : "D";
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        String[][] grades = calculateGrades(scores);

        System.out.println("Phy Chem Math Total % Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "   " +
                    scores[i][1] + "   " +
                    scores[i][2] + "   " +
                    grades[i][0] + "   " +
                    grades[i][1] + "   " +
                    grades[i][2]);
        }
    }
}
