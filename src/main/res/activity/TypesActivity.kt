package activity

import Adapter.TypeAdapter
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.R
import data.DataSource

class TypesActivity() : Activity() {
    companion object{
        const val KEY_NAME = "name"
        const val KEY_DESCRIPTION = "description"
        const val KEY_ICON_RES_ID = "iconResId"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type)
        val rvType = findViewById<RecyclerView>(R.id.rvTypes)
        rvType.layoutManager = LinearLayoutManager(this)
        rvType.adapter = TypeAdapter(DataSource.Types) { (model, description, iconResId) ->
            val intent = Intent(this, CarsActivity::class.java)
            intent.putExtra(KEY_NAME, model)
            intent.putExtra(KEY_DESCRIPTION, description)
            intent.putExtra(KEY_ICON_RES_ID, iconResId)
            startActivity(intent)
        }
    }
}