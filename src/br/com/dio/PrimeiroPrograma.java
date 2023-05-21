package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Hello-World!" + (a + b));

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("o problema dos 3 corpos", 300);
        System.out.println(livro);

    }
}
    class Livro {
        private String nome;
        private int numeroPaginas;

        public Livro(String nome, int numeroPaginas) {
            this.nome = nome;
            this.numeroPaginas = numeroPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }
        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numeroPaginas=" + numeroPaginas +
                    '}';
        }
    }
