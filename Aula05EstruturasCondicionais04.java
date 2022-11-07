package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        //calculando o imposto anal
        double salary = 25000;
        double imposto1 = 9.7 /100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;
        double impostoFinal;

        if (salary <= 34712){
            impostoFinal = salary * imposto1;
        }else if (salary >= 34713 && salary <= 68507) {
            impostoFinal = salary * imposto2;
        }else{
            impostoFinal = salary * imposto3;
        }
        System.out.println(impostoFinal);
        }
    }

