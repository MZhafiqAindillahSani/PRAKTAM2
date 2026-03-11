package com.example.praktam2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.praktam2.model.Hobi
import com.example.praktam2.model.MatchHobiSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MatchHobiApp()
        }
    }
}

@Composable
fun MatchHobiApp() {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(MatchHobiSource.dummyHobi) { hobi ->
            CardHobi(hobi)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
fun CardHobi(hobi: Hobi) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = hobi.imageRes),
                contentDescription = hobi.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = hobi.nama,
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = hobi.deskripsi,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = "Jumlah Minat: ${hobi.jumlahMinat}",
                style = MaterialTheme.typography.bodySmall
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Gabung Komunitas")
            }
        }
    }
}