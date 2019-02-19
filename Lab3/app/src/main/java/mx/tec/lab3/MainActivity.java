package mx.tec.lab3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Context myContext;
    private Toast myToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContext = getApplicationContext();
        myToast = new Toast(myContext);

        myToast.makeText(myContext, "This is the first toast you will see!",
                Toast.LENGTH_LONG).show();


        //Alert Dialog 1 ---------------------------------------------------------------------------

        AlertDialog.Builder DialogConf = new AlertDialog.Builder( this );

        DialogConf.setTitle("TITLE");
        DialogConf.setMessage("This is the Text of the Dialog");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "WOOOOO!",Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog myDialog = DialogConf.create();
        myDialog.show();

        // Alert Dialog 2 --------------------------------------------------------------------------

        AlertDialog.Builder DialogConf_two = new AlertDialog.Builder( this );

        DialogConf_two.setTitle("Confirmation Dialog");
        DialogConf_two.setMessage("This is the text of the dialog");
        DialogConf_two.setIcon(R.mipmap.ic_launcher);

        DialogConf_two.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "Your answer was YES!",Toast.LENGTH_LONG).show();
                    }
                });

        DialogConf_two.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "Your answer was NO!",Toast.LENGTH_LONG).show();
                    }
                });

        DialogConf_two.setNeutralButton("Neutral",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        myToast.makeText(myContext, "Your closed the dialog!",Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog myDialog_two = DialogConf_two.create();
        myDialog_two.show();

        // Alert Dialog 3 --------------------------------------------------------------------------
        AlertDialog.Builder DialogConf_three = new AlertDialog.Builder( this );

        DialogConf_three.setTitle("Confirmation Dialog");
        DialogConf_three.setMessage("This is the text of the dialog");
        DialogConf_three.setIcon(R.mipmap.ic_launcher);

        final EditText TextInput = new EditText(myContext);
        TextInput.setTextColor(Color.BLUE);

        DialogConf_three.setView(TextInput);

        DialogConf_three.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        String str = TextInput.getEditableText().toString();
                        myToast.makeText(myContext, "You wrote "+str+" in the dialog",Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog myDialog_three = DialogConf_three.create();
        myDialog_three.show();

    }




}
