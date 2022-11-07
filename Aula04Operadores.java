package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        float num1 = 10;
        float num2 = 20;
        float resultado = num1 / num2;
        System.out.println(resultado);

        //%
        int resto = 20 % 2;
        System.out.println("O resto é:" + resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10.0;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez: " + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueVinte: " + isDezDiferenteQueVinte);

        // && (AND) || (or) !

        int age = 35;
        double age1 = 17.5;
        float salary = 3500F;
        boolean isDentroDaLei = age > 30 && salary >=  3500;
        boolean isForaDaLei = age < 35 && salary < 3500;
        boolean isMenorDeIdade = age1 < 18;

        System.out.println("isDentroDaLei " + isDentroDaLei );
        System.out.println("isForaDaLei " + isForaDaLei );
        System.out.println("isMenorDeIdade " + isMenorDeIdade );

        double valorPlayStation = 5000;
        double valorContaCorrente = 253.30;
        double valorPoupanca = 10000.75;
        boolean isCompraEfetuada = valorContaCorrente >= valorPlayStation || valorPoupanca >= valorPlayStation;
        System.out.println("isCompraEfetuada " + isCompraEfetuada);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 5;
        contador ++;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);


    }
}
