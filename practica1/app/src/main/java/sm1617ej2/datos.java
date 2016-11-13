package sm1617ej2;
/**Created on 13/11/2016.
 * @author Alejandro Romo Rivero.
 */
/**La clase datos será la encargada de modelar los datos para el servicio de "Control de Stock" de la aplicación, esta servicio
 * requiere de los campos: [Nombre del producto, proveedor, valor actual y valor mínimo] y serán los que modele esta clase.
 * La clase es declarada como public siendo una pieza de código visible en todos los niveles.
 */
public class datos{
    //Atributos de la clase datos.
    public static final int Valor_Inicial=0;//Valor que coloco para iniciar los enteros.
    //Con el modificador protected solo las clases que se encuentren en el mismo paquete pueden ver y acceder a estos atributos.
    protected String mNombreproducto="";
    protected String mProveedor="";
    protected int    mValoractual=Valor_Inicial;
    protected int    mValorminimo=Valor_Inicial;

    /**
     *Constructor de la clase datos.
     * @param nombreproducto Cadena que se le pasa al constructor de la clase datos con el nombre del producto.
     * @param proveedor      Cadena que se pasa al constructor de la clase datos con el nombre del proveedor asociado al producto.
     * @param valoractual    Entero que se pasa al constructor de la clase datos con el valor actual del producto en stock.
     * @param valorminimo    Entero que se pasa al constructor de la clase datos con el valor mínimo del producto que se debe tener.
     * Una vez se le pasan estos datos al constructor cuando se le llama en el código, guarda aquí los valores que se le han pasado
     * entre () y los almacena en las variables que están declaradas en la clase y con los métodos de la clase se podrá acceder a estos
     * valores cuando lo necesita.
     */
    public datos(String nombreproducto,String proveedor,int valoractual, int valorminimo){

        mNombreproducto=nombreproducto;
        mProveedor=proveedor;
        mValoractual=valoractual;
        mValorminimo=valorminimo;

    }//Fin del constructor de la clase datos.

    //Los métodos get: Me permiten obtener el valor de los diferentes campos que se modelan en la clase datos.
    //Los métodos set: Me permiten introducir un determinado valor que pase al llamar al método entre sus () y que lo almacene en
    //la variable correspondiente a ese método set.

    /**
     *  Método getNombreproducto.
     *  @return mNombreproducto.
     */
    public String getNombreproducto(){
        return mNombreproducto;
    }

    /**
     *  Método setNombreproducto.
     */
    public void setNombreproducto(String nombreproducto){
        mNombreproducto=nombreproducto;
    }

    /**
     *  Método getProveedor.
     *  @return mProveedor.
     */
    public String getProveedor(){
        return mProveedor;
    }

    /**
     *  Método setProveedor.
     */
    public void setProveedor(String proveedor){
        mProveedor=proveedor;
    }

    /**
     *  Método getValoractual.
     *  @return mValoractual.
     */
    public int getValoractual(){
        return mValoractual;
    }

    /**
     *  Método setValoractual.
     */
    public void setValoractual(int valoractual){
        mValoractual=valoractual;
    }

    /**
     *  Método getValorminimo.
     *  @return mValorminimo.
     */
    public int getValorminimo(){
        return mValorminimo;
    }

    /**
     *  Método setValorminimo.
     */
    public void setValorminimo(int valorminimo){
        mValorminimo=valorminimo;
    }

}//Fin de la clase datos.
