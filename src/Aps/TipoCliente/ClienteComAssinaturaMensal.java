package Aps.TipoCliente;

import Aps.Equipamentos.*;

public class ClienteComAssinaturaMensal extends Cliente {
    public ClienteComAssinaturaMensal(){
        equipamento = new PranchaDeSurf();
        Nome = "Camila Azevedo";
        Cpf = "745.813.460-70";
        TipoCliente = "Assinatura Mensal";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
