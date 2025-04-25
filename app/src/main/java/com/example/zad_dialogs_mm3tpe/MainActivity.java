package com.example.zad_dialogs_mm3tpe;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Calendar;



public class MainActivity extends AppCompatActivity {
    private int licz=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button przycisk1 = findViewById(R.id.but1);
        przycisk1.setOnClickListener(v -> showAlertDialog());



    }


    private void showAlertDialog(){


        TextView licznik = findViewById(R.id.counter1);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Usuń dane");
        builder.setMessage("Czy napewno chcesz usunąć dane?");

        builder.setPositiveButton("Tak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                licz++;
                licznik.setText("Dane usunięto: "+licz+" razy");
                Toast.makeText(MainActivity.this, "Usunięto dane!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usuwanie anulowane!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.create().show();
    }

}