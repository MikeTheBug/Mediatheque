package be.bstorm.formation.mediatheque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var btnGoToLogIn : Button
    private lateinit var btnGoToSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToLogIn = findViewById(R.id.btn_logIn_logIn)
        btnGoToSignUp = findViewById(R.id.btn_signUp_signUp)
        btnGoToLogIn.setOnClickListener(this)
        btnGoToSignUp.setOnClickListener(this)
    }

    override fun onClick(btn: View?) {
        when (btn?.id) {
            R.id.btn_logIn_logIn -> {
                val intent = Intent(this, MediaListActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_signUp_signUp -> {
                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }
}