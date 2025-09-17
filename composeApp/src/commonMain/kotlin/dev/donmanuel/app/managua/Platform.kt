package dev.donmanuel.app.managua

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform