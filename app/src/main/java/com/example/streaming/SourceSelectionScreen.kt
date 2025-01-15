package com.example.streaming

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.streaming.player.PlayerView

@Composable
fun SourceSelectionScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        var selectedUrl by remember { mutableStateOf<String?>(null) }

        PlayerView(url = selectedUrl)

        Button(
            onClick = {
                selectedUrl =
                    "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
            },
        ) { Text("video-on-demand") }
        Button(onClick = {
            selectedUrl = "https://dl.espressif.com/dl/audio/ff-16b-2c-44100hz.mp3"
        }) { Text("audio-on-demand") }
        Button(onClick = { selectedUrl = "https://ireplay.tv/test/blender.m3u8" }) { Text("live") }
        Button(onClick = {
            selectedUrl = "https://streams.radiomast.io/ref-128k-mp3-stereo"
        }) { Text("radio") }
    }
}