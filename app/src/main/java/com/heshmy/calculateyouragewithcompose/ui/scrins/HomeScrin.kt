package com.heshmy.calculateyouragewithcompose.presentation.ui.scrins

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.lifecycle.viewmodel.compose.viewModel
import com.heshmy.calculateyouragewithcompose.CalculateApplication
//import com.heshmy.calculateyouragewithcompose.dada.local.PersonDatabase
//import com.heshmy.calculateyouragewithcompose.dada.model.Person
//import com.heshmy.calculateyouragewithcompose.dada.repository.LocalRepository
//import com.heshmy.calculateyouragewithcompose.dada.repository.LocalRepositoryImpl
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
@Preview(showBackground = true, showSystemUi =true)
fun HomePreview(){
    HomeScrin(Modifier.fillMaxSize())
}

@Composable
fun HomeScrin(modifier: Modifier){
    //   GlobalScope.launch { localViewModel.db.addPerson(Person("essam",2004)) }
    //  var person=viewModel.calculiteAge(name,age)

    //val viewModel: PersonViewModel = viewModel()
    var name by rememberSaveable { mutableStateOf("") }
    var age by rememberSaveable { mutableStateOf(0) }
    var nameTextfield by rememberSaveable { mutableStateOf("") }
    var ageTextfield by rememberSaveable { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize().padding(24.dp,36.dp).background(Color.White)) {


        Column(Modifier)
        {
            Text(
                text = "Your name:$name",
                fontSize = 34.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle(FontStyle.FONT_WEIGHT_BOLD)
            )
            Text(
                text = "Your age:$age",
                fontSize = 34.sp,
                fontStyle = androidx.compose.ui.text.font.FontStyle(FontStyle.FONT_WEIGHT_BOLD)
            )
        }

        Column(
            modifier= Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
        )
        {
            OutlinedTextField(
                modifier=Modifier.fillMaxWidth(),
                value = nameTextfield,
                onValueChange ={nameTextfield=it},
                label = { Text(text = "enter your name") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

            OutlinedTextField(
                modifier= Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth(),
                value = ageTextfield.toString(),
                onValueChange ={ ageTextfield=it.toInt()},
                label = {
                    Text(text = "Enter your date of birth")
                        },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Button(
                modifier= Modifier.fillMaxWidth().height(54.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                   // var person :Person = viewModel.calculiteAge(nameTextfield,ageTextfield)
                  //  name= person.name.toString()
                   // age= person.age!!

                    GlobalScope.launch {

                  // viewModel.addPerson(person)

                    }
                }

            ) {
                Text(
                text = "CalculateAge",
                    fontSize = 24.sp,
                    color = Color.White)
            }
        }
    }
}


