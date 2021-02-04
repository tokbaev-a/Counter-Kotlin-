package knigh4ttk.application.conterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun incrementCounter(view: View) {
        counter.increment()
        val counterText: TextView = findViewById(R.id.score)
        var str = String()
        when (counter.value.toString ().length) {
            1 -> str += "000"
            2 -> str += "00"
            3 -> str += "0"
        }
        counterText.text = str + counter.value.toString ()
    }
}

class Counter {
    var value: Int = 0

    fun increment() {
        value ++
    }
}
