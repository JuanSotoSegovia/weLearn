package com.example.welearn.util

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.welearn.model.InterfaceDC

@Composable
fun <T: InterfaceDC> ObjectItem_(
    object_: T,
    modifier: Modifier = Modifier
){
    Card {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageItem_(photo = object_.image)
            Spacer( modifier = Modifier.height(5.dp) )
            NameItem_(name = object_.name)
        }
    }
}