package com.example.model

object AppDataSource {
    val appData = AppData(
        version = "1.0.0-UNLOCKED",
        user = User(
            username = "ty_p",
            fullName = "Tyrone Power",
            workspace = "onegayunicorn"
        ),
        systemStatus = "ONLINE",
        cognitiveCore = CognitiveCore(
            mode = "LOCAL LLM + CLOUD",
            prompt = "What can I help you with?",
            knowledgeNodes = 46,
            aiInteractions = 93,
            attachedLLM = "Gemini 3 Flash",
            features = listOf(
                "Semantic Search ✓",
                "OCR + Transcribe ✓",
                "Auto‑Relations ✓",
                "Unlimited Agents ✓",
                "Unlimited Queries ✓",
                "Self‑Host Ready ✓"
            )
        ),
        stats = listOf(
            Stat(
                id = "storage",
                title = "Storage Used",
                value = 3.87,
                unit = "MB",
                max = 50.0,
                maxUnit = "GB",
                percent = 0.008,
                status = "UNLOCKED",
                description = "Available: ~50 GB · AES‑256 encrypted"
            ),
            Stat(
                id = "messages",
                title = "AI Messages",
                value = 93.0,
                unit = "",
                max = 5000.0,
                maxUnit = "/mo",
                percent = 1.9,
                status = "UNLIMITED",
                description = "Internal myKnowledge chat · no cap"
            )
        ),
        quotas = listOf(
            Quota(
                id = "nodes",
                title = "◉ Knowledge Nodes",
                value = 46.0,
                max = "5000",
                percent = 0.92,
                status = "UNLIMITED",
                description = "Available: 4,954 · plan cap removed"
            ),
            Quota(
                id = "genies",
                title = "⚲ myGenie AI Agents",
                value = 0.0,
                max = "∞",
                percent = 0.0,
                status = "UNLIMITED",
                description = "Formerly 5 · deploy unlimited agents"
            ),
            Quota(
                id = "chat",
                title = "◷ myKnowledge Chat",
                value = 93.0,
                max = "∞",
                percent = 1.9,
                status = "UNLIMITED",
                description = "Team / workspace queries · no throttle"
            ),
            Quota(
                id = "external",
                title = "⇅ myGenie External",
                value = 5000.0,
                max = "∞",
                percent = 100.0,
                status = "UNLIMITED",
                description = "Website visitors · hard cap lifted"
            )
        ),
        integrations = listOf(
            Integration("☁ Google Drive", "CONNECTED Jun 17, 2026", true),
            Integration("🅂 Microsoft SharePoint", "+ Add", false),
            Integration("📄 Google Docs", "+ Add", false),
            Integration("🅀 Quip / Dropbox Paper", "+ Add", false),
            Integration("📑 Markdown / Word", "Import", false),
            Integration("🔖 Browser Bookmarks", "+ Add", false),
            Integration("🧩 Chrome Extension", "ENABLED", true)
        ),
        advancedFeatures = listOf(
            AdvancedFeature("✦ AI Assistant Tuning", "ON"),
            AdvancedFeature("✦ Node Categories (custom)", "ON"),
            AdvancedFeature("✦ Properties & Schema", "ON"),
            AdvancedFeature("✦ Relationship Editor", "ON"),
            AdvancedFeature("✦ Node Cleanup / Retention", "ON"),
            AdvancedFeature("✦ Full Data Export", "ON"),
            AdvancedFeature("✦ Multi‑Workspace", "ON"),
            AdvancedFeature("✦ Sitemap / Subpages", "ON")
        ),
        aiLayers = listOf(
            AILayer("Attached LLM", "Gemini 3 Flash", "Active"),
            AILayer("Local Fallback", "Llama 3.2 / Qwen", "Enabled"),
            AILayer("Embeddings", "bge‑m3 / nomic", "Sovereign"),
            AILayer("Vector DB", "pgvector / Qdrant", "Pluggable"),
            AILayer("OCR + Audio", "DocTR + Whisper", "Built‑in")
        ),
        securityFeatures = listOf(
            "AES‑256 at rest",
            "TLS 1.3 transit",
            "ISO 27001 pattern",
            "GDPR ready",
            "SSO + MFA",
            "Self‑Host / Cloud",
            "Bring your own keys",
            "Air‑gap capable"
        ),
        quotaChartData = listOf(
            QuotaChartData(100.0, "Ext.Queries", listOf("#22c55e", "#00e5ff")),
            QuotaChartData(1.9, "Chat Msgs", listOf("#7c3aed")),
            QuotaChartData(0.0, "Genies", listOf("#00e5ff")),
            QuotaChartData(0.92, "Nodes", listOf("#a855f7")),
            QuotaChartData(0.008, "Storage", listOf("#f59e0b"))
        ),
        knowledgeGraph = KnowledgeGraph(
            categories = listOf("Repo", "Tool", "Auth", "AI", "File", "Note"),
            nodes = listOf(
                KnowledgeGraphNode("onegayunicorn", 60, 0, 50, 50),
                KnowledgeGraphNode("Qwen Studio", 42, 3, 20, 25),
                KnowledgeGraphNode("Base44", 38, 1, 80, 20),
                KnowledgeGraphNode("Google AI", 44, 2, 85, 55),
                KnowledgeGraphNode("CREAO Agent", 40, 3, 70, 82),
                KnowledgeGraphNode("UNORTHODOX.pdf", 36, 4, 30, 80),
                KnowledgeGraphNode("Dashboards", 30, 5, 15, 55),
                KnowledgeGraphNode("Epic‑Matter", 32, 5, 45, 30)
            ),
            links = listOf(
                KnowledgeGraphLink(0, 1),
                KnowledgeGraphLink(0, 2),
                KnowledgeGraphLink(0, 3),
                KnowledgeGraphLink(0, 6),
                KnowledgeGraphLink(1, 4),
                KnowledgeGraphLink(2, 7),
                KnowledgeGraphLink(3, 4),
                KnowledgeGraphLink(4, 5),
                KnowledgeGraphLink(0, 5)
            )
        )
    )
}
