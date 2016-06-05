package crimsontyphoon.symphony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button ins__truction;
    private static Button deve__lprs;
    private static Button new__game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButton__Listener();
    }
    public void OnClickButton__Listener(){

       new__game= (Button) findViewById(R.id.button);
        new__game.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, a_screen.class);
                        startActivity(intent);
                    }
                }
        );

        ins__truction= (Button) findViewById(R.id.button2);
        ins__truction.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, SeconActivity.class);
                        startActivity(intent);
                    }
                }
        );
        deve__lprs= (Button) findViewById(R.id.button3);
        deve__lprs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }



}


















