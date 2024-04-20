package com.example.smartcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.smartcalculator.ui.theme.MediumGray
import com.example.smartcalculator.ui.theme.SmartCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartCalculatorTheme {
                // A surface container using the 'background' color from the theme
                // testComposable()
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )

            }
        }
    }
}

//@Composable
//fun testComposable() {
//    CalculatorButton(symbol = "1", modifier = Modifier) {
//
//    }
//}
//
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    SmartCalculatorTheme {
//        testComposable()
//    }
//}