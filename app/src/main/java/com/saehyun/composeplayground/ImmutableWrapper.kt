package com.saehyun.composeplayground

import androidx.compose.runtime.Immutable

@Immutable
data class ImmutableWrapper<T>(val value: T)
