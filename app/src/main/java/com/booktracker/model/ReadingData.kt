package com.booktracker.model

data class ReadingCategory(
    val categoryName: String,
    val booksRead: Int,
    val target: Int,
    val isOnTrack: Boolean = true
)

data class ReadingSummary(
    val totalBooksRead: Int,
    val monthlyGoal: Int,
    val pagesRead: Int,
    val readingStreak: Int
)

data class SmartSuggestion(
    val title: String,
    val message: String,
    val type: SuggestionType
)

enum class SuggestionType {
    POSITIVE, WARNING, NEUTRAL
}

data class ReadingStats(
    val readingRank: String,
    val recommendation: String,
    val nextGoal: String
)