package cl.awakelab.ejecutable;

import cl.awakelab.electrodomesticos.*;
/**
 * Se genera esta clase Ejecutable para correr el programa.
 * @author Alumno
 *
 */
public class Ejecutable {
    public static void main(String[] args) {
        /**
         * se crea una lista de Electrodomesticos en la que dentro de ella
         * se crean televisores, lavadoras y electrodomesticos.
         */
        Electrodomestico listElectrodomesticos[] = new Electrodomestico[10];
        listElectrodomesticos[0] = new Television(50, true, 100000 ,"negro", 'A', 10);
        listElectrodomesticos[1] = new Lavadora(10, 250000, "blanco", 'D', 50);
        listElectrodomesticos[2] = new Television(70, false, 300000,"azul", 'D', 50);
        listElectrodomesticos[3] = new Lavadora(5, 150000, "negro", 'C', 30);
        listElectrodomesticos[4] = new Electrodomestico(200000, "gris", 'A', 20);
        listElectrodomesticos[5] = new Television(30, true, 100000,"", 'E', 20);
        listElectrodomesticos[6] = new Lavadora(20, 350000, "gris", 'A', 60);
        listElectrodomesticos[7] = new Electrodomestico(170000, "rojo", 'F', 10);
        listElectrodomesticos[8] = new Television();
        listElectrodomesticos[9] = new Electrodomestico(100000, "verde", 'B', 20);
        /**
         * variables para guardar los valores finales de cada objeto.
         */
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;
        double sumaElectrodomesticos = 0;

        for(int i=0;i<listElectrodomesticos.length;i++){
            
            if(listElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras += ((Lavadora) listElectrodomesticos[i]).precioFinal();
            }
            if(listElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listElectrodomesticos[i].precioFinal();
            }
            if(listElectrodomesticos[i] instanceof Television){
                sumaTelevisores += ((Television) listElectrodomesticos[i]).precioFinal();
            }
             sumaElectrodomesticos = sumaLavadoras + sumaTelevisores;
        }
       
        escribir("La suma de los televisores es de: " + sumaTelevisores);
        escribir("La suma de las lavadoras es de: " + sumaLavadoras);
        escribir("La suma total de electrodomesticos es de: " + sumaElectrodomesticos);

    }
    /**
     * 
     * @param mensaje texto que se mostrara por pantalla.
     */
    public static void escribir (String mensaje) {
        System.out.println(mensaje);
    }
}
