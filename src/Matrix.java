
class Matrix {
    final int rows, columns;
    double[] data;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows*cloumns];
    }

    void setData(int... values) {
        int i = 0;

        for (int value : values)
            this.data[i++] = value;
        
        if (i != this.data.length)
            throw new Exception("Mismatched amount of values passed to Matrix " + this.toString();
    }

    /**
     * Calculte the Determinant of a Matrix
     * @param m Matrix 
     */
    public static double det(Matrix m) {
        return 0.0;
    }
}