package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Sec_act extends AppCompatActivity {

    private Button Incidencia1;
    private Button Incidencia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_act);

        Incidencia1 = (Button)findViewById(R.id.btninci1);
        Incidencia2 = (Button)findViewById(R.id.btninci2);


    }




}
