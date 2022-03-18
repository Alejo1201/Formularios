package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductosC extends AppCompatActivity {

    public ImageView ProductoPRC;
    public Button BotonPRC;
    public TextView MarcaPRC;
    public TextView PantallaPRC;
    public TextView RAMPRC;
    public TextView MemoriaIPRC;
    public TextView ColorPRC;
    public TextView CamaraPRC;
    public TextView ProcesadorPRC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_c);
        setProductsPRC();
    }

    private void setProductsPRC(){
        ProductoPRC =findViewById(R.id.imageViewPRC);
        BotonPRC =findViewById(R.id.ButtonPRC);
        MarcaPRC =findViewById(R.id.MarPRC);
        PantallaPRC =findViewById(R.id.PantPRC);
        RAMPRC =findViewById(R.id.RamPRC);
        MemoriaIPRC =findViewById(R.id.MemIPRC);
        ColorPRC =findViewById(R.id.ColPRC);
        CamaraPRC =findViewById(R.id.CamaraPRC);
        ProcesadorPRC =findViewById(R.id.ProcPRC);
    }
}