package com.example.streaming.player

import androidx.annotation.OptIn
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.util.UnstableApi
import androidx.media3.ui.PlayerView

@OptIn(UnstableApi::class)
@Composable
fun PlayerView(
    modifier: Modifier = Modifier,
    url: String,
    title: String,
    viewModel: PlayerViewModel = viewModel()
) {
    val context = LocalContext.current
    val player by viewModel.playerState.collectAsStateWithLifecycle()

    LaunchedEffect(url) {
        viewModel.initializePlayer(context, url, title)
    }

    DisposableEffect(Unit) {
        onDispose {
            viewModel.savePlayerState()
            viewModel.releasePlayer()
        }
    }
    player?.let {
        AndroidView(
            modifier = modifier.fillMaxWidth().height(200.dp),
            factory = { factoryContext ->
                PlayerView(factoryContext).apply {
                    this.player = player
                    setShowPreviousButton(false)
                    setShowNextButton(false)
                    setShowBuffering(PlayerView.SHOW_BUFFERING_WHEN_PLAYING)
                }
            },
            update = { playerView ->
                playerView.player = player
            }
        )
    }
}