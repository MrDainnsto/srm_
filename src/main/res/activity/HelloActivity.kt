package activity

import android.app.Activity
import android.os.Bundle
import com.example.crm.R

class HelloActivity() : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello)
    }
}
    