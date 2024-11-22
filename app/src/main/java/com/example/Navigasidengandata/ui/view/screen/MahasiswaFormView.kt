package com.example.Navigasidengandata.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.Navigasidengandata.R

@Composable
fun MahasiswaFormView(
    onSubmitButton: (MutableList<String>) -> Unit,
    onbackbuttonClicked: () -> Unit
){
    var nama by remember {
        mutableStateOf("")
    }


    var nim by remember {
        mutableStateOf("")
    }


    var email by remember {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(nim, nama, email)

    Column (modifier = Modifier
        .fillMaxSize()
        .background(
            color = colorResource(
                id = R.color.primary
            )
        )
    ){
        Row (modifier = Modifier
            .padding(40.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){

        }
    }
}