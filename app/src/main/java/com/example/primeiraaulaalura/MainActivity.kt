package com.example.primeiraaulaalura

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Lista de alunos"

        //para criar uma lista mutavel
        val alunos: List<String> = mutableListOf("Larissa", "Ivania", "Pedro", "Miguel")
        val listaDeAlunos= findViewById<View>(R.id.list) as ListView
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, alunos)
        listaDeAlunos.adapter = adapter

    }
}