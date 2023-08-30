package com.example.android_week1



import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.data.EmptyGroup.data
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat

import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.PermissionChecker.checkSelfPermission
import com.example.android_week1.ui.theme.Android_week1Theme

class MainIntents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()
        }
    }
}

//launch camera
//launch email
//launch call
//launch simtoolkit / safaricom app
//share to download app
@Preview(showBackground = true)
@Composable
fun MyIntents() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(15.dp)
    ) {

        Spacer(modifier = Modifier.height(12.dp))
        val sms = LocalContext.current
        Button(onClick = { val phonenumber = "0726978138"
            val messagetext = "Yooh hope u good."
            val uri = Uri.parse("smsto:$phonenumber")
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body",messagetext)

            sms.startActivity(intent)
        },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()






        ) {
            Text(text = "Launch SMS",color = Color.Black)
        }


        Spacer(modifier = Modifier.height(12.dp))

        val takepic = LocalContext.current
        Button(onClick = {
            val takepictureintent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            takepic.startActivity(takepictureintent )
        },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Launch Camera", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(12.dp))
        val emaillaunch = LocalContext.current
        Button(onClick = {
            val email_intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:marcusmbugua1@gmail.com")
                putExtra(Intent.EXTRA_SUBJECT,"Subject")
                putExtra(Intent.EXTRA_TEXT,"Body")


            }
            val chooserIntent = Intent.createChooser(email_intent,"send email")
            emaillaunch.startActivity(chooserIntent)
        },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Launch Gmail", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(12.dp))
        val calllaunch = LocalContext.current
        Button(onClick = {

//
//                val phoneNumber = "+254721592645"
//                val callIntent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber"))
//
//                if (ContextCompat.checkSelfPermission(calllaunch, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    val CALL_PERMISSION_REQUEST_CODE = 123
//                    ActivityCompat.requestPermissions(calllaunch, arrayOf(Manifest.permission.CALL_PHONE), CALL_PERMISSION_REQUEST_CODE)
//                } else {
//                    startActivity(callIntent)
//                }



        },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Launch Call", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Launch SIMToolKit", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth())
        {
            Text(text = "Share to download app", color = Color.Black)
        }


    }



}