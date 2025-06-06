package com.example.textimagesearch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var searchEngine: ClipSearchEngine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchEngine = ClipSearchEngine(this)

        val queryText = findViewById<EditText>(R.id.queryText)
        val searchButton = findViewById<Button>(R.id.searchButton)
        val resultsView = findViewById<RecyclerView>(R.id.resultsView)

        searchButton.setOnClickListener {
            val query = queryText.text.toString()
            // Example search call
            val queryEmbedding = searchEngine.textToEmbedding(query)
            // TODO: iterate over device photos, compute embeddings once and reuse
            // TODO: compute similarity and display sorted results in RecyclerView
        }
    }
}
