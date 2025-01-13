package com.daniyal.ui.views

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import com.daniyal.ui.theme.titleColor
import com.daniyal.ui.utils.AppConstants.EMPTY_STRING

@Composable
fun TextView(
    isTitleVisible: Boolean = true,
    isTitleAllCaps: Boolean = false,
    title: String = EMPTY_STRING,
    color: Color = titleColor,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration = TextDecoration.None,
    maxLines: Int = 1,
    style: TextStyle = MaterialTheme.typography.titleSmall,
    modifier: Modifier = Modifier
) {
    if (isTitleVisible) {
        Text(
            text = if (isTitleAllCaps) {
                title.uppercase()
            } else {
                title
            },
            style = style,
            color = color,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines,
            textDecoration = textDecoration,
            modifier = modifier,
        )
    }
}
