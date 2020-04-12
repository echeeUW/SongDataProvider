package com.ericchee.songdataprovider

import kotlin.random.Random

class SongDataProvider {
    companion object {
        fun getAllSongs(): List<Song> = mutableListOf<Song>().apply {
            add(
                createSong(
                    "In The End",
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
                    "Somebody You LoveD",
                    "Lewis Capaldi"
                )
            )
            add(
                createSong(
                    "Lucky You",
                    "Eminem feat. Joyner Lucas"
                )
            )
            add(
                createSong(
                    "Crazy In Love",
                    "Beyonce feat. Jay-Z"
                )
            )
            add(
                createSong(
                    "In The Name Of Love",
                    "Martin Garrix feat. Bebe Rexha"
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
                    "Rewrite The Stars",
                    "Zac Efron & Zendaya"
                )
            )
            add(
                createSong(
                    "I'm On A Boat",
                    "The Lonely Island"
                )
            )
            add(
                createSong(
                    "Despacito (Remix)",
                    "Luis Fonsi feat. Daddy Yankee & Justin Bieber"
                )
            )
            add(
                createSong(
                    "Like A G6",
                    "Far East Movement feat. The Cataracs & DEV"
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