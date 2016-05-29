package pbl7roboterapia.pbl7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class IdleActivity extends AppCompatActivity {

    private SharedPreferences sharedPref;
    private static final int PREFERENCE_MODE_PRIVATE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idle);

        TextView textView = (TextView) findViewById(R.id.welcomeText);
        textView.setTextSize(20);
        sharedPref = getSharedPreferences("database",PREFERENCE_MODE_PRIVATE);
        textView.setText(sharedPref.getString("USERNAME", "ERROR"));
    }

    public void Cycle (View view){
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
        finish();
    }


}