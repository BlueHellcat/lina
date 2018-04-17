
class Matrix {
    final int rows, columns;
    double[] data;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows*cloumns];
    }

    /**
     * Initialize a new Matrix
     * @param  m Matrix
     * @return   Matrix
     */
    
    public static Matrix makeMatrix(Matrix m) {
      Matrix mat = new Matrix(3,3);
      mat = mat.setData(1,0,1,0,1,1,1,0,1);
      return mat;
    }

    void setData(int... values) {
        int i = 0;

        for (int value : values)
            this.data[i++] = value;

        if (i != this.data.length)
            throw new Exception("Mismatched amount of values passed to Matrix " + this.toString());
    }

    /**
     * Calculte the Determinant of a Matrix
     * @param m Matrix
     */
    public static double det(Matrix m) {
        return 0.0;
    }
}
