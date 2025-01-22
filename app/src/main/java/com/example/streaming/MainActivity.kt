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
                            onNavigateToPlayer = { navController.navigate(Player(title = it.title, url = it.url)) },
                            onNavigateToSourceSelection = { navController.navigate(SourceSelection) })
                    }
                    composable<Player> { backStackEntry ->
                        val player: Player = backStackEntry.toRoute()
                        PlayerScreen(title = player.title, url = player.url) {
                            navController.navigateUp()
                        }
                    }
                }
            }
        }
    }
}
