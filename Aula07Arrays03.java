package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        numeros [0] = 10;
        numeros [1] = 100;
        numeros [2] = 1000;
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[]{5,4,3,2,1};

//        for (int i = 0; i < numeros3.length ; i++) {
//            System.out.println(numeros3[i]);
//        }
        for (int num: numeros
             ) {
            System.out.println(num);
        }
    }
}
