package mx.tec.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btNext);
        et1 = findViewById(R.id.et1);

        btnNext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent nextIntent = new Intent(MainActivity.this, SecondActivity.class);
                nextIntent.putExtra("username", et1.getText().toString());
                startActivity( nextIntent );
            }
        });
    }

    //Next button method
    /*public void Next(View view){
        Intent nextIntent = new Intent(this, SecondActivity.class);
        nextIntent.putExtra("username", et1.getText().toString());
        startActivity( nextIntent );
    }*/
}
