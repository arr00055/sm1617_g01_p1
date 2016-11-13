package sm1617ej2;

import java.io.*;
import java.net.*;

/**Created on 13/11/2016.
 * @author Alejandro Romo Rivero.
 */

public abstract class servicio {
    final int PUERTO=6000;             //Puerto en el que estará escuchando nuestro servidor TCP por conexiones.
    ServerSocket Servidorsocket;       //Variable Servidorsocket de tipo ServerSocket.
    Socket so;                         //Variable so de tipo Socket.
    DataOutputStream salida;           //Variable salida que será del flujo de salida de datos.
    String mensajeRecibido;            //Cadena para mensajerecibido

    //Arrancaserv será el método que arranca el servidor.
    public void Arrancaserv()
    {
        BufferedReader entrada; //Variable para el flujo de datos de entrada.
        try {
            Servidorsocket = new ServerSocket(PUERTO);// Crea socket servidor que escuchara en puerto 6000.
            so=new Socket();
            System.out.println("Esperando una conexión:");
            so = Servidorsocket.accept();
            //Inicia el socket, ahora esta esperando una conexión por parte del cliente
            System.out.println("Un cliente se ha conectado.");
            //Canales de entrada y salida de datos
            entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
            salida = new DataOutputStream(so.getOutputStream());
            System.out.println("Confirmando conexion al cliente....");
            salida.writeUTF("Conexión exitosa...n envia un mensaje :D");
            //Recepcion de mensaje
            mensajeRecibido = entrada.readLine();
            System.out.println(mensajeRecibido);
            salida.writeUTF("Se recibio tu mensaje.n Terminando conexion...");
            salida.writeUTF("Gracias por conectarte, adios!");
            System.out.println("Cerrando conexión...");
            Servidorsocket.close();//Se cierra la conexión con el servidor.
        }catch(Exception e )//Fin del try, Coge la excepción de error del servidor.
        {//Inicio del catch.
            System.out.println("Error: "+e.getMessage());//Lanza el error.
        }//Fin del catch.
    }//Fin del método Arrancaserv
}//Fin clase abstracta servicio.
