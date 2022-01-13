package activity

import Adapter.LightAdapter
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.R
import data.DataSource

class LightsActivity() : Activity() {
    companion object{
        const val KEY_NAME = "name"
        const val KEY_NAME_CAR = "name_car"
        const val KEY_TYPE = "type"
        const val KEY_ICON_RES_ID = "iconResId"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lights)
        val rvLight = findViewById<RecyclerView>(R.id.rvLights)
        rvLight.layoutManager = LinearLayoutManager(this)
        rvLight.adapter = LightAdapter(DataSource.Lights) { (model, description, iconResId) ->
            val intent = Intent(this, CarsActivity::class.java)
            intent.putExtra(KEY_NAME_CAR, model)
            intent.putExtra(KEY_NAME, model)
            intent.putExtra(KEY_TYPE, description)
            intent.putExtra(KEY_ICON_RES_ID, iconResId)
            startActivity(intent)
        }
    }
}