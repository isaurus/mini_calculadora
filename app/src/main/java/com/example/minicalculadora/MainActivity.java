package com.example.minicalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // Declaración de TextView
    private TextView txtResultado;

    // Declaración de Button numéricos
    private Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero, btnPunto;

    // Declaración de Button para operaciones
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnRoot, btnInverso, btnConmutar, btnIgual, btnBorrar;

    // Declaración de String para añadir a la cadena los números marcados
    private String cadenaResultado;

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
        btnUno.setOnClickListener(v -> addNumber(btnUno));
        btnDos.setOnClickListener(v -> addNumber(btnDos));
        btnTres.setOnClickListener(v -> addNumber(btnTres));
        btnCuatro.setOnClickListener(v -> addNumber(btnCuatro));
        btnCinco.setOnClickListener(v -> addNumber(btnCinco));
        btnSeis.setOnClickListener(v -> addNumber(btnSeis));
        btnSiete.setOnClickListener(v -> addNumber(btnSiete));
        btnOcho.setOnClickListener(v -> addNumber(btnOcho));
        btnNueve.setOnClickListener(v -> addNumber(btnNueve));
        btnCero.setOnClickListener(v -> addNumber(btnCero));

        // Listener(s) de Button para operaciones
        btnSumar.setOnClickListener(v -> sumar());
        btnRestar.setOnClickListener(v -> restar());
        btnMultiplicar.setOnClickListener(v -> multiplicar());
        btnDividir.setOnClickListener(v -> dividir());
        btnRoot.setOnClickListener(v -> raizCuadrada());
        btnInverso.setOnClickListener(v -> inverso());
        btnConmutar.setOnClickListener(v -> conmutar());

        btnIgual.setOnClickListener(v -> calcularResultado());
        btnBorrar.setOnClickListener(v -> borrarTodo());

    }

    // Método para crear la cadena de números
    protected void addNumber(Button v){
        cadenaResultado += v.getText().toString();
        String cadenaFormateada = formatNumber(cadenaResultado);
        txtResultado.setText(cadenaFormateada);
    }

    // Método para formatear la cadena de números
    protected String formatNumber(String numero){
        try {
            long valorParseado = Long.parseLong(numero);
            return NumberFormat.getInstance(Locale.ENGLISH).format(valorParseado);
        } catch(NumberFormatException e){
            return numero;
        }
    }

    // Método para sumar


}