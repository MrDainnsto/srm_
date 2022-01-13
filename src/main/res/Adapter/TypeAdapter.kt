package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.R
import model.Type

typealias OnTypeClickListener = (Type) -> Unit

class TypeAdapter (
    private val types : List<Type>,
    private val listener : OnTypeClickListener,
) : RecyclerView.Adapter<TypeAdapter.TypesVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TypesVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TypesVH(
            layoutInflater.inflate(R.layout.item_type, parent, false),
            listener
        )
    }

    override fun onBindViewHolder(holder: TypesVH, position: Int) =
        holder.bind(types[position])

    override fun getItemCount(): Int = types.size


    class TypesVH(
        view: View,
        listener: OnTypeClickListener
    ) : RecyclerView.ViewHolder(view) {

        private val icon = view.findViewById<ImageView>(R.id.imageShop)
        private val nameProduct = view.findViewById<TextView>(R.id.nameShop)
        private val descProduct = view.findViewById<TextView>(R.id.available)
        private lateinit var type: Type

        init {
            view.setOnClickListener { listener(type) }
        }

        fun bind(type: Type) {
            this.type = type
            nameProduct.text = type.name
            descProduct.text = type.description
            icon.setImageResource(type.pic)
        }
    }
}
