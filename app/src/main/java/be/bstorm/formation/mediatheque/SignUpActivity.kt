package be.bstorm.formation.mediatheque

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {

    private lateinit var btnGoToSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnGoToSignUp = findViewById(R.id.btn_validate_account)

        btnGoToSignUp.setOnClickListener {
            val intent = Intent(this, MediaListActivity::class.java)
            startActivity(intent)
        }
    }
}