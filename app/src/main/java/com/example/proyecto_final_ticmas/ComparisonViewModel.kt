package com.example.proyecto_final_ticmas

import androidx.lifecycle.ViewModel

class ComparisonViewModel : ViewModel() {
    fun compareValues(value1: String, value2: String): String {
        return if (value1 == value2) {
            "Ambas cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}
