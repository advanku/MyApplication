package com.advan.myapplication

import android.accounts.AuthenticatorDescription
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.advan.myapplication.databinding.ActivityInputMakanBinding
import com.advan.myapplication.databinding.ActivityMainBinding

class InputMakanActivity : AppCompatActivity() {

    // Pendeklarasian varabel global
    /*
    lateinit var etName: EditText
    lateinit var etDescription: EditText
    lateinit var etPrice: EditText
    lateinit var etSum: EditText
    lateinit var btnSubmit: Button
    lateinit var tvResult: TextView
     */

    private lateinit var binding: ActivityInputMakanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputMakanBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // find id
        /*
        etName = findViewById(R.id.et_name);
        etPrice = findViewById(R.id.et_price)
        etDescription = findViewById(R.id.et_description)
        etSum = findViewById(R.id.et_sum)
        btnSubmit = findViewById(R.id.btn_submit)
        tvResult = findViewById(R.id.tv_result)
         */

        binding.apply {
            btnBefore.setOnClickListener {
//           finish()
                super.onBackPressed()
            }
            btnNext.setOnClickListener {
                val intent = Intent(this@InputMakanActivity, ListMenuActivity::class.java)
                startActivity(intent)
            }

            btnSubmit.setOnClickListener {
                val name = etName.text.toString()
                val price = etPrice.text.toString().toInt()
                val sum = etSum.text.toString().toInt()
                val description = etDescription.text.toString()
                val total = price * sum

                val result = "Nama: $name\n Deskripsi: $description\n Total: $total"
                tvResult.text = result
            }
        }


        // pemakaian binding
        /*
        binding.btnBefore.setOnClickListener {
           finish()
            super.onBackPressed()
        }

        binding.btnSubmit.setOnClickListener {
            val name = binding.etName.text.toString()
            val price = binding.etPrice.text.toString().toInt()
            val sum = binding.etSum.text.toString().toInt()
            val description = binding.etDescription.text.toString()
            val total = price * sum

            val result = "Nama: $name\n Deskripsi: $description\n Total: $total"
            binding.tvResult.text = result
        }
        */


        // Pemakaian memanggil cara awal
        /*
        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val price = etPrice.text.toString().toInt()
            val sum = etSum.text.toString().toInt()
            val desription = etDescription.text.toString()
            val total = price * sum

            Toast.makeText(applicationContext,,Toast.LENGTH_SHORT).show()
            val result = "Nama: $name\n Deskripsi: $desription\n Total: $total"
            tvResult.text = result
        }
         */

    }
}