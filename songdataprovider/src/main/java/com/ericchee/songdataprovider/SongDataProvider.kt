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
            // region Student songs

            add(
                createSong(
                    "La La Land (feat. YG)",
                    "Bryce Vine, YG",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "A Way To Say Goodbye",
                    "Seven Lions, Sombear",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )
            add(
                createSong(
                    "One Call Away",
                    "Charlie Puth",
                    smallImageID = R.drawable.unknown_color_3,
                    largeImageID = R.drawable.unknown_color_3
                )
            )
            add(
                createSong(
                    "Time",
                    "Pink Floyd",
                    smallImageID = R.drawable.unknown_color_4,
                    largeImageID = R.drawable.unknown_color_4
                )
            )
            add(
                createSong(
                    "Everglow",
                    "Coldplay",
                    smallImageID = R.drawable.unknown_color_5,
                    largeImageID = R.drawable.unknown_color_5
                )
            )
            add(
                createSong(
                    "Self Control",
                    "Frank Ocean",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "Daisuke",
                    "El Huervo",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )
            add(
                createSong(
                    "Luck",
                    "American Authors",
                    smallImageID = R.drawable.unknown_color_3,
                    largeImageID = R.drawable.unknown_color_3
                )
            )
            add(
                createSong(
                    "Dark Souls 3",
                    "Yuka Kitamura",
                    smallImageID = R.drawable.unknown_color_4,
                    largeImageID = R.drawable.unknown_color_4
                )
            )
            add(
                createSong(
                    "Sleep On The Floor",
                    "The Lumineers",
                    smallImageID = R.drawable.unknown_color_5,
                    largeImageID = R.drawable.unknown_color_5
                )
            )
            add(
                createSong(
                    "Nancy Mulligan",
                    "Ed Sheeran",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "Takeaway",
                    "The Chainsmokers, ILLENIUM, Lennon Stella",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )
            add(
                createSong(
                    "Astronomia",
                    "Vicetone, Tony Igy",
                    smallImageID = R.drawable.unknown_color_3,
                    largeImageID = R.drawable.unknown_color_3
                )
            )
            add(
                createSong(
                    "Rush Over Me",
                    "Seven Lions, ILLENIUM, Said the Sky, HALIENE",
                    smallImageID = R.drawable.unknown_color_4,
                    largeImageID = R.drawable.unknown_color_4
                )
            )
            add(
                createSong(
                    "Got The Guap (feat. Young Thug)",
                    "Lil Uzi Vert, Young Thug",
                    smallImageID = R.drawable.unknown_color_5,
                    largeImageID = R.drawable.unknown_color_5
                )
            )
            add(
                createSong(
                    "Sad Songs (& Said The Sky with Annika Wells)",
                    "ILLENIUM, Said the Sky, Annika Wells",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "Snow Angels",
                    "Anamanaguchi",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )
            add(
                createSong(
                    "Nights",
                    "Frank Ocean",
                    smallImageID = R.drawable.unknown_color_3,
                    largeImageID = R.drawable.unknown_color_3
                )
            )
            add(
                createSong(
                    "GIANTS",
                    "True Damage, Becky G, Keke Palmer, SOYEON of (G)I-DLE, Duckwrth, Thutmose, League of Legends",
                    smallImageID = R.drawable.unknown_color_4,
                    largeImageID = R.drawable.unknown_color_4
                )
            )
            add(
                createSong(
                    "Nobody Knows",
                    "Russ",
                    smallImageID = R.drawable.unknown_color_5,
                    largeImageID = R.drawable.unknown_color_5
                )
            )
            add(
                createSong(
                    "Thought Contagion",
                    "Muse",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "Lemon",
                    "Kenshi Yonezu",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )
            add(
                createSong(
                    "Warriors",
                    "League of Legends, 2WEI, Edda Hayes",
                    smallImageID = R.drawable.unknown_color_3,
                    largeImageID = R.drawable.unknown_color_3
                )
            )
            add(
                createSong(
                    "It's Something to Be Alive",
                    "DREAMERS",
                    smallImageID = R.drawable.unknown_color_4,
                    largeImageID = R.drawable.unknown_color_4
                )
            )
            add(
                createSong(
                    "明月天涯",
                    "五音JW",
                    smallImageID = R.drawable.unknown_color_5,
                    largeImageID = R.drawable.unknown_color_5
                )
            )
            add(
                createSong(
                    "Cadillactica",
                    "BIG K.R.I.T.",
                    smallImageID = R.drawable.unknown_color_1,
                    largeImageID = R.drawable.unknown_color_1
                )
            )
            add(
                createSong(
                    "God's Plan",
                    "Drake",
                    smallImageID = R.drawable.unknown_color_2,
                    largeImageID = R.drawable.unknown_color_2
                )
            )

            // endregion Student songs
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