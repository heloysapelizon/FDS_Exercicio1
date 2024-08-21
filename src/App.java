public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 1
        Carro esportivo = new Carro(ModeloCarro.ESPORTIVO, TipoCombustivel.GASOLINA, 6, 45);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(300);
        System.out.println(esportivo);

        // Exercício 2
        Carro utilitario = new Carro(ModeloCarro.UTILITARIO, TipoCombustivel.DIESEL, 5, 70);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo carro utilitário com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 45);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitário");
        utilitario.viaja(300);
        System.out.println(utilitario);

        // Exercício 3 
        Carro SUV = new Carro(ModeloCarro.SUV, TipoCombustivel.FLEX, 8, 55);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo SUV com gasolina");
        SUV.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(SUV);
        System.out.println("\nViajando com SUV");
        SUV.viaja(300);
        System.out.println(SUV);

        //Exercício 4
        Carro suvFlex = new Carro(ModeloCarro.SUVFLEX, TipoCombustivel.GASOLINA, 8, 65);
        System.out.println("Tipos de veículos:");
        System.out.println(suvFlex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo SUVFlex com gasolina");
        suvFlex.abastece(TipoCombustivel.GASOLINA, 65); // Abastecendo com gasolina
        System.out.println(suvFlex);
        System.out.println("\nViajando com SUVFlex");
        suvFlex.viaja(300); // Viaje com a capacidade de combustível atual
        System.out.println(suvFlex);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo SUVFlex com álcool");
        suvFlex.abastece(TipoCombustivel.ALCOOL, 30); // Abastecendo com álcool
        System.out.println(suvFlex);
        System.out.println("\nViajando com SUVFlex");
        suvFlex.viaja(150); // Viaje com a capacidade de combustível atual
        System.out.println(suvFlex);


        //Exercício 5
        Carro econo = new Carro(ModeloCarro.ECONO, TipoCombustivel.FLEX, 20, 55);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastecendo econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(econo);
        System.out.println("\nViajando com econo");
        econo.viaja(300);
        System.out.println(econo);
        
    }
}
