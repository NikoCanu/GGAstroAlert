package com.example.ggastroalert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nome = findViewById(R.id.nome);
        TextView ip = findViewById(R.id.ip);
        TextView port = findViewById(R.id.port);


        findViewById(R.id.collegati).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dispositivo d = new Dispositivo(nome.getText().toString(), ip.getText().toString(), port.getText().toString());
                new SendMessage().execute("ciao",d.getIp(),d.getPort());
            }
        });
    }
}