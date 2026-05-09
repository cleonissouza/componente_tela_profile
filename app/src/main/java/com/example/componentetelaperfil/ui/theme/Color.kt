package com.example.componentetelaperfil.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val White = Color(0xFFFFFFFF)

val tintOrange = Color(0xFFFF6029)
val tintBlue   = Color(0xFF175CE1)
val tintGreen  = Color(0xFF028748)
val tintPurple = Color(0xFF9336DE)

val gradientOrange = linearGradient(listOf(Color(0xFFFEE6CF), Color(0xFFF6B18A)))
val gradientBlue = linearGradient(listOf(Color(0xFFCFE7FF), Color(0xFF7FB8FF)))
val gradientGreen = linearGradient(listOf(Color(0xFFCEF7DE), Color(0xFF79C18F)))
val gradientPurple = linearGradient(listOf(Color(0xFFF6DDFF), Color(0xFFB36BDD)))

val backgroundBrush = Brush.linearGradient(
    colors = listOf(
        Color(0xFFFFE3EA),
        Color(0xFFFFFFFF),
        Color(0xFFD9EEFF)
    )
)

val backgroundCard = Brush.linearGradient(
    colors = listOf(
        Color(0xFF927FCC),
        Color(0xFF66BED0)
    )
)

/*
Baby Tracker Colors
*/

// Cores Primárias e Secundárias
val PrimaryColor = Color(0xFF7C5ACE)        // Roxo/Lilás principal
val PrimaryLight = Color(0xFF9575CD)        // Roxo mais claro
val PrimaryDark = Color(0xFF5E35B1)         // Roxo mais escuro

val SecondaryColor = Color(0xFF4DB8A8)      // Turquesa
val SecondaryLight = Color(0xFF80CBC4)      // Turquesa clara
val SecondaryDark = Color(0xFF00897B)       // Turquesa escura

// Cores de Acentos (para diferentes atividades/hábitos)
val AccentGreen = Color(0xFF66BB6A)         // Verde (hábito completado)
val AccentOrange = Color(0xFFFF9800)        // Laranja (em progresso)
val AccentRed = Color(0xFFEF5350)           // Vermelho/Pink (não feito)
val AccentBlue = Color(0xFF42A5F5)          // Azul (informação)
val AccentYellow = Color(0xFFFFC107)        // Amarelo (aviso)

// Cores de Fundo
val BackgroundLight = Color(0xFFFAFAFA)     // Fundo principal - cinza muito claro
val BackgroundDark = Color(0xFF121212)      // Fundo escuro (dark mode)
val SurfaceColor = Color(0xFFFFFFFF)        // Superfícies (cards, dialogs)
val SurfaceDark = Color(0xFF1E1E1E)         // Superfícies em dark mode

// Cores de Texto
val TextPrimary = Color(0xFF2C2C2C)         // Texto principal - cinza escuro
val TextSecondary = Color(0xFF757575)       // Texto secundário - cinza médio
val TextTertiary = Color(0xFF9E9E9E)        // Texto terciário - cinza claro
val TextOnPrimary = Color(0xFFFFFFFF)       // Texto sobre cor primária
val TextHint = Color(0xFFBDBDBD)            // Hint/placeholder

// Cores de Estado
val SuccessColor = Color(0xFF4CAF50)        // Sucesso - verde
val ErrorColor = Color(0xFFB00020)          // Erro - vermelho
val WarningColor = Color(0xFFFFC107)        // Aviso - amarelo
val InfoColor = Color(0xFF2196F3)           // Informação - azul

// Cores de Divider/Border
val DividerColor = Color(0xFFE0E0E0)        // Divisor padrão
val DividerColorDark = Color(0xFF424242)    // Divisor em dark mode
val BorderColor = Color(0xFFBDBDBD)         // Borda de inputs

// Cores para Gráfico (Daily Feeding Quantity)
val ChartBar1 = Color(0xFFFF9800)           // Laranja (primeiro estilo)
val ChartBar2 = Color(0xFF42A5F5)           // Azul (segundo estilo)

// Cores Compostas - Temas Light e Dark
object LightColors {
    val primary = PrimaryColor
    val secondary = SecondaryColor
    val background = BackgroundLight
    val surface = SurfaceColor
    val error = ErrorColor
    val onPrimary = TextOnPrimary
    val onSecondary = TextOnPrimary
    val onBackground = TextPrimary
    val onSurface = TextPrimary
}

object DarkColors {
    val primary = PrimaryLight
    val secondary = SecondaryLight
    val background = BackgroundDark
    val surface = SurfaceDark
    val error = ErrorColor
    val onPrimary = TextOnPrimary
    val onSecondary = TextOnPrimary
    val onBackground = Color(0xFFE0E0E0)
    val onSurface = Color(0xFFE0E0E0)
}