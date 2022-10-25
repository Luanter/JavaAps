package Aps.Equipamentos;

public class Bike implements TrocaEquipamento{
    @Override
    public TrocaEquipamento equipamento() {
        System.out.println("Estou utilizando uma Bicicleta!");
        return null;
    }
}
