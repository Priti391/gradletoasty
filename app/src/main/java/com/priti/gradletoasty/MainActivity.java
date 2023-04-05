package com.priti.gradletoasty;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showtoast(View view) {
        switch (view.getId()) {
            case R.id.error:
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.success:
                Toasty.success(MainActivity.this, "this is Success toast", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.info:
                Toasty.info(MainActivity.this, "this is some info toast.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.warningbutton:
                Toasty.warning(MainActivity.this, "this is warning toast.", Toast.LENGTH_SHORT, true).show();
                break;
            case R.id.imagebutton:
                Toasty.normal(MainActivity.this, "Image",
                        Toast.LENGTH_SHORT,
                        ContextCompat.getDrawable(MainActivity.this, R.drawable.image)).show();
                break;
        }
    }
    }
