package com.saehyun.composeplayground

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import kotlinx.coroutines.flow.StateFlow
import java.util.concurrent.Flow

@Immutable
data class ImmutableWrapper<T>(val value: T)

@Stable
data class StableWrapper<T>(val value: T)

@Stable
data class StableStateFlow<T>(val value: StateFlow<T>)