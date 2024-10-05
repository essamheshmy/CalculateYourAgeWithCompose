package com.heshmy.calculateyouragewithcompose.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun  PreviewOutlinedTextField(){
    EOutlinedTextField(
        modifier=Modifier.fillMaxWidth(),
        value = "nameTextfield",
        onValueChange ={},
        label = { Text(text = "enter your name") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

    )
}

@Composable
fun  EOutlinedTextField(
    modifier: Modifier,
    value: String,
    nameTextfield: String = "",
    onValueChange: (String) -> Unit = {},
    label: @Composable () -> Unit = {},
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
){

    OutlinedTextField(
        modifier= modifier,//Modifier.fillMaxWidth(),
        value =value ,
        onValueChange =onValueChange,//{nameTextfield=it},
        label = label,//{ Text(text = "enter your name") },
        keyboardOptions = keyboardOptions//KeyboardOptions(keyboardType = KeyboardType.Text)

    )
}