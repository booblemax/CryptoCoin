package co.touchlab.kampkit.mock

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

class ClockMock(var currentInstant: Instant = Clock.System.now()): Clock {
    override fun now(): Instant = currentInstant
}