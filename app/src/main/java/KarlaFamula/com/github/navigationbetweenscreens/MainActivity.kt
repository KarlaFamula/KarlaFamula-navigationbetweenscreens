package KarlaFamula.com.github.navigationbetweenscreens

import KarlaFamula.com.github.navigationbetweenscreens.screens.LoginScreen
import KarlaFamula.com.github.navigationbetweenscreens.screens.MenuScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import KarlaFamula.com.github.navigationbetweenscreens.ui.theme.NavigationbetweenscreensTheme
import PedidosScreen
import PerfilScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            NavigationbetweenscreensTheme {

                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        composable(route = "login") {
                            LoginScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable(route = "menu") {
                            MenuScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable(route = "pedidos") {
                            PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable(route = "perfil") {
                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}