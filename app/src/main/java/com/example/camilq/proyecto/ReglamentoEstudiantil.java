package com.example.camilq.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReglamentoEstudiantil extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamento_estudiantil);
        webView = (WebView)findViewById(R.id.ReglamentoEstudiantil);
        webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
    }
}
