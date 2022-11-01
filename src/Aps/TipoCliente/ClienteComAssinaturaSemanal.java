package Aps.TipoCliente;

import Aps.Equipamentos.*;

public class ClienteComAssinaturaSemanal extends Cliente {
    public ClienteComAssinaturaSemanal(){
        equipamento = new BikeDupla();
        Nome = "Patrícia Padilha";
        Cpf = "873.776.270-26";
        TipoCliente = "Assinatura Semanal";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
