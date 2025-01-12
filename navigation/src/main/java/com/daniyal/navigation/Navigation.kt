package com.daniyal.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.daniyal.note.CreateNote
import org.koin.androidx.compose.KoinAndroidContext
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun SetupNavigation() {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val navDestination = backStackEntry?.destination
    KoinAndroidContext {
        Surface(modifier = Modifier.fillMaxSize()) {
            SetupNavigationHostMain(
                navController = navController,
                navDestination = navDestination,
                onNavigate = { appScreen ->
                    navigateTo(appScreen = appScreen, navController = navController)
                }
            )
        }
    }
}

@Composable
private fun SetupNavigationHostMain(
    navController: NavHostController = rememberNavController(),
    navDestination: NavDestination?,
    onNavigate: (appScreen: AppScreens) -> Unit,
) {
    Scaffold { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = AppScreens.CreateNoteScreen,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(500)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(500)
                )
            },
            popEnterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            },
            popExitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            }
        ) {

            /**
             *  Note Screens
             **/

            composable<AppScreens.CreateNoteScreen> {
                CreateNote()
            }

        }
    }
}

private fun navigateTo(
    appScreen: AppScreens,
    navController: NavController
) {
    when (appScreen) {
        AppScreens.PreviousScreen -> {
            navController.popBackStack()
        }

        else -> {
            navController.navigate(route = appScreen)
        }
    }
}