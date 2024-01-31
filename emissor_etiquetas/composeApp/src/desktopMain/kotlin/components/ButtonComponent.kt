package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import settings.colorButton
import settings.paddingDefault

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = paddingDefault.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorButton
        )
    ) {
        Text(
            text,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default,
                color = Color.Black
            )
        )
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ImageButton(
    text: String,
    onClick: () -> Unit,
    image: String,
) {
    Button(
        onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = paddingDefault.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colorButton
        )
    ) {

        Image(
            painterResource(image),
            null,
            Modifier.size(width = 25.dp, height = 25.dp)
        )

        Text(
            text,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default,
                color = Color.Black
            )
        )
    }
}