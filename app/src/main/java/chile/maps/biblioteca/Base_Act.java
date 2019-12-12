package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Base_Act extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_);

        et1 = (EditText)findViewById(R.id.codigo);
        et2 = (EditText)findViewById(R.id.nombre);
        et3 = (EditText)findViewById(R.id.precio);
    }

    public void añadirLibro(View v)
    {
        AdminSQLLiteOpenHelper admin = new AdminSQLLiteOpenHelper(this, "LIBROS", null, 1);
        SQLiteDatabase Biblioteca = admin.getReadableDatabase();

        if (!et1.getText().toString().isEmpty())
        {
            ContentValues registro = new ContentValues();
            registro.put("Codigo", et1.getText().toString());
            registro.put("Nombre", et2.getText().toString());
            registro.put("Precio", et3.getText().toString());

            Biblioteca.insert("LIBROS", null, registro);
            Biblioteca.close();

            Toast.makeText(this, "Se ha Ingresado un nuevo Libro", Toast.LENGTH_LONG).show();

        }

    }

    public void eliminarLibro(View v)

    {
        AdminSQLLiteOpenHelper admin = new AdminSQLLiteOpenHelper(this, "LIBROS", null, 1);
        SQLiteDatabase Biblioteca = admin.getReadableDatabase();

        String codigo = et1.getText().toString(); //codigo para eliminar libro

        Biblioteca.delete("LIBROS", "codigo"+codigo, null);
        Biblioteca.close();

        Toast.makeText(this, "Se ha Eliminado el Libro con el codigo: "+codigo, Toast.LENGTH_LONG).show();
    }

    public void modificarLibros(View v)
    {
        AdminSQLLiteOpenHelper admin = new AdminSQLLiteOpenHelper(this, "LIBROS", null, 1);
        SQLiteDatabase Biblioteca = admin.getReadableDatabase();

        String codigo = et1.getText().toString(); //codigo para modificar libro

        ContentValues cont = new ContentValues();
        cont.put("Codigo",et1.getText().toString());
        cont.put("Nombre",et2.getText().toString());
        cont.put("Precio",et2.getText().toString());

        if(!et1.getText().toString().isEmpty())
        {

            Biblioteca.update("LIBROS", cont, "codigo=" + codigo, null);
            Toast.makeText(this, "Se ha Modificado el Libro con el codigo: "+codigo, Toast.LENGTH_LONG).show();
        }


    }
}

