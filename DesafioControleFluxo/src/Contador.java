import java.util.Scanner;

public class Contador {

	    // Classe interna não estática
    class ParametrosInvalidosException extends Exception {
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();

        // Crie uma instância da classe externa
        Contador contador = new Contador();

        try {
            // Chame o método contendo a lógica de contagem
            contador.contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int indice = 1; contagem >= 1; contagem--) {
            System.out.print(indice + ", ");
            indice++;
        }
        // Realizar o for para imprimir os números com base na variável contagem
    }
}
