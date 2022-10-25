package Aps;

import Aps.TipoCliente.*;
import Aps.Equipamentos.*;

public class Teste {
    public static void main(String[] args) {
        System.out.println(); // Estetica
//Criação de um novo objeto da superclasse cliente com a Subclasse cliente sem assinatura:
        Cliente Pessoa = new ClienteSemAssinatura();
//Utilizaçao dos metodo apresentar e usar equipamento que imprimem o nome cpf e equipamento atual:
        Pessoa.apresentar();
        Pessoa.usarEquipamento();
//Alteração dinamica (runtime) do equipamento:
        Pessoa.setEquipamento(new Skate());
//Metodo que imprime o equipamento atual:
        Pessoa.usarEquipamento();
        System.out.println(); // Estetica
//CLiente anual:
        Cliente Pessoa2 = new ClienteComAssinaturaAnual();
        Pessoa2.apresentar();
        Pessoa2.usarEquipamento();
        System.out.println(); // Estetica
//Cliente mensal:
        Cliente Pessoa3 = new ClienteComAssinaturaMensal();
        Pessoa3.apresentar();
        Pessoa3.usarEquipamento();
        System.out.println(); // Estetica
//Cliente Semanal:
        Cliente Pessoa4 = new ClienteComAssinaturaSemanal();
        Pessoa4.apresentar();
        Pessoa4.usarEquipamento();
    }
}
