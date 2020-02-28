package cl.awakelab.electrodomesticos;
/**
 * Esta clase contiene los atributos base para las subclases
 * @author Alexis Ruiz.
 *
 */
public class Electrodomestico {

    /**
     * se definen las constantes de Electrodomestico.
     */
    private final static String COLOR_POR_DEFECTO = "blanco";
    private final static char CONSUMO_POR_DEFECTO = 'F';
    private final static double PRECIO_BASE_POR_DEFECTO = 100000;
    private final static int PESO_POR_DEFECTO = 5;

    /**
     * se definen los atributos.
     */
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    /**
     * se crean los constructores.
     */
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;

    }
    /**
     * 
     * @param precioBase valor base de los electrodomesticos.
     * @param peso peso base de los electrodomesticos.
     */
    public Electrodomestico(double precioBase, int peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }
    /**
     * 
     * @param precioBase valor base de los electrodomesticos.
     * @param color Color base de los electrodomesticos.
     * @param consumoEnergetico consumo base de los electrodomesticos.
     * @param peso peso base de los electrodomesticos.
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
        this(precioBase, peso);
        this.color = (comprobarColor(color));
        this.consumoEnergetico = (comprobarConsumoEnergetico(consumoEnergetico));
    
    }
    // metodos
    /**
     * este metodo sirve para comprobar el consumo energetico y si la letra
     * no es una de la lista utiliza la letra por defecto.
     * @param letra 
     */
                private char comprobarConsumoEnergetico(char letra) {
            char letras[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
            boolean encontrado = false;
            this.consumoEnergetico = 'F';
            for (int i = 0; i < letras.length && !encontrado; i++) {
                if (letras[i]==letra) {
                    encontrado = true;
                    this.consumoEnergetico = letra;
                }
            }
            return this.consumoEnergetico;
        }
    /**
     * este metodo sirve para comprobar el color del electrodomestico si no es
     * uno de los definidos en la lista utiliza el por defecto.
     * @param color
     */
    private String comprobarColor(String color) {
        String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_POR_DEFECTO;
        }
        return this.color;
    }
    /**
     * Se utiliza para otorgarle un valor segun el consumo y el peso del Electrodomestico.
     * @return retorna el precio final segun su consumo y peso.
     */
    public double precioFinal() {
        double aumento = 0;
        switch (consumoEnergetico) {
        case 'A':
            aumento = 100;
            break;
        case 'B':
            aumento = 80;
            break;
        case 'C':
            aumento = 60;
            break;
        case 'D':
            aumento = 50;
            break;
        case 'E':
            aumento = 30;
            break;
        case 'F':
            aumento = 10;        
            break;
        }
        if (peso >= 0 && peso <= 19) {
            aumento += 10;
        }else if ( peso >= 20 && peso <= 49) {
            aumento += 50;
        }else if ( peso >= 50 && peso <=79 ) {
            aumento += 80;
        }else if ( peso >= 80 ){
            aumento += 100;
        }
        
        double precioFinal = aumento + this.precioBase;
        return precioFinal;
    }

    // getters.
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

}
