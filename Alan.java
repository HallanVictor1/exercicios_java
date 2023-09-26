import java.util.Scanner;  // Importa a classe Scanner para permitir a leitura de entrada do usuário.

public class Alan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria uma instância da classe Scanner chamada 'scanner'.

        System.out.print("Digite o seu nome: ");  // Exibe uma mensagem solicitando ao usuário que digite seu nome.

        String nome = scanner.nextLine();  // Lê a entrada do usuário (o nome) usando o método 'nextLine()' do objeto 'scanner' e armazena-o na variável 'nome'.

        System.out.println("Olá, " + nome + "! Bem-vindo ao programa de boas-vindas!");  // Exibe uma mensagem de boas-vindas que inclui o nome fornecido pelo usuário.

        scanner.close();  // Fecha o objeto 'scanner' para liberar recursos quando não é mais necessário.
    }
}
