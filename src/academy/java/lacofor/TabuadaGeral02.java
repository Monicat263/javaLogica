package academy.java.lacofor;

public class TabuadaGeral02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int tabuada = i * j;
                System.out.printf("%2d x %2d = %2d", j, i, tabuada);
                System.out.print("  |  "); // Separador entre as colunas
            }
            System.out.println(); // Pula para a próxima linha após cada linha de resultados
        }

    }
}
