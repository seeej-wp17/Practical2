package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun rollAction(){
        Toast.makeText(this, "This is toaster",
            Toast.LENGTH_SHORT).show()
         val rollbutton: Button = findViewById(R.id.roll_button);
            rollbutton.setOnClickListener{rollAction()};
    }

}
