package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Vehiculos extends AppCompatActivity {

    public ImageView Vehiculo;
    public Button BotonV;
    public TextView MarcaV;
    public TextView PlacaV;
    public TextView ModeloV;
    public TextView LineaV;
    public TextView ColorV;
    public TextView CarroceriaV;
    public TextView ServicioV;
    public TextView NoMotorV;
    public TextView NoChasisV;
    public TextView ClaseV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculos);
        setVehiculos();
    }

    private void setVehiculos(){
        Vehiculo =findViewById(R.id.imageViewV);
        BotonV =findViewById(R.id.GuardarV);
        MarcaV =findViewById(R.id.MarcaV);
        PlacaV =findViewById(R.id.PlacaV);
        ModeloV =findViewById(R.id.ModelV);
        LineaV =findViewById(R.id.LineaV);
        ColorV =findViewById(R.id.ColoV);
        CarroceriaV =findViewById(R.id.CarV);
        ServicioV =findViewById(R.id.ServicioV);
        NoMotorV =findViewById(R.id.MotorV);
        NoChasisV =findViewById(R.id.ChasisV);
        ClaseV =findViewById(R.id.ClasV);
    }
}