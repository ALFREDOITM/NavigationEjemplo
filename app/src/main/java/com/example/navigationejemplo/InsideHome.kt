package com.example.navigationejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationejemplo.databinding.FragmentHomeBinding
import com.example.navigationejemplo.databinding.FragmentInsideHomeBinding

class InsideHome : Fragment() {
    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentInsideHomeBinding.inflate(layoutInflater)
        val coma = ","
        val argumentoRecibido = arguments?.getString("argumentoPasado")
        val array1 = argumentoRecibido?.split(coma)?.toTypedArray()
        binding.textNombre.setText(array1!![0])
        binding.textApellidoP.setText(array1[1])
        binding.textApellidoM.setText(array1[2])
        binding.textUsuario.setText(array1[3])
        binding.textCorreo.setText(array1[4])
        return binding.root
    }
}