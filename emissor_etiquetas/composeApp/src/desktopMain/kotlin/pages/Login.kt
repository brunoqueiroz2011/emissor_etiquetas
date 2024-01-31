package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.ImageButton
import components.TextButton
import components.NormalText
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import settings.TITLE
import settings.colorButton
import settings.colorNotificationGreen

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Login() {
    Row(
        Modifier
            .background(Color.Black)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            Modifier.size(width = 862.dp, height = 860.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painterResource("logo.png"),
                null,
                modifier = Modifier.size(width = 78.dp, height = 78.dp)
            )
            Text(
                TITLE,
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Default,
                    color = Color.White
                )
            )
        }

        Column(
            modifier = Modifier.size(width = 537.dp, height = 860.dp)
                .clip(RoundedCornerShape(30.dp))
                .align(Alignment.CenterVertically)
                .background(Color.White)
                .padding(start = 30.dp, end = 30.dp),
            verticalArrangement = Arrangement.Center
        ) {
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }

            NormalText(
                text = "Email",
            )

            TextField(
                modifier = Modifier.size(width = 366.dp, height = 50.dp),
                singleLine = true,
                value = email,
                onValueChange = { email = it }
            )

            NormalText(
                text = "Senha",
                modifier = Modifier.padding(top = 16.dp)
            )

            TextField(
                modifier = Modifier.size(width = 366.dp, height = 50.dp),
                singleLine = true,
                value = password,
                onValueChange = { password = it }
            )

            TextButton(
                text = "Login",
                onClick = {
                    println("Clicou no Login")
                }
            )

            ImageButton(
                text = "Google",
                onClick = {
                    println("Clicou no Login")
                },
                image= "logo_google.png"
            )
        }

    }
}