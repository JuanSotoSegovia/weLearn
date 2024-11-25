@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.welearn

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.welearn.data.DataAnimals
import com.example.welearn.data.DataCategories
import com.example.welearn.data.DataColors
import com.example.welearn.data.DataFamilyMember
import com.example.welearn.model.InterfaceDC
import com.example.welearn.util.ObjectItem_
import com.example.welearn.util.playSound

@Composable
fun AppItemsWeLearn2(context: Context, modifier: Modifier = Modifier){
    var selectedCategorie by remember { mutableStateOf<InterfaceDC?>(null) }
    var selectedItem by remember { mutableStateOf<InterfaceDC?>(null) }
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }
    var isPlaying by remember { mutableStateOf(false) }

    val categorieSelected = when (selectedCategorie?.name){
        R.string.categorie_1 -> DataAnimals.animaslList
        R.string.categorie_2 -> DataColors.colorList
        R.string.categorie_3 -> DataFamilyMember.familyMemberList
        else -> emptyList()
    }

    Column {
        Card(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Column {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    verticalArrangement = Arrangement.spacedBy(18.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    items(DataCategories.categorieList){ categorie ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    selectedCategorie = categorie
                                    selectedItem = null
                                    println(selectedCategorie)
                                    if (!isPlaying){
                                        isPlaying = true
                                        playSound(context, categorie.sound, mediaPlayer){
                                            isPlaying = false
                                        }
                                    }
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            ObjectItem_(object_ = categorie)
                        }
                    }
                }
            }
        }
        Spacer( modifier = Modifier.height(20.dp) )
        Card(
            modifier = Modifier
                .padding(15.dp)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(18.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                items(categorieSelected){ object_ ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                selectedItem = object_
                                println(selectedItem)
                                //new
                                if (!isPlaying){
                                    isPlaying = true
                                    playSound(context, object_.sound, mediaPlayer){
                                        isPlaying = false
                                    }
                                }
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        ObjectItem_(object_ = object_)
                        println(object_)
                    }
                }

            }
        }
    }
    if (isPlaying) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(enabled = false, onClick = {})
        )
    }
}