package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        //int par = o;
        for(int par = 1; par <= 1000000; par = par + 2){
            if(par % 2 == 0) {
                System.out.println(par);
            }
        }
    }
}
