package Aps.TipoCliente;

import Aps.Equipamentos.*;

public class ClienteSemAssinatura extends Cliente {
    public ClienteSemAssinatura(){
        equipamento = new Bike();
        Nome = "Jõao da Silva";
        Cpf = "123.456.789-01";
        TipoCliente = "Sem assinatura";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
