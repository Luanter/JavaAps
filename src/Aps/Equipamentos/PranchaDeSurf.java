package Aps.Equipamentos;

public class PranchaDeSurf implements TrocaEquipamento{
    @Override
    public TrocaEquipamento equipamento() {
        System.out.println("Estou utilizando uma Prancha de Surf!");
        return null;
    }
}
