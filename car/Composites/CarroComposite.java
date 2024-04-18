package Composites;

import java.util.ArrayList;
import java.util.List;

import Components.CarroComponent;

public class CarroComposite extends CarroComponent {
    
    public List<CarroComponent> carParts = new ArrayList<CarroComponent>();

    public CarroComposite(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        double somaPeso = this.peso;

        for (CarroComponent carPart : this.carParts) {
            somaPeso += carPart.getPeso();
            System.out.printf("\nSomando agora o peso de %s: %.2f\nTotal Parcial: %.2f\n", carPart.nome, carPart.peso, somaPeso);
        }

        return somaPeso;
    }

    @Override
    public void add(CarroComponent carPart) {
        this.carParts.add(carPart);
    }

    @Override
    public void remove(CarroComponent carPart) {
        this.carParts.remove(carPart);
    }
}
