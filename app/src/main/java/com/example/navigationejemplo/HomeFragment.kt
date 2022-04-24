package com.example.navigationejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationejemplo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //action_homeFragment_to_insideHome
        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener{
            //Toast.makeText(context, "prueba", Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val nombre = binding.campoNombre.text.toString()
            val apellidoP = binding.campoAPaterno.text.toString()
            val apellidoM = binding.campoAMaterno.text.toString()
            val usuario = binding.campoUsuario.text.toString()
            val correo = binding.campoCorreo.text.toString()
            val array1 = arrayOf(nombre, apellidoP, apellidoM, usuario, correo)
            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(array1.joinToString())
            navController.navigate(directions)
        }

        return binding.root
    }
}