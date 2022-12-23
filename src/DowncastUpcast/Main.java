package DowncastUpcast;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Fachineiro fachineiro = new Fachineiro();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();

        Vendedor vendedor_ = (Vendedor) new Funcionario();
        Funcionario funcionario_ = new Gerente();
    }
}
