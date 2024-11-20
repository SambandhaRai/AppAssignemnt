package com.example.testapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class AssignmentActvity : AppCompatActivity() {

    lateinit var fn: TextInputLayout
    lateinit var ln: TextInputLayout
    lateinit var email: TextInputLayout
    lateinit var pw: TextInputLayout
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_assignment_actvity)

        fn = findViewById(R.id.fname)
        ln = findViewById(R.id.lname)
        email = findViewById(R.id.email)
        pw = findViewById(R.id.password)
        btn = findViewById(R.id.signButton)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}