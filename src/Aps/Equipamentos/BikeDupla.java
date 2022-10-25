package Aps.Equipamentos;

public class BikeDupla implements TrocaEquipamento{
    @Override
    public TrocaEquipamento equipamento() {
        System.out.println("Estou utilizando uma bicicleta para duas pessoas!");
        return null;
    }
}
