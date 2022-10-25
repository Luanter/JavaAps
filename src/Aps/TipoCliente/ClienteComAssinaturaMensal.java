package Aps.TipoCliente;

import Aps.Equipamentos.PranchaDeSurf;

public class ClienteComAssinaturaMensal extends Cliente {
    public ClienteComAssinaturaMensal(){
        equipamento = new PranchaDeSurf();
        Nome = "Camila Azevedo";
        Cpf = "745.813.460-70";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
