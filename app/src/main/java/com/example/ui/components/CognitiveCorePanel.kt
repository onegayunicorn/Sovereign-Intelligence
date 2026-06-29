package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.model.CognitiveCore
import com.example.ui.theme.Panel
import com.example.ui.theme.Panel2

@Composable
fun CognitiveCorePanel(cognitiveCore: CognitiveCore) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(Brush.verticalGradient(listOf(Panel, Panel2)))
            .padding(16.dp)
    ) {
        // Scan line overlay
        Canvas(modifier = Modifier.matchParentSize()) {
            val stripeHeight = 3.dp.toPx()
            for (y in 0..size.height.toInt() step stripeHeight.toInt() * 2) {
                drawLine(
                    color = Color(0x0A00E5FF),
                    start = Offset(0f, y.toFloat()),
                    end = Offset(size.width, y.toFloat()),
                    strokeWidth = 2.dp.toPx()
                )
            }
        }
        
        Column {
            Text("Cognitive Core", style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(modifier = Modifier.height(8.dp))
            Text(cognitiveCore.prompt, style = MaterialTheme.typography.headlineMedium, color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Semantic engine ready across ${cognitiveCore.knowledgeNodes} knowledge nodes", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}
