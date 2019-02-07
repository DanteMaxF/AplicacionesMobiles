package mx.tec.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
    }

    //Next button method
    public void Next(View view){
        Intent nextIntent = new Intent(this, SecondActivity.class);
        nextIntent.putExtra("username", et1.getText().toString());
        startActivity( nextIntent );
    }
}
