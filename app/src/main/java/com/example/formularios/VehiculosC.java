package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class VehiculosC extends AppCompatActivity {

    public ImageView VehiculoVR;
    public Button BotonVR;
    public TextView MarcaVR;
    public TextView PlacaVR;
    public TextView ModeloVR;
    public TextView LineaVR;
    public TextView ColorVR;
    public TextView CarroceriaVR;
    public TextView ServicioVR;
    public TextView NoMotorVR;
    public TextView NoChasisVR;
    public TextView ClaseVR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehiculos_c);
        setVehiculosVR();
    }

    private void setVehiculosVR(){
        VehiculoVR =findViewById(R.id.imageViewVR);
        BotonVR =findViewById(R.id.GuardarVR);
        MarcaVR =findViewById(R.id.MarcaVR);
        PlacaVR =findViewById(R.id.PlacaVR);
        ModeloVR =findViewById(R.id.ModelVR);
        LineaVR =findViewById(R.id.LineaVR);
        ColorVR =findViewById(R.id.ColoVR);
        CarroceriaVR =findViewById(R.id.CarVR);
        ServicioVR =findViewById(R.id.ServicioVR);
        NoMotorVR =findViewById(R.id.MotorVR);
        NoChasisVR =findViewById(R.id.ChasisVR);
        ClaseVR =findViewById(R.id.ClasVR);
    }
}