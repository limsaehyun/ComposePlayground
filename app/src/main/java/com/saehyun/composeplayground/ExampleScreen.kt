package com.saehyun.composeplayground

import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable

@Composable
fun NotSkippableScreen(
    a: List<String>,
) {
    InternalBox(a = a.first())
}

@Composable
fun SkippableScreen(
    a: String,
) {
    InternalBox(a = a)
}

@NonRestartableComposable
@Composable
fun NonRestartableScreen(
    a: List<String>,
) {
    InternalBox(a = a.first())
}