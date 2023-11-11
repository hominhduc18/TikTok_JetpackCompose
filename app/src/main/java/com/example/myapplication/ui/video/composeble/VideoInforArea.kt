package com.example.myapplication.ui.video.composeble

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.ToptopTheme

@Composable
fun VideoInfoArea(
    modifier: Modifier = Modifier,
    accountName: String,
    videoName: String,
    hashTags: List<String>,
    songName: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = accountName,
            style = MaterialTheme.typography.headlineMedium.copy(color = Color.Black),
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = videoName,
            style = MaterialTheme.typography.headlineLarge.copy(color = Color.Black),
            maxLines = 2
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = hashTags.joinToString(separator = " "),
            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black),
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = songName,
            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black),
            maxLines = 1
        )
    }
}

@Preview
@Composable
fun VideoInforAreaPreView(){
    ToptopTheme {
        VideoInfoArea(
            accountName = "helle wold",
            videoName = "hehe",
            hashTags = listOf("android kotlin"),
            songName = "hello VN")
    }
}