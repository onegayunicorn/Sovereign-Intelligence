package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.model.AppData
import com.example.model.NotificationManager
import com.example.ui.components.*
import com.example.ui.theme.MyApplicationTheme
import com.example.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val viewModel: MainViewModel = viewModel()
                val uiState by viewModel.uiState.collectAsState()
                
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DashboardScreen(uiState)
                }
            }
        }
    }
}


@Composable
fun DashboardScreen(appData: AppData) {
    LaunchedEffect(Unit) {
        NotificationManager.addNotification("System Online: All subsystems nominal.")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Header(appData)
            NotificationUI() // Added this
            Column(modifier = Modifier.padding(16.dp)) {
                CognitiveCorePanel(appData.cognitiveCore)
                
                Spacer(modifier = Modifier.height(16.dp))
                
                StatsRow(appData.stats)
                
                Spacer(modifier = Modifier.height(16.dp))
                
                SecurityBadge()
            }
            Spacer(modifier = Modifier.weight(1f))
            BottomNav()
        }
        
        // Scan line overlay
        Canvas(modifier = Modifier.matchParentSize()) {
            val stripeHeight = 3.dp.toPx()
            for (y in 0..size.height.toInt() step stripeHeight.toInt() * 2) {
                drawLine(
                    color = Color(0x0500E5FF),
                    start = Offset(0f, y.toFloat()),
                    end = Offset(size.width, y.toFloat()),
                    strokeWidth = 2.dp.toPx()
                )
            }
        }
    }
}
