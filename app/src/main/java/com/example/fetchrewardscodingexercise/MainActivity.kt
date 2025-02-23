package com.example.fetchrewardscodingexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.fetchrewardscodingexercise.ui.theme.FetchRewardsCodingExerciseTheme
import com.example.fetchrewardscodingexercise.ui.listScreen.ItemListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FetchRewardsCodingExerciseTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ItemListScreen()
                }
            }
        }
    }
}
