package com.saehyun.composeplayground

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun InternalBox(a: String) {
    Text(text = "Internal $a")
}