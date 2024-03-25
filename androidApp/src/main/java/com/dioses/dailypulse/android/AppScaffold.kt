package com.dioses.dailypulse.android

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dioses.dailypulse.android.screens.AboutScreen
import com.dioses.dailypulse.android.screens.ArticlesScreen
import com.dioses.dailypulse.android.screens.Screens
import com.dioses.dailypulse.android.screens.SourcesScreen

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.android
 * Created by Arthur Dioses Reto on 20/03/24 at 11:16 PM
 * All rights reserved 2024.
 ****/

@Composable
fun AppScaffold() {
    val navController = rememberNavController()

    Scaffold {
        AppNavHost(
            navController = navController,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screens.ARTICLES.route,
        modifier = modifier
    ) {
        composable(Screens.ARTICLES.route) {
            ArticlesScreen(
                onSourceButtonClick = { navController.navigate(Screens.SOURCES.route) },
                onAboutButtonClick = { navController.navigate(Screens.ABOUT_DEVICE.route) },
            )
        }

        composable(Screens.ABOUT_DEVICE.route) {
            AboutScreen(onUpButtonClick = { navController.popBackStack() })
        }

        composable(Screens.SOURCES.route) {
            SourcesScreen(onUpButtonClick = { navController.popBackStack() })
        }
    }
}
