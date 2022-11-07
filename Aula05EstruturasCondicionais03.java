package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 5000;
        String mensagemDoar = ("Eu vou doar 500 para o DevDojo");
        String mensagemNaodoar = ("Eu ainda nao tenho condições para doar");
        // (condicao) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaodoar;

        System.out.println(resultado);
    }
}
