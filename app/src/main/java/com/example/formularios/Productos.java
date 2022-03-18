package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Productos extends AppCompatActivity {

    public ImageView Producto;
    public Button BotonPR;
    public TextView MarcaPR;
    public TextView PantallaPR;
    public TextView RAMPR;
    public TextView MemoriaIPR;
    public TextView ColorPR;
    public TextView CamaraPR;
    public TextView ProcesadorPR;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        setProducts();
    }

    private void setProducts(){
        Producto =findViewById(R.id.imageViewPR);
        BotonPR =findViewById(R.id.ButtonPR);
        MarcaPR =findViewById(R.id.MarPR);
        PantallaPR =findViewById(R.id.PantaPR);
        RAMPR =findViewById(R.id.RamPR);
        MemoriaIPR =findViewById(R.id.MemoIPR);
        ColorPR =findViewById(R.id.ColPR);
        CamaraPR =findViewById(R.id.CamPR);
        ProcesadorPR =findViewById(R.id.ProcePR);
    }
}