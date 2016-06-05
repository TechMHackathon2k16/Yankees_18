package crimsontyphoon.symphony;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class end extends AppCompatActivity {

    private static ImageButton im;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);



    }

    public void end1(){
        im = (ImageButton) findViewById(R.id.imgbtnr);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(end.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
