package com.saehyun.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.NoLiveLiterals
import com.saehyun.composeplayground.ui.theme.ComposePlaygroundTheme

@NoLiveLiterals
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Column {
                    NotSkippableScreen(a = listOf("not skippable screen"))
                    SkippableScreen(a = "skippable")
                    NonRestartableScreen(a = listOf("non restartable screen"))
                }
            }
        }
    }
}
