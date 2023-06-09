package es.iesmz.ed.algoritmes;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        if (esSudokuCorrecto(sudoku)) {
            System.out.println("El sudoku es correcto");
        } else {
            System.err.println("El sudoku es incorrecto");
        }
    }

    public static boolean esSudokuCorrecto(int[][] sudoku) {
        for (int fila = 0; fila < 9; fila++) {
            if (!esGrupoCorrecto(sudoku[fila])) {
                return false;
            }
        }

        for (int columna = 0; columna < 9; columna++) {
            int[] grupo = new int[9];
            for (int fila = 0; fila < 9; fila++) {
                grupo[fila] = sudoku[fila][columna];
            }
            if (!(esGrupoCorrecto(grupo))) {
                return false;
            }
        }

        for (int inicioFila = 0; inicioFila < 9; inicioFila += 3) {
            for (int inicioColumna = 0; inicioColumna < 9; inicioColumna += 3) {
                int[] grupo = new int[9];
                int indice = 0;
                for (int fila = inicioFila; fila < inicioFila + 3; fila++) {
                    for (int columna = inicioColumna; columna < inicioColumna + 3; columna++) {
                        grupo[indice++] = sudoku[fila][columna];
                    }
                }
                if (!(esGrupoCorrecto(grupo))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean esGrupoCorrecto(int[] grupo) {
        boolean[] numeros = new boolean[9];

        for (int num : grupo) {
            if (num < 1 || num > 9 || numeros[num - 1]) {
                return false;
            }
            numeros[num - 1] = true;
        }
        return true;
    }
}
