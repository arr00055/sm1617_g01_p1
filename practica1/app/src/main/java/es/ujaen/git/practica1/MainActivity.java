package es.ujaen.git.practica1;
/**Esta es la clase de nuestra MainActivity, es la actividad que se carga con la aplicación y en la
 * que se contiene el fragmento dinámico.
 */
//Importamos los paquetes de compatibilidad para poder hacer uso de la clase Fragment y sus métodos.
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//La clase MainActivity hereda de AppCompatActivity.
public class MainActivity extends AppCompatActivity {
//Ciclo de vida onCreate cuando se crea la Actividad. Aquí es donde se inicializa la actividad.
//En Bundle savedInstanceState es donde se reciben los datos almacenados tras un recreado de la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);     //Se llama a la superclase primero.
        setContentView(R.layout.activity_main); //Pinto el layout relacionado con mi MainActivity.

        FragmentManager fm = getSupportFragmentManager();//Obtener la instancia del administrador de fragmentos.
        FragmentTransaction ft = fm.beginTransaction();  //Creo una nueva transacción.
        Fragment f=fm.findFragmentById(R.id.main_frame); //Busco el fragmento por su Id.

        if(f==null)//Compruebo si el fragmento encontrado por la Id es null.
        {
            AuthFragment au = AuthFragment.newInstance("","","","");//Creo una nueva instancia au de tipo AuthFragment.
            ft.add(R.id.main_frame, au);//El método add() recibe dos parámetros. El primero es el identificador del contenedor donde insertaremos el fragmento. El segundo parámetro es la instancia del fragmento que queremos añadir.
            ft.addToBackStack(null);
        }//Fin del if.
        ft.commit();//Se Confirman los cambios.

    }//Fin del onCreate.


}//Fin del MainActivity.