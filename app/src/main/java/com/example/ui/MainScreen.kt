package com.example.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.model.AppDataSource
import androidx.compose.ui.unit.dp
import com.example.ui.components.*
import com.example.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel = viewModel()) {
    val appData by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            SovereignHeader(
                username = appData.user.username,
                workspace = appData.user.workspace
            )
        },
        bottomBar = { BottomNav() }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            CognitiveCorePanel(appData.cognitiveCore)
            
            Spacer(modifier = Modifier.height(16.dp))
            
            StatsRow(appData.stats)
            
            Spacer(modifier = Modifier.height(16.dp))
            
            SecurityBadge()
            
            Spacer(modifier = Modifier.height(16.dp))
            
            NotificationUI()
        }
    }
}
