package com.example.gallery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso

class RecyclerAdapter(private val context: Context):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.ImageView, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerAdapter.ViewHolder, position: Int) {

        Picasso.get()
            .load("https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/Independence-Lake-Clean-Drinking-Water_4000x2200.jpg?crop=1175,0,1650,2200&wid=600&hei=800&scl=2.75")
            .transform( RoundedTransformation(30, 0))
            .placeholder(context.resources.getDrawable(R.drawable.ic_launcher_foreground))//it will show placeholder image when url is not valid.
            .networkPolicy(NetworkPolicy.OFFLINE) //for caching the image url in case phone is offline
            .into(viewHolder.img_android)
    }

    override fun getItemCount(): Int {
        return 12
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var img_android: ImageView

        init {
            img_android =
                view.findViewById<View>(R.id.iv_picasso) as ImageView
        }
    }
}