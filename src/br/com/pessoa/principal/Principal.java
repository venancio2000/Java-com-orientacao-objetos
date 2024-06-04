package br.com.pessoa.principal;
import br.com.pessoa.modelos.Pessoa;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();
        primeiraPessoa.setNome("Bruno Venancio");
        primeiraPessoa.setIdade(30);

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Erica Kariny");
        segundaPessoa.setIdade(28);

        Pessoa terceiraPessoa = new Pessoa();
        segundaPessoa.setNome("victor venancio");
        segundaPessoa.setIdade(10);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(primeiraPessoa);
        listaDePessoas.add(segundaPessoa);
        listaDePessoas.add(terceiraPessoa);

        System.out.println("Tamanho da lista do Array " + listaDePessoas.size());
        System.out.println("Imprimir a primeira pessoal da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista completa de pessoas no Array: " + listaDePessoas.get(0).toString());
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }


    }

}
