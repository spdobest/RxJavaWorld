package sptech.rxjavabysp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sptech.rxjavabysp.R
import sptech.rxjavabysp.network.models.Result
import sptech.rxjavabysp.ui.adapter.viewHolder.MovieViewHolder


/**
 * Created by Sibaprasad Mohanty on 25/05/20.
 * Spm Limited
 * sp.dobest@gmail.com
 */

class MovieAdapter(val listData: List<Result>) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.itemview_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.setData(listData[position])
    }

}