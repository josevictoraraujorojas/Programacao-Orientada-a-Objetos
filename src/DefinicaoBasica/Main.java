package DefinicaoBasica;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("vermelho");
        carro.setModelo("uno");
        carro.setCapacidadeDoTanque(12);

        System.out.printf("Cor do carro:%s \nModelo do DefinicaoBasica.Carro:%s\nCapacidade do tanque do carro:%d\n",carro.getCor(),carro.getModelo(),carro.getCapacidadeDoTanque());

        System.out.printf("Custo da capacidade total do tanque do carro:%f",carro.totalValorTanque(4));
    }
}