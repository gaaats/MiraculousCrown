package com.kooapps.stackybir.ggthigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.kooapps.stackybir.R
import com.kooapps.stackybir.databinding.FragmentFraaau1Binding


class Fraaau1Fragment : Fragment() {


    private fun gjogtigtijgtjigt() {
        binding.dovn.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_fraaau1Fragment_to_fraauu22Fragment)
        }
    }

    private fun gtjogtjogtjiogtijo() {
        binding.center.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_fraaau1Fragment_to_fraauu22Fragment)
        }
    }

    private fun rffrfrrfhuirfhrf() {
        binding.top.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_fraaau1Fragment_to_fraauu22Fragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjogtjigtjiogtjiogtjoigt()


        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjogtjigtjiogtjiogtjoigt() {
        rffrfrrfhuirfhrf()

        gtjogtjogtjiogtijo()

        gjogtigtijgtjigt()
    }

    private fun gtjgtigtigtgtgt() {
        Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentFraaau1Binding =
            FragmentFraaau1Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentFraaau1Binding: FragmentFraaau1Binding? = null
    private val binding
        get() = fragmentFraaau1Binding
            ?: throw RuntimeException("FragmentFraaau1Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentFraaau1Binding = null
        super.onDestroy()
    }
}