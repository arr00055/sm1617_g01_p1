package es.ujaen.git.practica1;

/**Esta clase se encarga de modelar los datos del usuario, aquí es donde se guardan los datos.
 *
 */
public class Autenticacion{

    public static final int SERVICE_PORT=6000;


    protected String mUser="";
    protected String mPass="";
    protected String mIP="";
    protected int    mPort=SERVICE_PORT;

    /**
     *Constructor de la clase.
     * @param user variable donde se guarda el nombre o nick del usuario.
     * @param pass variable donde se guarda la contraseña del usuario.
     * @param ip   variable donde se guarda la dirección Ip del usuario.
     * @param port variable donde se guarda el puerto del usuario.
     */
    public Autenticacion(String user,String pass,String ip, int port){

        mUser=user;
        mPass=pass;
        mIP=ip;
        mPort=port;

    }
//Métodos getUser para obtener al usuario, cuando se llama @return mUser.
    public String getUser(){
        return mUser;
    }
//Método setUser se le introduce el usuario y asigna a la variable mUser el valor user.
    public void setUser(String user){
        mUser=user;
    }

    public String getPass(){
        return mPass;
    }

    public void setPass(String pass){
        mPass=pass;
    }

    public String getIP(){
        return mIP;
    }

    public void setIP(String ip){
        mIP=ip;
    }

    public int getPort(){
        return mPort;
    }

    public void setPort(int port){
        mPort=port;
    }




}
