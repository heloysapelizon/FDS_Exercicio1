public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);

        //Exercício 1
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(300);
        System.out.println(esportivo);

        //Exercício 2
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utiliario com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 45);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(300);
        System.out.println(utilitario);

        //Exercício 3
        Carro SUV = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo SUV com gasolina");
        SUV.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(SUV);
        System.out.println("\nViajando com SUV");
        SUV.viaja(300);
        System.out.println(SUV);


    }
}
