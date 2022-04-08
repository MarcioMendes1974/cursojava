package implementacoes;

import beans.Livro;
public class ExecutarLivro {
    public static void main(String[] args) {
        System.out.println("iniciando ");
        Livro objetoLivro = new Livro();
        objetoLivro.titulo = "aprender 00";
        objetoLivro.autor  = "marcio ";
        objetoLivro.edicao = "30 ed";
        objetoLivro.preco  = 150.0;
        System.out.println("dados do livro ..");
        System.out.println("titulo"+objetoLivro.titulo);
        System.out.println("Autor "+objetoLivro.autor);
        System.out.println("preco "+objetoLivro.preco);
    }
}
