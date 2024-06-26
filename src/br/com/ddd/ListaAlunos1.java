package br.com.ddd;
    import java.util.ArrayList;
    class ListaAlunos {
        private ArrayList<String> listaAlunos = new ArrayList<>();

        public void setAluno(String DadosAluno) {
            int list_size = listaAlunos.size();

            if(listaAlunos.isEmpty()) {
                System.out.println("Tamanho da Lista: " + listaAlunos.size());
                listaAlunos.add(DadosAluno);
                System.out.println("Registro: " + DadosAluno);
                System.out.println("Inserido!");
                System.out.println("Tamanho da Lista: " + listaAlunos.size());
            }
            else {
                for(int i = 0; i < list_size; i++) {
                    if(listaAlunos.get(i).equals(DadosAluno)) {
                        System.out.println("Registro: " + DadosAluno);
                        System.out.println("Já Existe!");
                        System.out.println("Tamanho da Lista: " + listaAlunos.size());
                    }
                    else {
                        listaAlunos.add(DadosAluno);
                        System.out.println("Registro: " + DadosAluno);
                        System.out.println("Inserido!");
                        System.out.println("Tamanho da Lista: " + listaAlunos.size());
                    }
                }
            }

        }
    }

    // Classe Aluno Value Object 1
    class Aluno_va1 {
        private String primeiro_nome;
        private String nome_do_meio;
        private String ultimo_nome;
        private String dia_nascimento;
        private String mes_nascimento;
        private String ano_nascimento;
        private String rua;
        private String numero;
        private String complemento;
        private String cep;
        private String cidade;
        private String estado;
        private String pais;

        ListaAlunos lista_alunos = new ListaAlunos();

        private String NomeCompleto() {
            String nome_completo;
            // Forçando que tudo seja minúsculo
            this.primeiro_nome = this.primeiro_nome.toLowerCase();
            this.nome_do_meio = this.nome_do_meio.toLowerCase();
            this.ultimo_nome = this.ultimo_nome.toLowerCase();

            // Capitalizando somente a primeira letra
            this.primeiro_nome = this.primeiro_nome.substring(0, 1).toUpperCase() + this.primeiro_nome.substring(1);
            this.nome_do_meio = this.nome_do_meio.substring(0, 1).toUpperCase() + this.nome_do_meio.substring(1);
            this.ultimo_nome = this.ultimo_nome.substring(0, 1).toUpperCase() + this.ultimo_nome.substring(1);

            nome_completo = this.primeiro_nome + " " + this.nome_do_meio + " " + this.ultimo_nome;

            return nome_completo;
        }

        private String DataNascimento() {
            String nascimento_completo;
            nascimento_completo = "";

            // Testando se há alguma data vazia
            if(this.dia_nascimento.length() == 0 || this.mes_nascimento.length() == 0 || ano_nascimento.length() == 0 || ano_nascimento.length() < 4) {
                nascimento_completo = "Erro: Data Inválida!";
            }

            // Complementa a data se houver apenas um número
            if(this.dia_nascimento.length() == 1) {
                this.dia_nascimento = "0" + this.dia_nascimento;
            }

            // Complementa a data se houver apenas um número
            if(this.mes_nascimento.length() == 1) {
                this.mes_nascimento = "0" + this.mes_nascimento;
            }

            nascimento_completo = this.dia_nascimento + "/" + this.mes_nascimento + "/" + this.ano_nascimento;

            return nascimento_completo;
        }

        private String EnderecoCompleto() {
            String endereco_completo;

            // Forçando que tudo seja minúsculo
            this.rua = this.rua.toLowerCase();
            this.cidade = this.cidade.toLowerCase();
            this.estado = this.estado.toLowerCase();
            this.pais = this.pais.toLowerCase();

            // Capitalizando somente a primeira letra
            this.rua = this.rua.substring(0, 1).toUpperCase() + this.rua.substring(1);
            this.cidade = this.cidade.substring(0, 1).toUpperCase() + this.cidade.substring(1);;
            this.estado = this.estado.substring(0, 1).toUpperCase() + this.estado.substring(1);
            this.pais = this.pais.substring(0, 1).toUpperCase() + this.pais.substring(1);

            endereco_completo = this.rua + ", " + this.numero + ", " + this.complemento + ", " + this.cep + ", " + this.cidade + " - " + this.estado + " - " + this.pais;

            return endereco_completo;
        }

        public void setAluno(String primeiro_nome, String nome_do_meio, String ultimo_nome, String dia_nascimento, String mes_nascimento, String ano_nascimento, String rua, String numero, String complemento, String cep, String cidade, String estado, String pais) {
            this.primeiro_nome = primeiro_nome;
            this.nome_do_meio = nome_do_meio;
            this.ultimo_nome = ultimo_nome;
            this.dia_nascimento = dia_nascimento;
            this.mes_nascimento = mes_nascimento;
            this.ano_nascimento = ano_nascimento;
            this.rua = rua;
            this.numero = numero;
            this.complemento = complemento;
            this.cep = cep;
            this.cidade = cidade;
            this.estado = estado;
            this.pais = pais;

            String dados_aluno = NomeCompleto() + ", " + DataNascimento() + ", " + EnderecoCompleto();
            lista_alunos.setAluno(dados_aluno);
        }

        public static void main(String[] Args) {
            Aluno_va1 novo_aluno = new Aluno_va1();

            // Primeira Entrada
            novo_aluno.setAluno("Vlad", "Tepes", "Dracul", "7", "12", "1431", "Piata Cetatii", "8", "", "545400", "Sighisoara", "Transilvânia", "Romenia");

            // Segunda Entrada
            novo_aluno.setAluno("vLad", "Tepes", "DracuL", "7", "12", "1431", "Piata Cetatii", "8", "", "545400", "Sighisoara", "Transilvânia", "Romenia");

            // Terceira Entrada
            novo_aluno.setAluno("vlad", "tepes", "dracul", "7", "12", "1431", "Piata Cetatii", "8", "", "545400", "Sighisoara", "Transilvânia", "Romenia");

            // Quarta Entrada
            novo_aluno.setAluno("conde", "don", "dracula", "7", "12", "1431", "Piata Cetatii", "8", "", "545400", "Sighisoara", "Transilvânia", "Romenia");
        }
    }

