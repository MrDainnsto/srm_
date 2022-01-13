package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.R
import model.Light

typealias OnLightClickListener = (Light) -> Unit

class LightAdapter (
    private val lights : List<Light>,
    private val listener : OnLightClickListener,
) : RecyclerView.Adapter<LightAdapter.LightsVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LightsVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LightsVH(
            layoutInflater.inflate(R.layout.item_lights, parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: LightsVH, position: Int) =
        holder.bind(lights[position])

    override fun getItemCount(): Int = lights.size


    class LightsVH(
        view: View,
        listener: OnLightClickListener
    ) : RecyclerView.ViewHolder(view) {

        private val icon = view.findViewById<ImageView>(R.id.imageShop)
        private val nameProduct = view.findViewById<TextView>(R.id.nameShop)
        private val typeProduct = view.findViewById<TextView>(R.id.itemAvailable)
        private val priceProduct = view.findViewById<TextView>(R.id.itemDelivery)
        private val car_nameProduct = view.findViewById<TextView>(R.id.itemAvailable2)
        private lateinit var light: Light

        init {
            view.setOnClickListener { listener(light) }
        }

        fun bind(light: Light) {
            this.light = light
            nameProduct.text = light.name
            typeProduct.text = light.type
            car_nameProduct.text = light.car_name
            priceProduct.text = light.price.toString()
            icon.setImageResource(light.im_modelID)
        }
    }
}