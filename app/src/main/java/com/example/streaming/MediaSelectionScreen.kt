package com.example.streaming

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MediaSelectionScreen(
    modifier: Modifier = Modifier,
    sourceType: SourceType,
    onNavigateToPlayer: (MediaItem) -> Unit,
    onNavigateToSourceSelection: () -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(sourceType.name + " Media Selection") },
                navigationIcon = {
                    Icon(
                        modifier = Modifier.clickable(onClick = onNavigateToSourceSelection),
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = null,
                    )
                }
            )
        },
    ) {
        LazyColumn(modifier = Modifier.padding(it)) {
            items(getMediaItems(sourceType)) { item ->
                MediaSelectionItem(
                    title = item.title,
                    subtitle = item.subtitle,
                    thumbnailUrl = item.thumbnailUrl,
                ) { onNavigateToPlayer(item) }
            }
        }
    }
}

@Composable
private fun MediaSelectionItem(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String? = null,
    thumbnailUrl: String? = null,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier.padding(8.dp),
        onClick = onClick,
        shape = ShapeDefaults.ExtraSmall,
        colors = CardDefaults.cardColors(containerColor = Color.Green.copy(alpha = 0.1f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            thumbnailUrl?.let {
                AsyncImage(
                    modifier = Modifier.size(80.dp),
                    model = thumbnailUrl,
                    contentDescription = null
                )
            }
            Spacer(Modifier.width(8.dp))
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyMedium
                )
                subtitle?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}

data class MediaItem(
    val title: String,
    val subtitle: String? = null,
    val thumbnailUrl: String? = null,
    val url: String,
)

private fun getMediaItems(sourceType: SourceType): List<MediaItem> {
    return when (sourceType) {
        SourceType.VIDEO -> getMockedVideos()
        SourceType.AUDIO -> getMockedAudios()
        SourceType.LIVESTREAM -> getMockedLiveStreams()
        SourceType.RADIO -> getMockedRadios()
    }
}

@Preview
@Composable
private fun MediaSelectionScreenPreview() {
    MediaSelectionScreen(
        sourceType = SourceType.VIDEO,
        onNavigateToPlayer = {},
        onNavigateToSourceSelection = {})
}
