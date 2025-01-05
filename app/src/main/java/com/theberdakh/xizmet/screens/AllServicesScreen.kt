package com.theberdakh.xizmet.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theberdakh.xizmet.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AllServicesScreen(modifier: Modifier = Modifier) {
    val services = listOf(
        ServiceCard(
            topIcon = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
            title = "New Title",
            subtitle = "Next subtitle"
        ),
        ServiceCard(
            topIcon = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
            title = "New Title",
            subtitle = "Next subtitle"
        ),
        ServiceCard(
            topIcon = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
            title = "New Title",
            subtitle = "Next subtitle"
        ),
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(8.dp),
        modifier = modifier
    ) {
        items(services) { service ->
            ServiceCardItem(service)
        }
    }
}