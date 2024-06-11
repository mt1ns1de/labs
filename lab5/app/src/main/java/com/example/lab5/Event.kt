package com.example.myapp

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.lab5.databinding.ActivityMainBinding
import android.graphics.Color
import android.widget.SeekBar

object Event {
    fun eventHandlers(binding: ActivityMainBinding, context: Context) {
        binding.submitButton.setOnClickListener {
            Toast.makeText(
                context,
                "Submit button pressed",
                Toast.LENGTH_SHORT
            ).show()
        }

        // Handle progress changes on the volumeSeekBar
        binding.volumeSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                binding.volumeStatus.text = "Volume: $progress%"
                binding.volumeStatus.setTextColor(Color.MAGENTA)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                binding.volumeStatus.text = "Adjusting volume..."
                binding.volumeStatus.setTextColor(Color.CYAN)
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                binding.volumeStatus.text = "Volume set"
                binding.volumeStatus.setTextColor(Color.BLUE)
            }
        })

        // Handle text changes on the userInput field
        binding.userInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, start: Int, count: Int, after: Int) {
                binding.inputFeedback.text = "Input is about to change"
                binding.inputFeedback.setTextColor(Color.GREEN)
                binding.inputFeedback.textSize = 15f
            }

            override fun onTextChanged(charSequence: CharSequence, start: Int, before: Int, count: Int) {
                binding.inputFeedback.text = "Current input: $charSequence"
                binding.inputFeedback.setTextColor(Color.DKGRAY)
                binding.inputFeedback.textSize = 10f
            }

            override fun afterTextChanged(editable: Editable) {
                binding.inputFeedback.text = "Input complete: ${editable.toString()}"
                binding.inputFeedback.setTextColor(Color.BLACK)
                binding.inputFeedback.textSize = 40f
            }
        })
    }
}