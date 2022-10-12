public class Main {
    public static void main(String[] args) {
        Algoritmo algo = new Algoritmo();

        int[] vector1 = {1,2,3,4,5,7,8};
        int[] vector2 = {10,20,30,1,4,40};
        int[] vector3 = {};
        //int[] sol = {};
        Booleano bexito = new Booleano(false);
        //algo.subconjuntoSuma(vector1,6,sol,0,bexito);

        // Enunciado de ejercicio, esto es la solución que dan ellos
        int[] vector = {13, 11, 7};
        int num = 20;
        Booleano booleanexito = new Booleano(false);
        int[] solucion = new int[vector.length];
        for (int i=0; i<solucion.length; i++) solucion[i]=0;
        algo.subconjuntoSuma(vector, num, solucion, 0, booleanexito);
    }
}
