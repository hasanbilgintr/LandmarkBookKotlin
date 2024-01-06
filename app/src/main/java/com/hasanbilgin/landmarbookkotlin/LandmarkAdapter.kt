package com.hasanbilgin.landmarbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasanbilgin.landmarbookkotlin.databinding.RowBinding


class LandmarkAdapter(val landmarkList:ArrayList<Model>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder (val binding: RowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding=RowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)

    }


    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
      holder.binding.rowTextview.text=landmarkList.get(position).name


        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
//            intent.putExtra("model",landmarkList.get(position))
            MySingleton.chosenModel=landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return landmarkList.size
    }

}