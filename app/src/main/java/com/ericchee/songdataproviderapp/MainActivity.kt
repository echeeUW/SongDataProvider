package com.ericchee.songdataproviderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ericchee.songdataprovider.Song
import com.ericchee.songdataprovider.SongDataProvider
import com.ericchee.songdataproviderapp.databinding.ActivityMainBinding
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }

        val allSongs: List<Song> = SongDataProvider.getAllSongs()

        val firstSong: Song = allSongs[1]
        val artistName: String = firstSong.artist

        val thrillerSong: Song = SongDataProvider.createSong("Thriller", "Michael Jackson")

        allSongs.find { it.title.contains("Mask") }?.let {
            binding.ivArt.setImageResource(it.smallImageID)
        }

        val gson = Gson().newBuilder()
            .setPrettyPrinting()
            .create()
        val allSongsJson = gson.toJson(allSongs)

        Log.i("echee", allSongsJson)
    }
}
