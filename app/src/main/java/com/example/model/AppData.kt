package com.example.model

data class User(val username: String, val fullName: String, val workspace: String)

data class CognitiveCore(
    val mode: String,
    val prompt: String,
    val knowledgeNodes: Int,
    val aiInteractions: Int,
    val attachedLLM: String,
    val features: List<String>
)

data class Stat(
    val id: String,
    val title: String,
    val value: Double,
    val unit: String,
    val max: Double,
    val maxUnit: String,
    val percent: Double,
    val status: String,
    val description: String
)

data class Quota(
    val id: String,
    val title: String,
    val value: Double,
    val max: String,
    val percent: Double,
    val status: String,
    val description: String
)

data class Integration(val name: String, val status: String, val isActive: Boolean)

data class AdvancedFeature(val name: String, val status: String)

data class AILayer(val layer: String, val tech: String, val status: String)

data class QuotaChartData(val value: Double, val name: String, val color: List<String>?)

data class KnowledgeGraphNode(val name: String, val symbolSize: Int, val category: Int, val x: Int, val y: Int)
data class KnowledgeGraphLink(val source: Int, val target: Int)

data class KnowledgeGraph(
    val categories: List<String>,
    val nodes: List<KnowledgeGraphNode>,
    val links: List<KnowledgeGraphLink>
)

data class AppData(
    val version: String,
    val user: User,
    val systemStatus: String,
    val cognitiveCore: CognitiveCore,
    val stats: List<Stat>,
    val quotas: List<Quota>,
    val integrations: List<Integration>,
    val advancedFeatures: List<AdvancedFeature>,
    val aiLayers: List<AILayer>,
    val securityFeatures: List<String>,
    val quotaChartData: List<QuotaChartData>,
    val knowledgeGraph: KnowledgeGraph
)
