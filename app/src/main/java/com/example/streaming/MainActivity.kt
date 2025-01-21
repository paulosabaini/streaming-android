package com.example.streaming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.streaming.ui.theme.StreamingTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StreamingTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = SourceSelection) {
                    composable<SourceSelection> {
                        SourceSelectionScreen { navController.navigate(MediaSelection(it)) }
                    }
                    composable<MediaSelection> { backStackEntry ->
                        val mediaSelection: MediaSelection = backStackEntry.toRoute()
                        MediaSelectionScreen(
                            sourceType = mediaSelection.sourceType,
                            onNavigateToPlayer = {},
                            onNavigateToSourceSelection = { navController.navigate(SourceSelection) })
                    }
                }
            }
        }
    }
}

@Serializable
object SourceSelection

@Serializable
data class MediaSelection(val sourceType: SourceType)
