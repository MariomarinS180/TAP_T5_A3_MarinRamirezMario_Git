package com.example.aplicacionandroid_calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText capturador;
    private double operacion1, operacion2, resultado;
    int operario;
    String guardar = capturador.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        capturador = (EditText)findViewById(R.id.caja_operador);
    }
    public void btn1(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "1";
        capturador.setText(guardar);
    }
    public void btn_dos(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "2";
        capturador.setText(guardar);
    }
    public void btn_tres(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "3";
        capturador.setText(guardar);
    }
    public void btn_cuatro(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "4";
        capturador.setText(guardar);
    }
    public void btn_cinco(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "5";
        capturador.setText(guardar);
    }
    public void btn_seis(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "6";
        capturador.setText(guardar);
    }
    public void btn_siete(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "7";
        capturador.setText(guardar);
    }
    public void btn_ocho(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "8";
        capturador.setText(guardar);
    }
    public void btn_nueve(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "9";
        capturador.setText(guardar);
    }
    public void btn_cero(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + "0";
        capturador.setText(guardar);
    }
    public void btn_punto(View v){
        String guardar = capturador.getText().toString();
        guardar = guardar + ".";
        capturador.setText(guardar);
    }
    public void suma (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("");
        operario = 1;
    }
    public void resta (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("");
        operario = 2;
    }
    public void multiplicacion (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("");
        operario = 3;
    }
    public void division (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("");
        operario = 4;
    }
    public void raiz (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("√(" + operacion1+")");
        operario = 5;
    }
    public void porcentual (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("%" + operacion1);
        operario = 6;
    }
    public void alCuadrado(View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText(operacion1+"^2");
        operario = 7;
    }
    public void unoSobreX (View v){
        try {
            String aux = capturador.getText().toString();
            operacion1 = Double.parseDouble(aux);
        }catch (NumberFormatException n1){ }
        capturador.setText("1/"+ operacion1);
        operario = 8;
    }
    public void C (View v){
        capturador.setText("");
        operacion1=0.0;
        operacion2=0.0;
        resultado=0.0;
    }
    public void CE(View v){
        capturador.setText("");
    }
    public void borrar(View v){
        if (!capturador.getText().toString().equals("")){
            capturador.setText(capturador.getText().subSequence(0,capturador.getText().length()-1)+"");
        }
    }
    public void igual (View v){
        try {
            String aux2 = capturador.getText().toString();
            operacion2 = Double.parseDouble(aux2);
        }catch (NumberFormatException n1){ }
        capturador.setText("");
        if(operario == 1){
            resultado = operacion1 + operacion2;
        }else if(operario == 2){
            resultado = operacion1 - operacion2;
        }else if ( operario == 3){
            resultado = operacion1 * operacion2;
        }else if( operario == 4){
            if(operacion2 == 0){
                capturador.setText("Error");
            }else{
                resultado = operacion1 / operacion2;
            }
        }else if(operario == 5){
            resultado = operacion2  * (operacion1/100);
        }else if(operario == 6){
            resultado = operacion1%operacion2;
        }else if (operario == 7){
            resultado = Math.pow(operacion1, 2);
        }else if (operario == 8){
            resultado = 1/operario;
        }
        capturador.setText(""+resultado);
        operacion1 = resultado;
    }//Metodo igual
    public void off (View v){
        finish();
    }
}