package Heranca.PolimorfismoSobrescrita;

public class Main {
    public static void main(String[] args) {
        ClassMae[] classes = new ClassMae[]{new ClassFilha1(),new ClassFilha2(),new ClassMae()};
        //polimorfismo
        for (ClassMae classe:classes) {
            classe.metodo1();
        }

        System.out.println();

        for (ClassMae classe:classes) {
            classe.metodo2();
        }

        System.out.println();
        //sobrescrita pois trabalha iretamento com a sobrescrita
        ClassFilha2 classFilha2 = new ClassFilha2();
        classFilha2.metodo2();
    }
}
