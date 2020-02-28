package cl.awakelab.electrodomesticos;
/**
 * Se crea la clase television.
 * @author Alexis Ruiz.
 *
 */
public class Television extends Electrodomestico {
    // constantes.
    private final static double RESOLUCION_POR_DEFECTO = 20;
    private final static boolean SINTONIZADOR_POR_DEFECTO = false;

    // Atributos.
    private double resolucion;
    private boolean sintonizador;

    // constructores.
    public Television() {
        super();
        this.sintonizador = SINTONIZADOR_POR_DEFECTO;
    }
    /**
     * 
     * @param precioBase recibe el precio base de electrodomesticos.
     * @param peso recibe el peso base de electrodomesticos.
     */
    public Television(double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizador = SINTONIZADOR_POR_DEFECTO;
    }
    /**
     * 
     * @param resolucion la resolucion de la TV.
     * @param sintonizador recibe si la tv posee un sintonizador.
     * @param precioBase recibe el precio base de electrodomesticos.
     * @param color recibe el color base de electrodomesticos.
     * @param consumoEnergetico recibe el consumo base de electrodomesticos.
     * @param peso recibe el peso base de electrodomesticos.
     */
    public Television(double resolucion, boolean sintonizador, double precioBase, String color, char consumoEnergetico,
            int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    // getter.
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    // metodo.
    @Override
    /**
     * asigna un valor segun la resolucion del televisor y si posee sintonizador el cual suma al precio base.
     */
    public double precioFinal() {
        super.precioFinal();
        double aumento = 0;
        if(resolucion < 40) {
            aumento *= 0.3;
        }
        if(sintonizador == true) {
            aumento += 50;
        }
        double precioFinal = aumento + super.getPrecioBase();
        return precioFinal;
    }

}
