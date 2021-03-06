# SongDataProvider

This library provides simple classes & functions to show basic Song data.

## Usage
To use this library, add this implementation line to your build.gradle (app) dependencies block:
```
dependencies {
    ...
    implementation("com.ericchee:songdataprovider:1.0.8@aar")
}
```

## Documentation

### Song
`Song` is a data model class that contains info about an individual song
```
data class Song(
    val id: String,
    val title: String,
    val artist: String,
    val durationMillis: Long,
    val smallImageID: Int,
    val largeImageID: Int
): Parcelable
```

`smallImageID` and `largeImageID` are drawable resource ID's. Use ImageView.setImageResource() to set drawable as imageView's source.

_Note: This class `Song` is Parcelable meaning it can be passed through Intents_


### SongDataProvider.getAllSongs()
Use `SongDataProvider.getAllSongs()` to get a list of Songs
```
val allSongs: List<Song> = SongDataProvider.getAllSongs()

val firstSong: Song = allSongs[1]
val artistName: String = firstSong.artist
```

### SongDataProvider.createRandomSong()
The method `createRandomSong()` can be used to create a quick song with generic song info.

```
val randomSong: Song = SongDataProvider.createRandomSong()
```

### SongDataProvider.createSong()
The method `createSong()` can be used to create a quick song where the ID, & duration will be auto generated for you

Definition:
```
fun createSong(
    title: String,
    artist: String,
    id: String = "${System.currentTimeMillis()}$title:$artist",
    durationMillis: Long = Random.nextLong(
        60000,
        300000
    )
): Song
```

Usage):
```
val thrillerSong: Song = SongDataProvider.createSong("Thriller", "Michael Jackson")
```
_Notice how a song id & duration are optional. They will be auto-generatoed upon creation_
