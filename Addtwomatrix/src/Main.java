class Add_twoMatrix{


    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }


    static int[][] add(int A[][], int B[][],
                       int size)
    {
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }


    public static void main(String[] args)
    {
        int size = 4;

        int A[][] = { { 9, 4, 4, 3 },
                { 1, 2, 3, 4 },
                { 3, 6, 7, 8 },
                { 4, 8, 5, 2 } };

        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        int B[][] = { { 1, 2, 3, 1 },
                { 2, 6, 3, 2 },
                { 3, 5, 7, 3 },
                { 4, 2, 6, 4 } };

        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);


        int C[][] = add(A, B, size);


        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }
}