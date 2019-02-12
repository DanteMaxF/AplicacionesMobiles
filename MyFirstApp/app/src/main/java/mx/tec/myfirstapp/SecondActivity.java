package mx.tec.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv1;
    private Button btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnPrev = findViewById(R.id.btPrev);
        tv1 = findViewById(R.id.tv1);

        String uname = getIntent().getStringExtra("username");
        tv1.setText("Hola "+ uname);

        btnPrev.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent previous = new Intent(SecondActivity.this, MainActivity.class);
                startActivity( previous );
            }
        });
    }

    //Previous button method
    /*
    public void Previous(View view){
        Intent previous = new Intent(this, MainActivity.class);
        startActivity( previous );
    }*/
}
