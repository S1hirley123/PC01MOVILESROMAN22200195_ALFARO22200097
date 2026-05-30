

package com.example.pc01movilesroman22200195_alfaro22200097.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.unit.dp

@Composable
fun Pantalla1() {

    var peso by remember { mutableStateOf("") }
    var tipoVuelo by remember { mutableStateOf("Nacional") }
    var resultado by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "Calculadora de Equipaje",
            style = MaterialTheme.typography.headlineSmall
        )

        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Peso de la maleta (kg)") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Text("Tipo de vuelo")

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = tipoVuelo == "Nacional",
                onClick = { tipoVuelo = "Nacional" }
            )
            Text("Nacional")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = tipoVuelo == "Internacional",
                onClick = { tipoVuelo = "Internacional" }
            )
            Text("Internacional")
        }

        Button(
            onClick = {

                if (peso.isBlank()) {
                    resultado = "Ingrese el peso de la maleta."
                    return@Button
                }

                val pesoMaleta = peso.toDoubleOrNull()

                if (pesoMaleta == null) {
                    resultado = "Debe ingresar un valor numérico."
                    return@Button
                }

                if (pesoMaleta <= 0) {
                    resultado = "El peso debe ser mayor a cero."
                    return@Button
                }

                val limite =
                    if (tipoVuelo == "Nacional") 23.0
                    else 32.0

                if (pesoMaleta <= limite) {
                    resultado =
                        "Cumple el límite permitido.\nPeso permitido: $limite kg"
                } else {
                    val exceso = pesoMaleta - limite
                    resultado =
                        "Excede el límite permitido.\nKg excedidos: %.2f"
                            .format(exceso)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Calcular")
        }

        Text(
            text = resultado,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}