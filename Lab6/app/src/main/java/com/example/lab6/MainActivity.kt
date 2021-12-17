package com.example.lab6

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var name: String = "неопределенно"
    var textViewTexKey: String = "TEXT_VIEW"
    var nameVariableKey: String = "NAME_VAR"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(nameVariableKey, name)
        val nameView = findViewById<TextView>(R.id.saveTextView) as TextView
        outState.putString(textViewTexKey, nameView.text.toString())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        name = savedInstanceState.getString(nameVariableKey).toString()
        var textViewText: String? = savedInstanceState.getString(textViewTexKey)
        val nameView = findViewById<TextView>(R.id.saveTextView) as TextView
        nameView.text = textViewText
    }


    fun restoreField(view: View) {
        val nameView = findViewById<TextView>(R.id.saveTextView) as TextView
        nameView.text = name
    }
    fun saveField(view: View) {
        val nameBox = findViewById<TextView>(R.id.editTextTextMultiLine) as TextView
        name = nameBox.text.toString()
    }
}