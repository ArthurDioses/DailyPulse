package com.dioses.dailypulse.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dioses.dailypulse.Platform

/****
 * Project: DailyPulse
 * From: com.dioses.dailypulse.android
 * Created by Arthur Dioses Reto on 19/03/24 at 10:42 PM
 * All rights reserved 2024.
 ****/
@Composable
fun AboutScreen(
    onUpButtonClick: () -> Unit,
) {
    Column {
        Toolbar { onUpButtonClick() }
        ContentView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(onUpButtonClick: () -> Unit) {
    TopAppBar(title = { Text(text = "About Device") },
        navigationIcon = {
            IconButton(onClick = { onUpButtonClick() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Up Button"
                )
            }
        })
}

@Composable
fun ContentView() {

    val items = makeItems()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items) { row ->
            RowView(title = row.first, subTitle = row.second)
        }
    }

}

private fun makeItems(): List<Pair<String, String>> {
    val platform = Platform()
    platform.logSystemInfo()

    return listOf(
        Pair("Operating System", "${platform.osName} ${platform.osVersion}"),
        Pair("Device", platform.deviceModel),
        Pair("Density", platform.density.toString())
    )
}


@Composable
fun RowView(title: String, subTitle: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodyLarge
        )
    }

    Divider()
}
