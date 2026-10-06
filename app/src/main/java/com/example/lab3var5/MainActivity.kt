package com.example.lab3var5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3var5.ui.theme.Lab3Var5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab3Var5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SumCalculation(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SumCalculation(modifier: Modifier = Modifier) {
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Сумма 1/1! + 1/2! + ... + 1/n!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(36.dp))

        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Введите n") },
            modifier = Modifier.width(300.dp)
        )

        Spacer(modifier = Modifier.height(36.dp))

        Button(
            onClick = {
            },
            modifier = Modifier.width(200.dp)
        ) {
            Text("Вычислить")
        }

        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = result,
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SumCalculationPreview() {
    Lab3Var5Theme {
        SumCalculation()
    }
}