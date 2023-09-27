package br.com.appsoma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val n1 = intent.getDoubleExtra("n1", 0.0)
        val n2 = intent.getDoubleExtra("n2", 0.0)
        val soma = intent.getDoubleExtra("Resultado", 0.0)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = "$n1 + $n2 = $soma"

        //Para mostrar o resultado em um Toast basta usar as linhas abaixo
//        val toastResult = "$n1 + $n2 = $soma"
//        Toast.makeText(this, toastResult, Toast.LENGTH_LONG).show()

    }
}