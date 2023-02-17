package my.edu.tarc.hellocaiwen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance Name : Type
//intCount: Integer

class MainActivity : AppCompatActivity() {

    //OnCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //load UI to memory
        //R refer to resources
        setContentView(R.layout.activity_main)
        //All the code must write after contentView

        //Declare  variable. val = value, var = variable
        //val is the value that cannot change, consider as a constant
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        //Alternative ways to declare variable.
        val buttonShow = findViewById<Button>(R.id.buttonShow)
        val buttonHide = findViewById<Button>(R.id.buttonHide)


        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }




    }

    fun show(){
        var text = findViewById<TextView>(R.id.textViewName)
        text.visibility = View.VISIBLE

    }

    fun hide(){
        var text = findViewById<TextView>(R.id.textViewName)
        text.visibility = View.INVISIBLE
    }
}