package com.example.componentetelaperfil.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componentetelaperfil.ui.theme.BabyTrackerTheme
import com.example.componentetelaperfil.R

@Composable
fun SettingsCard() {
    Card(
        shape = MaterialTheme.shapes.large,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Column(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            SettingsItem(
                title = "Account",
                icon = R.drawable.ic_account,
                subtitle = "Manage your account"
            )
            HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outlineVariant)

            SettingsItem(
                title = "Notifications",
                icon = R.drawable.ic_notifications,
                subtitle = "Push notification settings"
            )

            HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outlineVariant)

            SettingsItem(
                title = "Privacy",
                icon = R.drawable.ic_privacy,
                subtitle = "Security and privacy options"
            )
            HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outlineVariant)

            SettingsItem(
                title = "Help",
                icon = R.drawable.ic_help,
                subtitle = "Get support and help"
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SettingsCardPreview() {
    BabyTrackerTheme() {
        SettingsCard()
    }
}