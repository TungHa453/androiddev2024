package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("onCreate", "onCreate");
    }

    // Practical 2
    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart", "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop", "onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy");
    }
}