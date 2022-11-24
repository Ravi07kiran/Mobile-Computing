package com.example.mclab1;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
    int ch=1;
    float font = 30;
    float font2 = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= (TextView) findViewById(R.id.textView);
        final TextView t2 = (TextView) findViewById(R.id.textVi);
        Button b3 = (Button) findViewById(R.id.button);
        Button b1= (Button) findViewById(R.id.button1);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Hello There!");
                t2.setText("Mr.Ravi Kiran");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                t2.setTextSize(font2);
                font = font + 5;
                font2 = font2 - 5;
                if (font == 50)
                    font = 30;
                if (font2 == 30)
                    font2 = 50;

            }
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        t2.setTextColor(Color.MAGENTA);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        t2.setTextColor(Color.YELLOW);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.CYAN);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        t2.setTextColor(Color.BLUE);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        t2.setTextColor(Color.GREEN);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        t2.setTextColor(Color.RED);
                        break;
                }
                ch++;
                if (ch == 7)
                ch = 1;
            }
        });
    }
}