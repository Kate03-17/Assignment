package com.example.assignment


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProductAdapter(private val products: List<Pictures>):
RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {





    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p = products[position]

        Glide.with(holder.imageView.context).load(p.url).placeholder(R.drawable.ic_launcher_foreground).centerCrop().into(holder.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_list, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = products.size
}