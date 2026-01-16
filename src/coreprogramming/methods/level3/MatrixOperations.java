package coreprogramming.methods.level3;
class MatrixOperations {

    static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random() * 10) + 1;
        return matrix;
    }

    static double[][] add(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    static double[][] subtract(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    static double[][] multiply(double[][] a, double[][] b) {
        int r = a.length, c = b[0].length, n = b.length;
        double[][] result = new double[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }

    static void display(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[][] a = generateMatrix(2, 2);
        double[][] b = generateMatrix(2, 2);

        System.out.println("Matrix A");
        display(a);

        System.out.println("Matrix B");
        display(b);

        System.out.println("Addition");
        display(add(a, b));

        System.out.println("Subtraction");
        display(subtract(a, b));

        System.out.println("Multiplication");
        display(multiply(a, b));

        System.out.println("Transpose of A");
        display(transpose(a));

        System.out.println("Determinant of A: " + determinant2x2(a));

        double[][] inverse = inverse2x2(a);
        if (inverse != null) {
            System.out.println("Inverse of A");
            display(inverse);
        } else {
            System.out.println("Inverse not possible");
        }
    }
}
