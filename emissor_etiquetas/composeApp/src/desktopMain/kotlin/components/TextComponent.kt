package components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import settings.colorTextMenuUnSelectable
import settings.colorTextNormal
import settings.colorTextTitle

@Composable
fun NormalText(
    text:String,
    color: Color = colorTextNormal,
    modifier: Modifier = Modifier
) {
    Text(
        text,
        modifier,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Default,
            color = color
        )
    )
}

@Composable
fun MenuText(
    text:String,
    color: Color = colorTextMenuUnSelectable,
    modifier: Modifier = Modifier
) {
    Text(
        text,
        modifier,
        style = TextStyle(
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Default,
            color = color
        )
    )
}

@Composable
fun TitleText(
    text:String,
    color: Color = colorTextTitle,
    modifier: Modifier = Modifier
) {
    Text(
        text,
        modifier,
        style = TextStyle(
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Default,
            color = color
        )
    )
}
