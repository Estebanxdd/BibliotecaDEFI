package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Github_act extends AppCompatActivity {


    private Spinner spLibro;
    private TextView txtRespuesta;
    private String[] precios = new String[]{"5000", "12000", "45000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);


        spLibro = (Spinner)findViewById(R.id.spi);
        txtRespuesta = (TextView)findViewById(R.id.resp);


        Bundle dat = getIntent().getExtras();
        String[] lista = dat.getStringArray("github");


        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista);

        spLibro.setAdapter(adapt);

    }

    public void Calcular(View v)
    {
        if(spLibro.getSelectedItem().equals("Farenheit"))
        {
            String precio = precios[0];

            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precio);
            int resultado = precioLibro  ;

            txtRespuesta.setText( "Precio final: "+ resultado);
        }

        if(spLibro.getSelectedItem().equals("Revival"))
        {
            String precioRevival = precios[1];


            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precioRevival);

            int resultado = precioLibro;

            txtRespuesta.setText("el precio final es: "+ resultado);
        }

        if(spLibro.getSelectedItem().equals("El Alquimista"))
        {

            String precioTesla = precios[2];


            int costo = Integer.parseInt(txtRespuesta.getText().toString());
            int precioLibro = Integer.parseInt(precioTesla);

            int resultado = precioLibro;

            txtRespuesta.setText("el precio final es: "+ resultado);
        }
    }

}
