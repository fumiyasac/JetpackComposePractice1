/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CommonAppBar(
    title: String,
    navigateBack: () -> Unit,
    shouldRoot: Boolean = false
) {
    if (shouldRoot) {
        RootAppBar(
            title = title
        )
    } else {
        DestinationAppBar(
            title = title,
            navigateBack = navigateBack
        )
    }
}

@Preview("Root CommonAppBar Component")
@Composable
fun RootCommonAppBarPreview() {
    CommonAppBar(
        title = "ペット養子縁組App",
        navigateBack = {},
        shouldRoot = true
    )
}

@Preview("Destination CommonAppBar Component")
@Composable
fun DestinationCommonAppBarPreview() {
    CommonAppBar(
        title = "○○○ちゃんの自己紹介",
        navigateBack = {},
        shouldRoot = false
    )
}
