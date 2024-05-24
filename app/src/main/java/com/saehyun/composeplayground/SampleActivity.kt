@file:NoLiveLiterals

package com.saehyun.composeplayground

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NoLiveLiterals
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

class SampleActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Toast.makeText(this, "dasda", Toast.LENGTH_LONG).show()
        setContent {
            TestComposable()
//            Text(text = "this is SampleActivity")
//            val toast = MemoryWordToast(this)
//            ToastShow(applicationContext, "toast")
        }
    }
}

@Composable
fun TestComposable() {
    Log.d("SAEHYUN", "1")
    val ticks = remember { mutableStateOf(100) }
    LaunchedEffect(key1 = Unit) {
        while (true) {
            delay(3000)
            ticks.value++
        }
    }

    Box(modifier = Modifier) {
        Log.d("SAEHYUN", "2")
        Box(modifier = Modifier) {
            Log.d("SAEHYUN", "3")
            Box(modifier = Modifier) {
                Log.d("SAEHYUN", "4")
                TickText { ticks.value }
            }
        }
    }
}
@Composable
fun TickText(ticks: () -> Int) {
    Log.d("SAEHYUN", "4")
    Box(modifier = Modifier) {
        Text(text = ticks.invoke().toString())
    }
}