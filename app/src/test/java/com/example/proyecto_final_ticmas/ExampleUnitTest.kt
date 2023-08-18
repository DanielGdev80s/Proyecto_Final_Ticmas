package com.example.proyecto_final_ticmas

import org.junit.Test
import org.junit.Assert.*
import com.example.proyecto_final_ticmas.ComparisonViewModel

class ComparisonViewModelTest {

    @Test
    fun testComparison() {
        val viewModel = ComparisonViewModel()
        val result = viewModel.compareValues("10", "5")
        assertEquals("10 es mayor que 5", result)
    }
}

