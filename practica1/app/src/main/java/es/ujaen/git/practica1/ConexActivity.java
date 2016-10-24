package es.ujaen.git.practica1;
/**Esta es la clase de la actividad a la que pasamos una vez utilizamos el intent desde el fragmento tras pular el botón de enviar.
 * @param usuario     el nick o nombre que introduce el usuario en la interfaz.
 * @param password    la contraseña que introduce el usuario en la interfaz.
 * @param direccionIp la dirección Ip que introduce el usuario en la interfaz.
 * @param puerto      el puerto que introduce el usuario en la interfaz.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
//La clase ConexActivity hereda de AppCompatActivity.
public class ConexActivity extends AppCompatActivity {
//Ciclo de vida onCreate cuando se crea la Actividad. Aquí es donde se inicializa la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conex); //Pinto el layout correspondiente a la actividad ConexActivity.
//Tomamos el Intent que va dirigido a esta actividad y sacamos los Extras donde están los datos que nos envía el fragmento.
        Bundle bundle = getIntent().getExtras();
//Si bundle es diferente de null se procede a extraer los String y los Int y se guardan en variables.
        if (bundle != null){
            String user = bundle.getString("usuario");
            String pass = bundle.getString("password");
            String ip   = bundle.getString("direccionIp");
            int port    = bundle.getInt("puerto");

            //Toast.makeText(this, "Nombre: "+user, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Contraseña: "+pass, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Dirección IP: "+ip, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, "Puerto: "+port, Toast.LENGTH_SHORT).show();

        }//Fin del if.
    }//Fin del onCreate.
}//Fin del ConexActivity.
