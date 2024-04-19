package com.example.smartcalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartcalculator.ui.theme.SmartCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartCalculatorTheme {
                // A surface container using the 'background' color from the theme
                testComposable()
            }
        }
    }
}

@Composable
fun testComposable() {
    CalculatorButton(symbol = "1", modifier = Modifier) {
        
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SmartCalculatorTheme {
        testComposable()
    }
}