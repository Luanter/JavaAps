package Aps.TipoCliente;

import Aps.Equipamentos.TrocaEquipamento;

public abstract class Cliente {
//Variaveis de instancia
    TrocaEquipamento equipamento;
    protected String Nome;
    protected String Cpf;
//Metodos Get and Set para mudança dinamica de equipamento
    public TrocaEquipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(TrocaEquipamento equipamento) {
        System.out.println("Mudei meu equipamento!");
        this.equipamento = equipamento;
    }
//Metodo Set e get do nome cliente e metodo get do cpf

    public void setNome(String nome) {
        System.out.println("Efetuei a troca de nome!");
        Nome = nome;
    }

    public String getNome() {
        System.out.println("Meu nome é: "+Nome);
        return null;
    }

    public String getCpf() {
        System.out.println("Meu cpf é: "+Cpf);
        return null;
    }

    //Metodo que imprime as variaveis de instancia herdadas nome e cpf do cliente.
    public void apresentar(){
        System.out.printf("Meu nome é: %s \nMeu cpf é: %s \n",Nome,Cpf);
    }
//Metodo que imprime a variavel objeto(equipamento) atual do objeto cliente
    public abstract void usarEquipamento();
}
