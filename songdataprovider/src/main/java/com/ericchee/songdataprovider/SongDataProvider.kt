package com.ericchee.songdataprovider

import kotlin.random.Random

class SongDataProvider {
    companion object {
        fun getAllSongs(): List<Song> = mutableListOf<Song>().apply {
            add(
                createSong(
                    "In The End",
                    "Linkin Park",
                    smallImageID = R.drawable.intheend_small,
                    largeImageID = R.drawable.intheend
                )
            )
            add(
                createSong(
                    "Mask Definitely On",
                    "Future",
                    smallImageID = R.drawable.maskoff_small,
                    largeImageID = R.drawable.maskoff
                )
            )
            add(
                createSong(
                    "Can't Touch This",
                    "MC Hammer",
                    smallImageID = R.drawable.canttouchthis_small,
                    largeImageID = R.drawable.canttouchthis
                )
            )
            add(
                createSong(
                    "Stay With Me",
                    "Sam Smith",
                    smallImageID = R.drawable.staywithme_small,
                    largeImageID = R.drawable.staywithme
                )
            )
            add(
                createSong(
                    "Yummy",
                    "Justin Bieber",
                    smallImageID = R.drawable.yummy_small,
                    largeImageID = R.drawable.yummy
                )
            )
            add(
                createSong(
                    "Ddu-du Ddu-du",
                    "Black Pink",
                    smallImageID = R.drawable.ddududdudu_small,
                    largeImageID = R.drawable.ddududdudu
                )
            )
            add(
                createSong(
                    "Look What You Made Me Do",
                    "Taylor Swift",
                    smallImageID = R.drawable.lookwhatyoumademedo_small,
                    largeImageID = R.drawable.lookwhatyoumademedo
                )
            )
            add(
                createSong(
                    "Old Town Road",
                    "Lil Nas X",
                    smallImageID = R.drawable.oldtownroad_small,
                    largeImageID = R.drawable.oldtownroad
                )
            )
            add(
                createSong(
                    "Memories",
                    "Maroon 5",
                    smallImageID = R.drawable.memories_small,
                    largeImageID = R.drawable.memories
                )
            )
            add(
                createSong(
                    "Don't Start Now",
                    "Dua Lipa",
                    smallImageID = R.drawable.dontstartnow_small,
                    largeImageID = R.drawable.dontstartnow
                )
            )
            add(
                createSong(
                    "Before You Go",
                    "Lewis Capaldi",
                    smallImageID = R.drawable.beforeyougo_small,
                    largeImageID = R.drawable.beforeyougo
                )
            )
            add(
                createSong(
                    "O.G.",
                    "TroyBoi",
                    smallImageID = R.drawable.og_large_small,
                    largeImageID = R.drawable.og_large
                )
            )
            add(
                createSong(
                    "Someone You Loved",
                    "Lewis Capaldi",
                    smallImageID = R.drawable.someoneyouloved_small,
                    largeImageID = R.drawable.someoneyouloved
                )
            )
            add(
                createSong(
                    "Lucky You",
                    "Eminem feat. Joyner Lucas",
                    smallImageID = R.drawable.luckyyou_small,
                    largeImageID = R.drawable.luckyyou
                )
            )
            add(
                createSong(
                    "Crazy In Love",
                    "Beyonce feat. Jay-Z",
                    smallImageID = R.drawable.crazyinlove_small,
                    largeImageID = R.drawable.crazyinlove
                )
            )
            add(
                createSong(
                    "In The Name Of Love",
                    "Martin Garrix feat. Bebe Rexha",
                    smallImageID = R.drawable.inthenameoflove_small,
                    largeImageID = R.drawable.inthenameoflove
                )
            )
            add(
                createSong(
                    "Rewrite The Stars",
                    "Zac Efron & Zendaya",
                    smallImageID = R.drawable.rewritethestars_small,
                    largeImageID = R.drawable.rewritethestars
                )
            )
            add(
                createSong(
                    "I'm On A Boat",
                    "The Lonely Island feat. T-Pain",
                    smallImageID = R.drawable.imonaboat_small,
                    largeImageID = R.drawable.imonaboat
                )
            )
            add(
                createSong(
                    "Despacito (Remix)",
                    "Luis Fonsi feat. Daddy Yankee & Justin Bieber",
                    smallImageID = R.drawable.despacito_small,
                    largeImageID = R.drawable.despacito
                )
            )
            add(
                createSong(
                    "Like A G6",
                    "Far East Movement feat. The Cataracs & DEV",
                    smallImageID = R.drawable.likeag6_small,
                    largeImageID = R.drawable.likeag6
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
            ),
            smallImageID: Int = R.drawable.unknown_small,
            largeImageID: Int = R.drawable.unknown
        ): Song {
            return Song(
                id,
                title,
                artist,
                durationMillis,
                smallImageID,
                largeImageID
            )
        }

        fun createRandomSong(): Song {
            val title = "Untitled ${System.currentTimeMillis()}"
            val artist = "Unknown ${System.currentTimeMillis()}"
            return Song(
                "${System.currentTimeMillis()}$title:$artist",
                title,
                artist,
                Random.nextLong(
                    60000,
                    300000
                ),
                R.drawable.unknown_small,
                R.drawable.unknown
            )
        }
    }
}