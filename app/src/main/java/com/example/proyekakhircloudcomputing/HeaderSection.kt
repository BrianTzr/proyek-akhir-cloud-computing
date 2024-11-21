package com.example.proyekakhircloudcomputing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//semua yang di dalam background kuning
@Composable
fun HeaderSection(showTexts: Boolean = true) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .wrapContentWidth()
                    .height(80.dp)
                    .clip(shape = RoundedCornerShape(16.dp))  // Membuat sudut membulat
                    .background(colorResource(R.color.yellow_background))
                    .padding(16.dp) // Tambahkan padding dalam Box
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(64.dp), // Jarak antar elemen
                ) {
                    // Gambar pertama
                    Image(
                        painter = painterResource(id = R.drawable.pp), // Gambar kiri
                        contentDescription = "Profile picture",
                        modifier = Modifier.size(40.dp) // Ukuran gambar kecil
                    )
                    // Gambar kedua (Memoria logo)
                    Image(
                        painter = painterResource(id = R.drawable.memoria), // Gambar tengah
                        contentDescription = "Memoria logo",
                        modifier = Modifier.size(100.dp) // Ukuran gambar utama
                    )

                    // Gambar ketiga (Notifikasi)
                    Image(
                        painter = painterResource(id = R.drawable.notifications), // Gambar kanan
                        contentDescription = "Notification icon",
                        modifier = Modifier.size(30.dp) // Ukuran gambar kecil
                    )
                }
            }
            //pada saat pemanggilan buat parameter showTexts = false, jika ingin
            if (showTexts) {
                Spacer(modifier = Modifier.height(32.dp))
                Text(
                    text = "Halo, Arkan!",
                    fontSize = 25.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Abadikan momen berharga mu!",
                    fontSize = 15.sp,
                    color = Color.White
                )
            }
        }
    }
}