public class Algoritmo {
    public void subconjuntoSuma(int[] vector, int num, int[] solucion, int nivel,
                               Booleano exito){
            if (nivel==vector.length){
                if (suma(solucion, vector, nivel)==num){
                    exito.setValor(true);
                    System.out.println("TRUE");
                }

            }else {
                int c=0; // Candidatos: c=0 no añadir; c=1 añadir
                while (!exito.getValor() &&(c < 2)){
                    if (c==0 || suma(solucion, vector, nivel)+vector[nivel] <= num){
                        solucion[nivel] = c;
                        nivel = nivel + 1;
                        subconjuntoSuma(vector, num, solucion, nivel, exito);
                        if (!exito.getValor()){
                            nivel=nivel-1;
                            solucion[nivel]=0;
                        }
                    }
                    c++;
                }
            }
    }

    // Función suma para saber el valor actual del array con los valores escogidos dependiendo
    // de las elecciones
    // No se pasa como parámetro en el metodo de bactracking porque registraría mal el valor.
    public int suma(int[] solucion, int[] vector, int nivel){
            int suma=0;
            for (int i=0; i<nivel; i++)
                if (solucion[i]==1) suma = suma+vector[i];
            return suma;
    }


}
