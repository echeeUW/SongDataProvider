package com.ericchee.songdataproviderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ericchee.songdataprovider.Song
import com.ericchee.songdataprovider.SongDataProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val allSongs: List<Song> = SongDataProvider.getAllSongs()

        val firstSong: Song = allSongs[1]
        val artistName: String = firstSong.artist

        val thrillerSong: Song = SongDataProvider.createSong("Thriller", "Michael Jackson")

        allSongs.find { it.title.contains("G6") }?.let {
            ivArt.setImageResource(it.largeImageID)
        }
    }
}
