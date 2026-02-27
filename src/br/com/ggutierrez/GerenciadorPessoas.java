package br.com.ggutierrez;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorPessoas {
    private ArrayList<Pessoa> homens = new ArrayList<>();
    private ArrayList<Pessoa> mulheres = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getGenero().equalsIgnoreCase("M")) {
            homens.add(pessoa);
        } else if (pessoa.getGenero().equalsIgnoreCase("F")) {
            mulheres.add(pessoa);
        } else {
            System.out.println("Genero invalido. Use 'M' para masculino ou 'F' para feminino.");
        }
    }

    public void adicionarEOrdenarNomes(String entrada) {
        String[] nomes = entrada.split(",");
        ArrayList<String> listaNomes = new ArrayList<>();

        for (String nome : nomes) {
            String nomeTratado = nome.trim().toUpperCase();
            if (!nomeTratado.isEmpty()) {
                listaNomes.add(nomeTratado);
            }
        }

        Collections.sort(listaNomes);

        System.out.println("***** Nomes Ordenados *****");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }


    public void exibirListas() {
        homens.sort((a, b) -> a.getNome().compareTo(b.getNome()));
        mulheres.sort((a, b) -> a.getNome().compareTo(b.getNome()));

        System.out.println("***** Homens *****");
        for (Pessoa p : homens) {
            System.out.println(p);
        }
        System.out.println("***** Mulheres *****");
        for (Pessoa p : mulheres) {
            System.out.println(p);
        }
    }
}