public class MultiplicacionMatrices {

    public static void main(String[] args) {
        // Definir matrices A y B
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        // Verificar si las matrices se pueden multiplicar
        if (A[0].length != B.length) {
            System.out.println("Las matrices no se pueden multiplicar: el número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        // Calcular dimensiones de la matriz resultante
        int filasC = A.length;
        int columnasC = B[0].length;

        // Crear matriz C para almacenar el resultado
        int[][] C = new int[filasC][columnasC];

        // Multiplicar matrices A y B
        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir la matriz resultante C
        System.out.println("Matriz resultante C:");
        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
