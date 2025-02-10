import java.util.Scanner; // Importa a classe Scanner para leitura de entrada

public class EntradaSaida {
    public static void main(String[] args) {
        // Saída de dados (equivalente ao print do Python)
        System.out.println("Olá, mundo!"); // Saída: Olá, mundo!

        // Entrada de dados
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas

        System.out.print("Digite seu nome: "); // Exibe a mensagem para o usuário
        String nome = scanner.nextLine(); // Lê uma linha de texto (equivalente ao input do Python)

        System.out.print("Digite sua idade: "); // Exibe a mensagem para o usuário
        int idade = scanner.nextInt(); // Lê um número inteiro (equivalente ao int(input()) do Python)

        // Saída formatada (equivalente ao f-string do Python)
        System.out.println("Nome: " + nome + ", Idade: " + idade);

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}