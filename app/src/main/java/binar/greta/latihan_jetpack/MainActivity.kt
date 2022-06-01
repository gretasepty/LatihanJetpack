package binar.greta.latihan_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binar.greta.latihan_jetpack.ui.theme.Latihan_JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Latihan_JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier.padding(15.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "Login")
        OutlinedTextField(
            value = username ,
            label = { Text(text = "Enter your username")},
            onValueChange = {username = it} )

        OutlinedTextField(
            value = pass ,
            label = { Text(text = "Enter your password")},
            onValueChange = {pass = it} )
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Latihan_JetpackTheme {
        Greeting("Android")
    }
}