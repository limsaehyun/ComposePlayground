package com.saehyun.composeplayground

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.NoLiveLiterals
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest

@NoLiveLiterals
class MainActivity : ComponentActivity() {


//    private var customTextView: CustomTextView? = CustomTextView(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        customTextView?.text = "test"

        setContent {
            IntComposable(123) {
                val intent = Intent(this, SampleActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                }
                startActivity(intent)
            }
        }
    }
}

@Composable
fun IntComposable(
    a: Int,
    onClick: () -> Unit,
) {
    Text(modifier = Modifier.clickable { onClick() }, text = a.toString())
}

@Composable
fun FlowScreen(
    flow: StableWrapper<StateFlow<String>>
) {
    LaunchedEffect(key1 = Unit) {
        flow.value.collectLatest {

        }
    }
}

@Composable
fun ExampleScreen() {
    Column {
        NotSkippableScreen(a = listOf("not skippable screen"))
        SkippableScreen(a = "skippable")
        NonRestartableScreen(a = listOf("non restartable screen"))
    }
}