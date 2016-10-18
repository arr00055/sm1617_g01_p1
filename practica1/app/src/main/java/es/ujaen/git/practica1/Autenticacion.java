package es.ujaen.git.practica1;

/**
 * Created by usuario on 29/09/2016.
 */
public class Autenticacion{

    public static final int SERVICE_PORT=6000;


    protected String mUser="user";
    protected String mPass="";
    protected String mIP="127.0.0.1";
    protected int    mPort=SERVICE_PORT;

    /**
     *
     * @param user
     * @param pass
     * @param ip
     * @param port
     */
    public Autenticacion(String user,String pass,String ip, int port){

        mUser=user;
        mPass=pass;
        mIP=ip;
        mPort=port;

    }

    public String getUser(){
        return mUser;
    }

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
