package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonasC extends AppCompatActivity {

    public ImageView PersonaPC;
    public Button   BotonPC;
    public TextView NombrePC;
    public TextView ApellidoPC;
    public TextView EdadPC;
    public TextView SexoPC;
    public TextView DireccionPC;
    public TextView EmailPC;
    public TextView TelefonoPC;
    public TextView OcupacionPC;
    public TextView EstaturaPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        setPersonasPC();
    }

    private void setPersonasPC(){
        PersonaPC =findViewById(R.id.imageViewPC);
        BotonPC =findViewById(R.id.ButtonPC);
        NombrePC =findViewById(R.id.NomPC);
        ApellidoPC =findViewById(R.id.ApellPC);
        EdadPC =findViewById(R.id.EdadPC);
        SexoPC =findViewById(R.id.SexPC);
        DireccionPC =findViewById(R.id.DirPC);
        EmailPC =findViewById(R.id.EmailP);
        TelefonoPC =findViewById(R.id.CelPC);
        OcupacionPC =findViewById(R.id.OcupPC);
        EstaturaPC =findViewById(R.id.EstatPC);

    }

}