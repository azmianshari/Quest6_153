package com.example.Navigasidengandata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Navigasidengandata.navigation.MahasiswaApp
import com.example.Navigasidengandata.ui.theme.NavigasidengandataTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigasidengandataTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MahasiswaApp(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}