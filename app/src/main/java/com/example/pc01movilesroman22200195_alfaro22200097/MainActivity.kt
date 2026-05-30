package com.example.pc01movilesroman22200195_alfaro22200097

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import com.example.pc01movilesroman22200195_alfaro22200097.presentation.home.Pantalla1
import com.example.pc01movilesroman22200195_alfaro22200097.ui.theme.PC01MOVILESROMAN22200195_ALFARO22200097Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PC01MOVILESROMAN22200195_ALFARO22200097Theme {
                NavGraph()
            }
        }
    }
}