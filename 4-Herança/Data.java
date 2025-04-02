public class Data {
    int dia, mes, ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    /*O método maior da classe Data deve receber outra data d2 como parâmetro de verificar se a data this ́e maior que a data d2 (ou seja, se ela aconteceu após a data d2)*/
    boolean maior(Data d2){
        if(this.ano > d2.ano){
            return true;
        } else if(this.ano == d2.ano && this.mes > d2.mes){
            return true;
        } else if(this.ano == d2.ano && this.mes == d2.mes && this.dia > d2.dia){
            return true;
        } else {
            return false;
        }
    }
}
