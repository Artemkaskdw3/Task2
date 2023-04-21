    package com.example.testkursjava;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


        }

        public void exponentiationBtn(View view){
            TextView answer = findViewById(R.id.answer);
            EditText number1 = findViewById(R.id.numberExponentiation);
            EditText number2 = findViewById(R.id.exponentiation);
            float num1 = Float.parseFloat(number1.getText().toString());
            float num2 = Float.parseFloat(number2.getText().toString());
            float result = 1;
            for(int i = 0; i < num2; i++){
                result = num1 * result;
            }
            answer.setText("Ответ:");
            answer.setText(answer.getText() + String.valueOf(result));


        }
    }