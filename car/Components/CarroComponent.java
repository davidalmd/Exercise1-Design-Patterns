package Components;

public abstract class CarroComponent {
    public String nome;
    public double peso;

    public abstract double getPeso();
    public abstract void add(CarroComponent carPart);
    public abstract void remove(CarroComponent carPart);
}
