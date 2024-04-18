package Components;

public class CarroLeaf extends CarroComponent {

    public CarroLeaf(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public void add(CarroComponent carPart) {
        System.out.println("Não é possível adicionar partes a um item folha.");
    }

    @Override
    public void remove(CarroComponent carPart) {
        System.out.println("Não é possível remover partes de um item folha.");
    }
}
