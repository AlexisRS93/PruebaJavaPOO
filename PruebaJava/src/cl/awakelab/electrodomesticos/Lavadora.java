package cl.awakelab.electrodomesticos;
/**
 * Se crea la clase Lavadora.
 * @author Alexis Ruiz
 *
 */
public class Lavadora extends Electrodomestico {
    // constante
    private final static int CARGA_POR_DEFECTO = 5;

    // atributos
    private int carga;

    // constructores.
    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEFECTO;
    }
    /**
     * 
     * @param precioBase recibe el precio base de electrodomesticos.
     * @param peso recibe el peso base de electrodomesticos.
     */
    public Lavadora(double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = CARGA_POR_DEFECTO;
    }
    /**
     * 
     * @param carga recibe la carga de la lavadora.
     * @param precioBase recibe el precio base de electrodomesticos.
     * @param color recibe el color base de electrodomesticos.
     * @param consumoEnergetico recibe el consumo base de electrodomesticos.
     * @param peso recibe el peso base de electrodomesticos.
     */
    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // getter.
    public int getCarga() {
        return carga;
    }

    // metodos
    @Override
    /**
     * este metodo asiga un valor segun la carga la cual se suma al precio base.
     */
    public double precioFinal() {
        super.precioFinal();
        double aumento = 0;
        if (carga < 30) {
            aumento += 50;
        } else {
            super.getPrecioBase();
        }
        double precioFinal = aumento + super.getPrecioBase();
        return precioFinal;

    }

}
