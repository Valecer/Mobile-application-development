package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment.getExternalStorageDirectory
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.*








class MainActivity : AppCompatActivity() {
    var FILE_NAME: String = "content.txt"
    //var file = File(getExternalStorageDirectory().absolutePath,fileName)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonSave(view: View?) {
        var fos: FileOutputStream? = null
        try {
            val textBox = findViewById<View>(R.id.editTextMultiLine) as EditText
            val text = textBox.text.toString()
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE)
            fos.write(text.toByteArray())
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show()
        } catch (ex: IOException) {
            Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
        } finally {
            try {
                fos?.close()
            } catch (ex: IOException) {
                Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun buttonOpen(view: View?) {
        var fin: FileInputStream? = null
        val textView = findViewById<View>(R.id.textView) as TextView
        try {
            fin = openFileInput(FILE_NAME)
            val bytes = ByteArray(fin.available())
            fin.read(bytes)
            val text = String(bytes)
            textView.text = text
        } catch (ex: IOException) {
            Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
        } finally {
            try {
                fin?.close()
            } catch (ex: IOException) {
                Toast.makeText(this, ex.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

//    fun buttonSaveClick(view: View) {
//        try {
//            val textBox = findViewById<EditText>(R.id.save_text) as EditText
//            var text: String = textBox.text.toString()
//            var fos = FileOutputStream(file)
//            fos.write(text.getBytes())
//            fos.close
//            Toast.makeText(this, "Текстовый файл успешно сохранён!", Toast.LENGTH_SHORT).show()
//        } catch (e: FileNotFoundException) {
//            e.printStackTrace()
//            Toast.makeText(this, "Файл не найден", Toast.LENGTH_SHORT).show()
//        } catch (e: IOException) {
//            e.printStackTrace()
//            Toast.makeText(this, "Ошибка созранения файла", Toast.LENGTH_SHORT).show()
//        }
//    }
//    fun buttonOpenClick(view: View) {
//        try {
//            val fin = FileInputStream(file)
//            var bytes: Array<Byte> = Array<Byte>(fin.available())
//            fin.read(bytes)
//            var text: String = String(bytes)
//            var textView = findViewById<TextView>(R.id.open_text) as TextView
//            textView.text = text
//            fin.close()
//        } catch (ex: IOException) {
//            Toast.makeText(this, ex.message,Toast.LENGTH_SHORT).show()
//        }
//    }

}