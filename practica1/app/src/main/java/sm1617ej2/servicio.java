package sm1617ej2;

import java.io.*;
import java.net.*;

/**Created on 13/11/2016.
 * @author Alejandro Romo Rivero.
 */
//Creación de la clase abstracta servicio por medio del abstract.
public abstract class servicio {
    static ServerSocket mServidor = null; //Se inicializa la variable del mServidor del tipo ServerSocket.
    public static int mConexiones = 0;    //Se inicializa la variable Conexiones de tipo entero, para el número de conexiones.
    final int PUERTO=6000;                //Puerto en el que estará escuchando nuestro servidor TCP por conexiones.
    ServerSocket mServersocket;           //Variable mServersocket de tipo ServerSocket.
    Socket mSocket;                       //Variable mSocket tipo Socket.
    String inputData = null;              //Cadena para los datos de entrada.
    String outputData = "";               //Cadena para los datos de salida.
    String comando = "";                  //Cadena para los comandos.
    String parametro = "";                //Cadena para los parámetros.
    String tempUser = "";                 //Cadena para la temporización del usuario.

    abstract void main(String[] args);    //Método principal.
    abstract public void Autentica();     //Método para la autenticación del usuario.
    abstract public void run();           //Método para arrancar el servidor.
    abstract public void close();         //Método para cerrar el servidor.
    abstract public void peticion();      //Método para recibir la petición del usuario.

}//Fin clase abstracta servicio.
