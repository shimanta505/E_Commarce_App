package com.example.e_commarce.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.trimmedLength
import androidx.navigation.fragment.findNavController
import com.example.e_commarce.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btLogin.setOnClickListener{
            val code = binding.etCodeNumber.text.toString()
            if (code.trimmedLength() == 0){
                Toast.makeText(context,"please enter code number ",Toast.LENGTH_SHORT).show()
            }else if(Integer.parseInt(code) == LOGIN_CODE){
                if (Integer.parseInt(code)== LOGIN_CODE){
                    val action = LoginFragmentDirections.actionLoginFragmentToSearchFragment()
                    findNavController().navigate(action)
                }
            }else{
                Toast.makeText(context,"Wrong code ",Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        private val LOGIN_CODE = 123456
    }
}