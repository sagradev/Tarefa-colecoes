package br.com.ggutierrez;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();

        while (true) {
            System.out.println("\n ===== Menu =====");
            System.out.println("1 - Apenas adicionar e ordernar nomes ");
            System.out.println("2 - Adicionar Pessoa (Nome,Genero)");
            System.out.println("3 - Exibir Listas por generos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite os nomes separados por virgula:");
                    String nomesEntrada = sc.nextLine();
                    gerenciador.adicionarEOrdenarNomes(nomesEntrada);
                    break;

                case "2":
                    System.out.println("Digite o nome e genero (ex: João,M):");
                    String entrada = sc.nextLine();
                    String[] partes = entrada.split(",");

                    if (partes.length != 2) {
                        System.out.println("Formato invalido. Use 'Nome,Genero'.");
                        break;
                    }

                    String nome = partes[0].trim().toUpperCase();
                    String genero = partes[1].trim().toUpperCase();
                    gerenciador.adicionarPessoa(new Pessoa(nome, genero));
                    System.out.println("Pessoa adicionada com sucesso!");
                    break;

                case "3":
                    gerenciador.exibirListas();
                    break;

                case "0":
                    System.out.println("Encerrando ...");

                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

}
