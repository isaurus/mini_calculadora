package com.example.minicalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declaración de TextView
    private TextView txtResultado;

    // Declaración de Button numéricos
    private Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero, btnPunto;

    // Declaración de Button para operaciones
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRoot, btnInverso, btnConmutar, btnIgual, btnBorrar;

    // Declaración de String para añadir a la cadena los números marcados
    private String cadenaResultado;

    // Declaración de Float para almacenar el resultado de las operaciones
    private float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadenaResultado = "";

        // Vinculación de TextView a XML
        txtResultado = findViewById(R.id.txtResultado);

        // Vinculación de Button (numéricos) a XML
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnCero = findViewById(R.id.btnCero);
        btnPunto = findViewById(R.id.btnPunto);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnRoot = findViewById(R.id.btnRaizCuadrada);
        btnInverso = findViewById(R.id.btnInverso);
        btnConmutar = findViewById(R.id.btnConmutar);
        btnIgual = findViewById(R.id.btnIgual);
        btnBorrar = findViewById(R.id.btnBorrar);

        // Vinculación de Button (operaciones) a XML
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnRoot = findViewById(R.id.btnRaizCuadrada);
        btnInverso = findViewById(R.id.btnInverso);
        btnConmutar = findViewById(R.id.btnConmutar);

        // Listener(s) de Button numéricos
        btnUno.setOnClickListener(this::addNumberTest);
        btnUno.setOnClickListener(this::addNumberTest);
        btnDos.setOnClickListener(this::addNumberTest);
        btnTres.setOnClickListener(this::addNumberTest);
        btnCuatro.setOnClickListener(this::addNumberTest);
        btnCinco.setOnClickListener(this::addNumberTest);
        btnSeis.setOnClickListener(this::addNumberTest);
        btnSiete.setOnClickListener(this::addNumberTest);
        btnOcho.setOnClickListener(this::addNumberTest);
        btnNueve.setOnClickListener(this::addNumberTest);
        btnCero.setOnClickListener(this::addNumberTest);

        // Listener(s) de Button para operaciones
        /*btnSumar.setOnClickListener(v -> sumar());
        btnRestar.setOnClickListener(v -> restar());
        btnMultiplicar.setOnClickListener(v -> multiplicar());
        btnDividir.setOnClickListener(v -> dividir());
        btnRoot.setOnClickListener(v -> raizCuadrada());
        btnInverso.setOnClickListener(v -> inverso());
        btnConmutar.setOnClickListener(v -> conmutar());

        btnIgual.setOnClickListener(v -> calcularResultado());
        btnBorrar.setOnClickListener(v -> borrarTodo());

         */


        btnBorrar.setOnClickListener(v -> deleteAll());
    }

    /**
     * Método de prueba para:
     *  - Añadir a la lista el valor (String) del Button pulsado
     *  - Uso de formatNumberTest() para formatear el String para mostrarlo como si fuera un valor
     *  - Imprimir en el TextView la cadena
     *
     * @param v La View que recibe en el Listener
     */
    protected void addNumberTest(View v){
        Button btn = (Button) v;
        String btnValue = btn.getText().toString();

        cadenaResultado += btnValue;
        txtResultado.setText(formatNumberTest(cadenaResultado));
    }

    /**
     * Método de prueba para:
     *  - Formatea la cadena de texto para asemejarse a un valor numérico
     *
     * @param number La cadena a formatear
     *
     * @return La cadena formateada
     */
    protected String formatNumberTest(String number){
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");

        Float parsedValue = Float.parseFloat(number);
        return decimalFormat.format(parsedValue);
    }

    /**
     * Método de prueba para:
     *  - Sumar los valores
     */
    protected void addTest(){
        Float parsedValue = Float.parseFloat(cadenaResultado);
        deleteAll();
    }

    protected void deleteAll(){
        cadenaResultado = "";
        txtResultado.setText(cadenaResultado);
    }
}