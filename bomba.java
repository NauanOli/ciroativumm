class bomba {
    private String combustivel;
    private Carro carroAbastecendo;
    public bomba(String combustivel) {
        this.combustivel = combustivel;
    }
    public void abastecer(Carro carro) {
        this.carroAbastecendo = carro;
        System.out.println("O " + carro.getClass().getSimpleName() + " " + carro.nomeCompleto() + " está sendo abastecido com " + this.combustivel);
    }
    public boolean estaDisponivel() {
        return this.carroAbastecendo == null;
    }
}
public class App {
    public static void main(String[] args) {
        bomba bomba = new bomba("Gasolina");
        bomba.abastecer(new Carro("Fiat", "Gol")); // O Carro Fiat Gol está sendo abastecido com Gasolina
    }
}
