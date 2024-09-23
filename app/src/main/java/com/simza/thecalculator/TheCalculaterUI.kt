package com.simza.thecalculator

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TheCalculaterUI(
    viewModel: TheCalculaterViewModel
){
    val expression = viewModel.expression;
    val buttonSpacing = 8.dp;
    Log.d("MainActivity","onCreate: ${viewModel.expression.value}");
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
        ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            LazyRow(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth(),
                reverseLayout = true
            ) {
                item {
                    Text(
                        text = expression.value,
                        textAlign = TextAlign.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp, horizontal = 8.dp),
                        fontWeight = FontWeight.Light,
                        fontSize = 80.sp,
                        color = Color.White,
                        maxLines = 1
                    )
                }
            }
            Divider(
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "AC",
                    color = Color.Red,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.clear()
                        }
                )
                CalculatorButton(
                    symbol = "(",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("(")
                        }
                )
                CalculatorButton(
                    symbol = ")",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append(")")
                        }
                )
                CalculatorButton(
                    symbol = "/",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("/")
                        }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "7",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("7")
                        }
                )
                CalculatorButton(
                    symbol = "8",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("8")
                        }
                )
                CalculatorButton(
                    symbol = "9",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("9")
                        }
                )
                CalculatorButton(
                    symbol = "*",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("*")
                        }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "4",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("4")
                        }
                )
                CalculatorButton(
                    symbol = "5",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("5")
                        }
                )
                CalculatorButton(
                    symbol = "6",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("6")
                        }
                )
                CalculatorButton(
                    symbol = "-",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("-")
                        }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "1",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("1")
                        }
                )
                CalculatorButton(
                    symbol = "2",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("2")
                        }
                )
                CalculatorButton(
                    symbol = "3",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("3")
                        }
                )
                CalculatorButton(
                    symbol = "+",
                    color = Color.Blue,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("+")
                        }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "0",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append("0")
                        }
                )
                CalculatorButton(
                    symbol = ".",
                    color = Color.Gray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.append(".")
                        }
                )
                CalculatorButton(
                    symbol = "DEL",
                    color = Color.Red,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.delete()
                        }
                )
                CalculatorButton(
                    symbol = "=",
                    color = Color.Green,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clickable {
                            viewModel.evaluate()
                        }
                )
            }
        }
    }
}