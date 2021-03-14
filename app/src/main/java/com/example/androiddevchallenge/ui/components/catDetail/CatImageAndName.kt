package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.example.androiddevchallenge.factory.CatFactory
import com.example.androiddevchallenge.entity.CatEntity
import com.example.androiddevchallenge.ui.theme.amber500

@Composable
fun CatImageAndName(
    catEntity: CatEntity,
    onClickContact: () -> Unit
) {
    Box (
        contentAlignment = Alignment.BottomStart,
    ) {
        CatImageBox(
            imageAsset = catEntity.imageAsset,
            contentDescription = catEntity.name,
        )
        CatNameBox(
            name = catEntity.name,
            onClickContact = onClickContact,
        )
    }
}

@Composable
private fun CatImageBox(
    imageAsset: Int,
    contentDescription: String
) {
    Surface (
        modifier = Modifier
            .aspectRatio(3F / 2F),
    ) {
        Image(
            painter = painterResource(imageAsset),
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
        )
        Box(
            modifier = Modifier
                .background(Color.Black.copy(alpha = 0.24f)),
        )
    }
}

@Composable
private fun CatNameBox(
    name: String,
    onClickContact: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = name,
                style = TextStyle(
                    fontWeight = MaterialTheme.typography.h4.fontWeight,
                    fontSize = MaterialTheme.typography.h4.fontSize
                ),
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            IconButton(
                modifier = Modifier
                    .size(50.dp)
                    .background(amber500, shape = RoundedCornerShape(25.dp)),
                onClick = onClickContact,
            ) {
                Icon(
                    imageVector = Icons.Filled.Mail,
                    contentDescription = "Contact",
                    tint = Color.White
                )
            }
        }
    }
}

@Preview("CatImageAndName Component")
@Composable
fun CatImageAndNamePreview() {
    CatImageAndName(
        catEntity = CatFactory.getCatById(id = 14),
        onClickContact = {}
    )
}
