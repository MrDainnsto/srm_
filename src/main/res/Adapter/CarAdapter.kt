package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.R
import model.Car

typealias OnCarClickListener = (Car) -> Unit

class CarAdapter(
    private val cars : List<Car>,
    private val listener : OnCarClickListener,
) : RecyclerView.Adapter<CarAdapter.CarsVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CarsVH(
            layoutInflater.inflate(R.layout.item_car, parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: CarsVH, position: Int) =
        holder.bind(cars[position])

    override fun getItemCount(): Int = cars.size


    class CarsVH(
        view: View,
        listener: OnCarClickListener
    ) : RecyclerView.ViewHolder(view) {

        private val icon = view.findViewById<ImageView>(R.id.imageShop)
        private val nameProduct = view.findViewById<TextView>(R.id.nameShop)
        private val descProduct = view.findViewById<TextView>(R.id.itemAvailable)
        private lateinit var car: Car

        init {
            view.setOnClickListener { listener(car) }
        }

        fun bind(car: Car) {
            this.car = car
            nameProduct.text = car.model
            descProduct.text = car.description
            icon.setImageResource(car.im_modelID)
        }
    }
}