import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        this.setDia(sc.nextInt());

        System.out.println("Digite o mês: ");
        this.setMes(sc.nextInt());

        System.out.println("Digite o ano: ");
        this.setAno(sc.nextInt());
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

    public int comparar(Data d2){
        if(this.ano < d2.getAno()){
            return -1;
        } else if(this.ano > d2.getAno()){
            return 1;
        } else {
            if(this.mes < d2.getMes()){
                return -1;
            } else if(this.mes > d2.getMes()){
                return 1;
            } else {
                if(this.dia < d2.getDia()){
                    return -1;
                } else if(this.dia > d2.getDia()){
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}