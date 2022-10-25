package Aps.Equipamentos;

public class Skate implements TrocaEquipamento {
    @Override
    public TrocaEquipamento equipamento() {
        System.out.println("Estou utilizando um Skate!");
        return null;
    }
}
