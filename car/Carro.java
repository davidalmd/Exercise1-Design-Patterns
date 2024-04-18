import Components.CarroComponent;
import Components.CarroLeaf;
import Composites.CarroComposite;

public class Carro {
    public static void main(String[] args) {
        CarroComponent carro = new CarroComposite("Jeep Compass", 0.0);

        CarroComponent carroceria = new CarroComposite("Carroceria", 678.5);
        CarroComponent chassi = new CarroComposite("Chassi", 273.8);

        carro.add(carroceria);
        carro.add(chassi);

        CarroComponent paraLamas = new CarroLeaf("Para-lamas", 12.3);
        CarroComponent portas = new CarroLeaf("Portas", 35.2);
        CarroComponent paineis = new CarroLeaf("Painéis", 7.0);
        CarroComponent portaMalas = new CarroLeaf("Porta-malas", 45.0);
        CarroComponent capo = new CarroLeaf("Capô", 25.0);

        carroceria.add(paraLamas);
        carroceria.add(portas);
        carroceria.add(paineis);
        carroceria.add(portaMalas);
        carroceria.add(capo);

        CarroComponent tremForca = new CarroComposite("Trem de Força", 450.0);
        CarroComponent suspensao = new CarroLeaf("Suspensão", 120.0);

        chassi.add(tremForca);
        chassi.add(suspensao);

        CarroComponent motor = new CarroLeaf("Motor", 180.0);
        CarroComponent transmissao = new CarroLeaf("Transmissão", 75.0);
        CarroComponent diferencial = new CarroLeaf("Diferencial", 45.0);
        CarroComponent rodas = new CarroLeaf("Rodas", 60.0);

        tremForca.add(motor);
        tremForca.add(transmissao);
        tremForca.add(diferencial);
        tremForca.add(rodas);

        System.out.printf("\nCalculando a seguir o peso total do carro %s:\n", carro.nome);
        carro.getPeso();
    }
}
