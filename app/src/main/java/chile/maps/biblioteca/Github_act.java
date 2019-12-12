package chile.maps.biblioteca;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Github_act extends AppCompatActivity {


    private Spinner spLibro;
    private TextView txtRespuesta;
    private EditText txtStock;
    private EditText txtPrecio;
    private String[] preciosLibro = new String[]{"7000", "22000", "45000","88000","156000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spLibro = (Spinner) findViewById(R.id.spn);
        txtRespuesta = (TextView) findViewById(R.id.result);
        txtStock = (EditText) findViewById(R.id.txstock);
        txtPrecio = (EditText) findViewById(R.id.txprecio);

    }

    public void Mostrar(View v) {
        if (spLibro.getSelectedItem().equals("Farenheit")) {
            String precio = preciosLibro[0];
            int st = Integer.parseInt(txtStock.getText().toString());
            int cp = Integer.parseInt(txtPrecio.getText().toString());
            int pc = Integer.parseInt(precio);
            int resultado = pc * st + cp;

            txtRespuesta.setText("Stock disponible: " + st + "\n"
                    + "Precio final: " + resultado);
        }

        if (spLibro.getSelectedItem().equals("Revival")) {
            String precioRevival = preciosLibro[1];

            int stock = Integer.parseInt(txtStock.getText().toString());
            int costo = Integer.parseInt(txtPrecio.getText().toString());
            int precioLibro = Integer.parseInt(precioRevival);

            int resultado = precioLibro * stock + costo;

            txtRespuesta.setText("Stock disponible: " + stock + "\n"
                    + "el precio final es: " + resultado);
        }

        if (spLibro.getSelectedItem().equals("El Alquimista")) {

            String precioTesla = preciosLibro[2];

            int stock = Integer.parseInt(txtStock.getText().toString());
            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precioTesla);

            int resultado = precioLibro * stock + costo;

            txtRespuesta.setText("Stock disponible: " + stock + "\n"
                    + "el precio final es: " + resultado);
        }

        if (spLibro.getSelectedItem().equals("El Podera")) {

            String precioTesla = preciosLibro[3];

            int stock = Integer.parseInt(txtStock.getText().toString());
            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precioTesla);

            int resultado = precioLibro * stock + costo;

            txtRespuesta.setText("Stock disponible: " + stock + "\n"
                    + "el precio final es: " + resultado);
        }

        if (spLibro.getSelectedItem().equals("Despertar")) {

            String precioTesla = preciosLibro[4];

            int stock = Integer.parseInt(txtStock.getText().toString());
            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precioTesla);

            int resultado = precioLibro * stock + costo;

            txtRespuesta.setText("Stock disponible: " + stock + "\n"
                    + "el precio final es: " + resultado);
        }
    }


}