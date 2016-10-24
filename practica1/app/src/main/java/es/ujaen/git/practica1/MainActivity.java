package es.ujaen.git.practica1;
/**Esta es la clase de nuestra MainActivity, es la actividad que se carga con la aplicación y en la
 * que se contiene el fragmento dinámico.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//La clase MainActivity hereda de AppCompatActivity.
public class MainActivity extends AppCompatActivity{
//Ciclo de vida onCreate cuando se crea la Actividad. Aquí es donde se inicializa la actividad.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Pinto el layout relacionado con mi MainActivity.

        FragmentManager fm = getSupportFragmentManager();//Llamo al FragmentManager que es el que sabe sobre el fragmento.
        FragmentTransaction ft = fm.beginTransaction();//Comienzo la transición para los cambios sobre el fragmento.
        Fragment f=fm.findFragmentById(R.id.main_frame);//Busco el fragmento por su Id.
        if(f==null)//Compruebo si el fragmento encontrado por la Id es null.
        {
            AuthFragment au = AuthFragment.newInstance("","","","");//Creo una nueva instancia au de tipo AuthFragment.
            ft.add(R.id.main_frame, au);//Se le añade el fragmento y se le pasa la instancia.
            ft.addToBackStack(null);
        }//Fin del if.
        ft.commit();//Se realizan los cambios.
    }//Fin del onCreate.


}//Fin del MainActivity.