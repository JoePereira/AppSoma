package br.com.appsoma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNum1 = findViewById<EditText>(R.id.editTextFirstNum)
        val textNum2 = findViewById<EditText>(R.id.editTextSecondNum)
        val buttonSomar = findViewById<Button>(R.id.buttonSomar)

        buttonSomar.setOnClickListener{
            if(camposValidos()){
                val n1 = textNum1.text.toString().toDouble()
                val n2 = textNum2.text.toString().toDouble()
                val soma = soma(n1, n2)
                val intentResult = Intent(this, ResultActivity::class.java)
                intentResult.putExtra("n1", n1)
                intentResult.putExtra("n2", n2)
                intentResult.putExtra("Resultado", soma)
                startActivity(intentResult)
            }
        }
    }

    fun camposValidos(): Boolean{
        var msg = ""
        val textNum1 = findViewById<EditText>(R.id.editTextFirstNum)
        val textNum2 = findViewById<EditText>(R.id.editTextSecondNum)
        if(textNum1.text.trim().isEmpty()){
            msg = "Informe o primeiro número"
        }
        else if(textNum2.text.trim().isEmpty()){
            msg = "Informe o segundo número"
        }
        else{
            return true
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return false
    }

    fun soma(n1:Double, n2:Double): Double{
        return n1 + n2
    }
}