package com.example.android_week1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            home()


              }
        }
    }




@Preview(showBackground = true)
@Composable
fun home(){
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center
       ,
       modifier = Modifier
           .background(Color.Red)
           .fillMaxSize()

   ) { Text(text = "welcome Alphonce", color = Color.Green, fontSize = 10.sp)
       Spacer(modifier =Modifier.height(12.dp))
       var gotologin = LocalContext.current
       Button(onClick ={
           gotologin.startActivity(Intent(gotologin,Login_activity::class.java))

       },
           Spacer(modifier = Modifier.height(12.dp))
           var gotoScroll = LocalContext.current
               Button(onClick ={
                   gotoScroll.startActivity(Intent(Scroll,Scrolledlistview::class.java))







           shape  = RoundedCornerShape(5.dp),
       modifier = Modifier.fillMaxWidth()

       ) {
           Text(text = "GO TO SCROLL")

       }





   }
}