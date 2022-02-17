package com.example.userlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.userlogin.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentLoginBinding
    private lateinit var viewModel: LoginViewModel
    private lateinit var homeFragment: HomeFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        homeFragment = HomeFragment()

        binding.loginBtn.setOnClickListener {
            viewModel.username = binding.userName.text.toString()

            val value = viewModel.checkuseranme()
            if (value) {
                Toast.makeText(activity, "email verofied", Toast.LENGTH_LONG).show()
                activity?.supportFragmentManager?.beginTransaction()?.apply {
                    replace(R.id.fragment_container,homeFragment)
                    commit()
                }

            } else {
                Toast.makeText(activity, "email not verofied", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root

    }
}

