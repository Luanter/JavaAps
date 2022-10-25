package Aps.TipoCliente;

import Aps.Equipamentos.Skate;

public class ClienteComAssinaturaAnual extends Cliente {
    public ClienteComAssinaturaAnual(){
        equipamento = new Skate();
        Nome = "Diego Guimarães";
        Cpf = "701.930.720-50";
    }
    @Override
    public void usarEquipamento(){
        equipamento.equipamento();
    }
}
