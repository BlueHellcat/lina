
class Matrix {
    final int rows, columns;
    double[] data;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows*columns];
    }

    void setData(double... values) throws Exception {
        int i = 0;

        for (int value : values)
            this.data[i++] = value;

        if (i != this.data.length)
            throw new Exception("Mismatched amount of values passed to Matrix " + this.toString());
    }

    void setData(int... values) throws Exception {
        int i = 0;

        for (int value : values)
            this.data[i++] = (double)value;

        if (i != this.data.length)
            throw new Exception("Mismatched amount of values passed to Matrix " + this.toString());
    }

    Matrix crop(int row, int column) throws Exception {
        if (row<0 || row >= this.rows || column<0 || column >= this.columns)
            throw new Exception("Invalid Indices for cropping Matrix");
        
        Matrix m = new Matrix(this.rows-1, this.columns-1);

        int cursor = 0;

        for (int i=0; i<this.rows; i++) {
            if (i == row)
                continue;
            for (int j=0; j<this.columns; j++) {
                if (j == column)
                    continue;
                m.data[cursor++] = this.data[i*this.rows + j];
            }
        }

        return m;
    }

    /**
     * Calculte the Determinant of a Matrix
     * @param m Matrix 
     */
    public static double det(Matrix m) {
        return 0.0;
    }
}