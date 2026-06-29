package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ui.theme.Panel
import com.example.ui.theme.Accent

@Composable
fun BottomNav() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Panel)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        listOf("CORE", "SEARCH", "AGENTS", "CONFIG").forEach { item ->
            Text(
                item,
                style = MaterialTheme.typography.labelSmall,
                color = if (item == "CORE") Accent else MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
