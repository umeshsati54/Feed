package com.usati.feed

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.usati.feed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var feedList = ArrayList<Feed>()
    private lateinit var binding: ActivityMainBinding
    lateinit var feedAdapter: FeedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        feedList.add(
            Feed(
                R.drawable.profile,
                "Umesh Sati",
                299,
                "This is the caption of this beautiful image.This is the caption of this beautiful image.",
                R.drawable.post_img
            )
        )
        feedList.add(
            Feed(
                R.drawable.profile,
                "Umesh Sati",
                299,
                "This is the caption of this beautiful image.This is the caption of this beautiful image.",
                R.drawable.post_img
            )
        )
        feedList.add(
            Feed(
                R.drawable.profile,
                "Umesh Sati",
                299,
                "This is the caption of this beautiful image.This is the caption of this beautiful image.",
                R.drawable.post_img
            )
        )
        feedList.add(
            Feed(
                R.drawable.profile,
                "Umesh Sati",
                299,
                "This is the caption of this beautiful image.This is the caption of this beautiful image.",
                R.drawable.post_img
            )
        )

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        feedAdapter = FeedAdapter(feedList)
        binding.rv.apply {
            adapter = feedAdapter
            layoutManager = LinearLayoutManager(binding.rv.context)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == R.id.action_search) {
            true
        } else super.onOptionsItemSelected(item)
    }
}