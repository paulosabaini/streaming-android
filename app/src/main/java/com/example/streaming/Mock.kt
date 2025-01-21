package com.example.streaming

fun getMockedVideos() = listOf(
    MediaOption(
        title = "Big Buck Bunny",
        subtitle = "By Blender Foundation",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/BigBuckBunny.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
    ),
    MediaOption(
        title = "Elephants Dream",
        subtitle = "By Blender Foundation",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ElephantsDream.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
    ),
    MediaOption(
        title = "For Bigger Blazes",
        subtitle = "By Google",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerBlazes.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"
    ),
    MediaOption(
        title = "For Bigger Escape",
        subtitle = "By Google",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerEscapes.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"
    ),
    MediaOption(
        title = "For Bigger Fun",
        subtitle = "By Google",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerFun.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4"
    ),
    MediaOption(
        title = "For Bigger Joyrides",
        subtitle = "By Google",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerJoyrides.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4"
    ),
    MediaOption(
        title = "For Bigger Meltdowns",
        subtitle = "By Google",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerMeltdowns.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4"
    ),
    MediaOption(
        title = "Sintel",
        subtitle = "By Blender Foundation",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/Sintel.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
    ),
    MediaOption(
        title = "Subaru Outback On Street And Dirt",
        subtitle = "By Garage419",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/SubaruOutbackOnStreetAndDirt.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4"
    ),
    MediaOption(
        title = "Tears of Steel",
        subtitle = "By Blender Foundation",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/TearsOfSteel.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4"
    ),
    MediaOption(
        title = "Volkswagen GTI Review",
        subtitle = "By Garage419",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/VolkswagenGTIReview.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/VolkswagenGTIReview.mp4"
    ),
    MediaOption(
        title = "We Are Going On Bullrun",
        subtitle = "By Garage419",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/WeAreGoingOnBullrun.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
    ),
    MediaOption(
        title = "What care can you get for a grand?",
        subtitle = "By Garage419",
        thumbnailUrl = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/WhatCarCanYouGetForAGrand.jpg",
        url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WhatCarCanYouGetForAGrand.mp4"
    )
)

fun getMockedAudios() = listOf(
    MediaOption(
        title = "Two Channel Audio - Long Sample",
        subtitle = "ff-16b-2c-44100hz.mp3",
        url = "https://dl.espressif.com/dl/audio/ff-16b-2c-44100hz.mp3"
    ),
    MediaOption(
        title = "Single Channel Audio - Long Sample",
        subtitle = "ff-16b-1c-44100hz.mp3",
        url = "https://dl.espressif.com/dl/audio/ff-16b-1c-44100hz.mp3"
    ),
    MediaOption(
        title = "Two Channel Audio - Short Sample",
        subtitle = "gs-16b-2c-44100hz.mp3",
        url = "https://dl.espressif.com/dl/audio/gs-16b-2c-44100hz.mp3"
    ),
    MediaOption(
        title = "Single Channel Audio - Short Sample",
        subtitle = "gs-16b-1c-44100hz.mp3",
        url = "https://dl.espressif.com/dl/audio/gs-16b-1c-44100hz.mp3"
    ),
    MediaOption(
        title = "Two Channel Audio - Long Sample - Flac",
        subtitle = "ff-16b-2c-44100hz.flac",
        url = "https://dl.espressif.com/dl/audio/ff-16b-2c-44100hz.flac"
    ),
)

fun getMockedLiveStreams() = listOf(
    MediaOption(
        title = "Skate Phantom 4k",
        url = "http://sample.vodobox.com/skate_phantom_flex_4k/skate_phantom_flex_4k.m3u8"
    ),
    MediaOption(
        title = "Planete Interdite",
        url = "http://sample.vodobox.com/planete_interdite_hevc/planete_interdite_hevc.m3u8"
    ),
    MediaOption(
        title = "Pipe Dream Tahiti",
        url = "http://sample.vodobox.com/pipe_dream_tahiti/pipe_dream_tahiti.m3u8"
    ),
    MediaOption(
        title = "We Are Blood 4k",
        url = "http://sample.vodobox.com/we_are_blood_4k/we_are_blood_4k.m3u8"
    ),
    MediaOption(
        title = "Caminande 2k",
        url = "http://sample.vodobox.com/caminandes_3_2k/caminandes_3_2k.m3u8"
    ),
    MediaOption(
        title = "Caminandes 4k",
        url = "http://sample.vodobox.com/caminandes_1_4k/caminandes_1_4k.m3u8"
    ),
    MediaOption(
        title = "Big Buck Bunny",
        url = "https://ireplay.tv/test/blender.m3u8"
    ),
    MediaOption(
        title = "Oceans",
        url = "http://playertest.longtailvideo.com/adaptive/oceans_aes/oceans_aes.m3u8"
    ),
    MediaOption(
        title = "Playlist",
        url = "http://playertest.longtailvideo.com/adaptive/captions/playlist.m3u8"
    ),
    MediaOption(
        title = "Livestream Metadata",
        url = "http://playertest.longtailvideo.com/adaptive/wowzaid3/playlist.m3u8"
    ),
    MediaOption(
        title = "Tears of Steel 4k",
        url = "http://content.jwplatform.com/manifests/vM7nH0Kl.m3u8"
    ),
    MediaOption(
        title = "Artbeats",
        url = "http://cdn-fms.rbs.com.br/hls-vod/sample1_1500kbps.f4v.m3u8"
    )
)

fun getMockedRadios() = listOf(
    MediaOption(
        title = "MP3 - 128K Stereo",
        url = "https://streams.radiomast.io/ref-128k-mp3-stereo"
    ),
    MediaOption(
        title = "MP3 - 128K Stereo - HLS",
        url = "https://streams.radiomast.io/ref-128k-mp3-stereo/hls.m3u8"
    ),
    MediaOption(
        title = "MP3 - 128K Stereo, with Preroll",
        url = "https://streams.radiomast.io/ref-128k-mp3-stereo-preroll"
    ),
    MediaOption(
        title = "AAC-LC - 128K Stereo",
        url = "https://streams.radiomast.io/ref-128k-aaclc-stereo"
    ),
)
