package dev.jefferson.requestcreditsystem.exception

data class BusinessException(override val message: String?): RuntimeException(message) {
}