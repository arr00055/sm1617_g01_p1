package sm1617ej2;

/**Created on 13/11/2016.
 * @author Alejandro Romo Rivero.
 */
//Se crea la interfaz.
public interface interfaz {
    //Método Modificar al cual le paso el nombreproducto, proveedor, valor actual y valor mínimo para que el usurio pueda modificar
    //lo que desee y luego sea guardado y por ello me devuelve una cadena con la modificación realizada que se guardará.
    public String Modificar(String nombreproducto,String proveedor,int valoractual, int valorminimo);

    //Método Eliminar al cual le paso el nombreproducto, proveedor, valor actual y valor mínimo para que el usurio elimine lo que
    //ha seleccionado y será un método vacio ya que no debe devolver nada pues solo elimina lo que el usuario ha seleccionado.
    public void Eliminar(String nombreproducto,String proveedor,int valoractual, int valorminimo);

    //Método Introducir al cual le paso el nombreproducto, proveedor, valor actual y valor mínimo que quiere añadir el usuario a su
    //control del stock. Me devolverá una cadena con lo introducido por parte del usuario para guardarlo.
    public String Introducir(String nombreproducto,String proveedor,int valoractual, int valorminimo);

}//Cierro la interfaz.
