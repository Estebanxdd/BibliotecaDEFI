package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Mqtt_act extends AppCompatActivity {

    static String MQTTHOST = "tcp://ttailor.cloudmqtt.com:13764";
    static String USERNAME = "ndttzvsb";
    static String PASSWORD = "3IQxdCn8w2W3";
    String topicSrt = "Libro";
    MqttAndroidClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt_act);

        //Generar el clientID

        String clientId = MqttClient.generateClientId();

        client = new MqttAndroidClient(this.getApplicationContext(),MQTTHOST, clientId);
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());




        try {
            IMqttToken token = client.connect(options);
            token.setActionCallback(new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    // We are connected
                    Toast.makeText(getBaseContext(), "SE HA CONECTADO", Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    // Something went wrong e.g. connection timeout or firewall problems
                    Toast.makeText(getBaseContext(), "No se ha establecido la conexion", Toast.LENGTH_LONG).show();


                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }


    }

        public void LibroUno(View v)
        {
         String topic = topicSrt;
         String message = "LibroUno";

         try{

           client.publish(topic,message.getBytes(), 0, false);

         }
         catch(Exception e)
            {
              e.printStackTrace();
            }

        }

        public void LibroDos(View v)
        {
            String topic = topicSrt;
            String message = "LibroDos";

            try{

                client.publish(topic,message.getBytes(), 0, false);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }


        public void LibroTres(View v)
        {
            String topic = topicSrt;
            String message = "LibroTres";

            try{

                client.publish(topic,message.getBytes(), 0, false);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }


        public void LibroCuatro(View v)
        {
            String topic = topicSrt;
            String message = "LibroCuatro";

            try{

                client.publish(topic,message.getBytes(), 0, false);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }


        public void LibroCinco(View v)
        {
            String topic = topicSrt;
            String message = "LibroCinco";

            try{

                client.publish(topic,message.getBytes(), 0, false);

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }



}
