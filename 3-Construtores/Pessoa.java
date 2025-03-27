public class Pessoa {
    String nome, cpf;
    Data dtNasc;
    char sexo;

    void idadePessoa(Data dtHoje){
        int idade = dtHoje.ano - this.dtNasc.ano;
        if(dtHoje.mes < this.dtNasc.mes || (dtHoje.mes == this.dtNasc.mes && dtHoje.dia < this.dtNasc.dia)){
            idade--;
        }
        System.out.println("Idade: " + idade);
    }

    Pessoa(String nome, String cpf, Data dtNasc, char sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
    }
}
