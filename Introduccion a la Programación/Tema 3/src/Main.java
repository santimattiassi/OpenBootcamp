public class Main {

    public static void main(String[] args) {
        //Llamar a la función en el main y darle valores.
        suma(16, 32, 64);

        ////Crear un objeto miCoche en el main y añadirle una puerta
        Coche miCoche = new Coche();
        miCoche.sumaPuerta();

        //Mostrar el número de puertas que tiene el objeto.
        System.out.println(miCoche.CantPuertas);

    }

    //Crear una función con tres parámetros que sean números que se suman entre sí.
    public static void suma(int a, int b, int c){ //
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
//Crear una clase coche.
class Coche {

    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    public int CantPuertas = 0;


    //Una función que incremente el número de puertas que tiene el coche
    public void sumaPuerta(){

        this.CantPuertas++;
    }
}