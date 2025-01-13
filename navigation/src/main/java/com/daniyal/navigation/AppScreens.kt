package com.daniyal.navigation

import com.daniyal.ui.utils.AppConstants.EMPTY_STRING
import kotlinx.serialization.Serializable

@Serializable
sealed class AppScreens(val route: String) {
    @Serializable
    data object PreviousScreen : AppScreens(route = EMPTY_STRING)

    @Serializable
    data object CreateNoteScreen : AppScreens(route = Routes.ROUTE_CREATE_NOTE)
}