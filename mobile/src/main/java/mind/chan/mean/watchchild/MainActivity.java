package mind.chan.mean.watchchild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private TextView latTextView, lngTextView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View
        latTextView = (TextView) findViewById(R.id.txtLat);
        lngTextView = (TextView) findViewById(R.id.txtLng);
        button = (Button) findViewById(R.id.btnSent);

        //Button Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latTextView.setText("Lat = 123.4567");
                lngTextView.setText("Lng == 456.1234");
            }
        });

    }   // Main Method

}   // Main Class
