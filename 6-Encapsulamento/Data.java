import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        this.dia = sc.nextInt();

        System.out.print("Digite o mês: ");
        this.mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        this.ano = sc.nextInt();
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    /*O método maior da classe Data deve receber outra data d2 como parâmetro de verificar se a data this ́e maior que a data d2 (ou seja, se ela aconteceu após a data d2)*/
    public boolean maior(Data d2){
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