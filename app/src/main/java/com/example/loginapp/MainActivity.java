package com.example.loginapp;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Gravity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkSeleccionar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkSeleccionar = (CheckBox) findViewById(R.id.chkSeleccionar);
        }

    public void logChk (View v) {
        if (chkSeleccionar.isChecked() == true) {
            String mensaje = "Mantener sesion: activada";
            Toast toast = Toast.makeText(this, "Mantener sesion: activada", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();
        } else {

            String mensaje = "Mantener sesion: desactivada";
            Toast.makeText(this, mensaje,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void nextView (View v){
        Intent inte = new Intent(this, MainRecyclerView.class);
        System.out.println("llamado de login");
        startActivity(inte);

    }

    public void formView (View formv){
        Intent inte2 = new Intent(this, UserData.class);
        System.out.println("llamado de regisgtro");
        startActivity(inte2);

    }



    }
