public class Carro {

    private ModeloCarro modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    public Carro(ModeloCarro modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia) {
        int consumoAtual = getConsumoAtual();
        if (consumoAtual <= 0) {
            throw new IllegalArgumentException("Consumo do combustível deve ser maior que zero.");
        }
        int combustivelNecessario = distancia / consumoAtual;
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * consumoAtual;
        }
    }

    private int getConsumoAtual() {
        if (modelo == ModeloCarro.SUVFLEX) {
            return calcularConsumoSUVFlex();
        } else if (modelo == ModeloCarro.ECONO) {
            return calcularConsumoEcono();
        }
        return motor.getConsumo();
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {
        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(distancia / getConsumoAtual());
            return true;
        }
        return false;
    }

    private int calcularConsumoEcono() {
        int baseConsumo = motor.getConsumo(); 
        int decremento = 1;
        int kmPercorridos = motor.getQuilometragem();
        int consumoAtual = baseConsumo - (kmPercorridos / 5000) * decremento;
        return Math.max(consumoAtual, 10);
    }

    private int calcularConsumoSUVFlex() {
        if (tanque.getTipoCombustivel() == TipoCombustivel.GASOLINA) {
            return 8; 
        } else if (tanque.getTipoCombustivel() == TipoCombustivel.ALCOOL) {
            return 6; 
        }
        return 0; 
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}
