package crimsontyphoon.symphony;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class b_screen extends AppCompatActivity  {

    private static ImageButton Play;
    int attempt_counter = 3;
    private static TextView attempts;
    private static Button btn1;
    private static Button btn2;
    private static Button btn3;
    private static Button btn4;
    private static Button btn5;
    private static Button btn6;
    private static Button btn7;
    private static Button n_btn;
    private static EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_screen);
        PlayButton();
        Nextbtn();


    }


    public void PlayButton() {
        Play = (ImageButton) findViewById(R.id.Play);
        attempts = (TextView) findViewById(R.id.tvAttempt);
        attempts.setText(Integer.toString(attempt_counter));

        Play.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = MediaPlayer.create(b_screen.this, R.raw.b);
                        mp.start();
                        attempt_counter--;
                        attempts.setText(Integer.toString(attempt_counter));
                        if (attempt_counter == 0) {
                            Play.setEnabled(false);
                        }
                    }
                }
        );
    }


    public void Nextbtn() {


        n_btn = (Button) findViewById(R.id.btnNext);
        n_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(b_screen.this, c_screen.class);
                        startActivity(intent);
                    }
                }
        );
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(b_screen.this, "The answer is correct. Enter the number in the Number section and press next", Toast.LENGTH_SHORT).show();
                        btn1.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);
                        btn7.setEnabled(false);
                    }
                }
        );
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(b_screen.this, "The answer is INCORRECT. Proceed to next question by CLICKING NEXT", Toast.LENGTH_SHORT).show();
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
            }
        });

    }

}