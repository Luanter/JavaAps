package Aps.TipoCliente;

import Aps.Equipamentos.BikeDupla;

public class ClienteComAssinaturaSemanal extends Cliente {
    public ClienteComAssinaturaSemanal(){
        equipamento = new BikeDupla();
        Nome = "Patrícia Padilha";
        Cpf = "873.776.270-26";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
