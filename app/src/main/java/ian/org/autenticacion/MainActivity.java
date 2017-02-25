package ian.org.autenticacion;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vibrator C =(Vibrator) getSystemService(VIBRATOR_SERVICE);
        C.vibrate(5000);
    }
}
