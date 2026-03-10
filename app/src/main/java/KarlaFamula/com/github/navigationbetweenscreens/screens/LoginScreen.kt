package KarlaFamula.com.github.navigationbetweenscreens.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFED145B))
            .padding(32.dp)
    ) {

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "LOGIN",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { navController.navigate("menu") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(
                    text = "ENTRAR",
                    fontSize = 20.sp,
                    color = Color.Blue
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { navController.navigate("menu") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text(
                    text = "Voltar",
                    fontSize = 20.sp,
                    color = Color.Blue
                )
            }
        }
    }
}