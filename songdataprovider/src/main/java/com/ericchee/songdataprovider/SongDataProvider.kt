package com.ericchee.songdataprovider

import kotlin.random.Random

class SongDataProvider {
    companion object {
        fun getAllSongs(): List<Song> = mutableListOf<Song>().apply {
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "Mask Definitely On",
                    "Future"
                )
            )
            add(
                createSong(
                    "Can't Touch This",
                    "MC Hammer"
                )
            )
            add(
                createSong(
                    "Stay With Me",
                    "Sam Smith"
                )
            )
            add(
                createSong(
                    "Yummy",
                    "Justin Bieber"
                )
            )
            add(
                createSong(
                    "Ddu-du Ddu-du",
                    "Black Pink"
                )
            )
            add(
                createSong(
                    "Look What You Made Me Do",
                    "Taylor Swift"
                )
            )
            add(
                createSong(
                    "Old Town Road",
                    "Lil Nas X"
                )
            )
            add(
                createSong(
                    "Memories",
                    "Maroon 5"
                )
            )
            add(
                createSong(
                    "Don't Start Now",
                    "Dua Lipa"
                )
            )
            add(
                createSong(
                    "Before You Go",
                    "Lewis Capaldi"
                )
            )
            add(
                createSong(
                    "O.G.",
                    "TroyBoi"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
            add(
                createSong(
                    "In the End",
                    "Linkin Park"
                )
            )
        }

        fun createSong(
            title: String,
            artist: String,
            id: String = "${System.currentTimeMillis()}$title:$artist",
            durationMillis: Long = Random.nextLong(
                60000,
                300000
            )
        ): Song {
            return Song(
                id,
                title,
                artist,
                durationMillis
            )
        }
    }
}