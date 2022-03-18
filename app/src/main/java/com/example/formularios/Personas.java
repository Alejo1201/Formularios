package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Personas extends AppCompatActivity {


    public ImageView Persona;
    public Button   BotonP;
    public TextView NombreP;
    public TextView ApellidoP;
    public TextView EdadP;
    public TextView SexoP;
    public TextView DireccionP;
    public TextView EmailP;
    public TextView TelefonoP;
    public TextView OcupacionP;
    public TextView EstaturaP;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas_c);
        setPersonas();
    }


    private void setPersonas(){
        Persona =findViewById(R.id.imageViewP);
        BotonP =findViewById(R.id.buttonP);
        NombreP =findViewById(R.id.NomP);
        ApellidoP =findViewById(R.id.ApellP);
        EdadP =findViewById(R.id.EdadP);
        SexoP =findViewById(R.id.SexoP);
        DireccionP =findViewById(R.id.DirP);
        EmailP =findViewById(R.id.EdadP);
        TelefonoP =findViewById(R.id.TeleP);
        OcupacionP =findViewById(R.id.OcupP);
        EstaturaP =findViewById(R.id.EstatP);

    }

}