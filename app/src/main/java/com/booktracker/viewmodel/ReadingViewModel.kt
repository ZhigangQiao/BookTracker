package com.booktracker.viewmodel

import androidx.lifecycle.ViewModel
import com.booktracker.model.*

class ReadingViewModel : ViewModel() {

    fun getSmartSuggestions(): List<SmartSuggestion> = listOf(
        SmartSuggestion(
            "Fiction Progress",
            "You've read 3 Fiction books this month. You're within your 4-book target. Great progress!",
            SuggestionType.POSITIVE
        ),
        SmartSuggestion(
            "Non-Fiction Behind",
            "Your Non-Fiction reading is at 1 book, which is below your 3-book goal. Try to read more in this category.",
            SuggestionType.WARNING
        ),
        SmartSuggestion(
            "Daily Reading Habit",
            "You've maintained a 7-day reading streak. Keep going to build a strong habit!",
            SuggestionType.NEUTRAL
        )
    )

    fun getReadingSummary() = ReadingSummary(
        totalBooksRead = 8,
        monthlyGoal = 12,
        pagesRead = 2450,
        readingStreak = 7
    )

    fun getReadingStats() = ReadingStats(
        readingRank = "Top 65%",
        recommendation = "Your reading habits are better than 65% of users",
        nextGoal = "Aim for Top 75% next month"
    )

    fun getReadingCategories() = listOf(
        ReadingCategory("Fiction", 3, 4, true),
        ReadingCategory("Non-Fiction", 1, 3, false),
        ReadingCategory("Science", 2, 2, true),
        ReadingCategory("Biography", 2, 3, true)
    )
}