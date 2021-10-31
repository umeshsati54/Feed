package com.usati.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.usati.feed.databinding.FeedItemBinding

class FeedAdapter(feedList: ArrayList<Feed>) : RecyclerView.Adapter<FeedAdapter.FeedViewHolder>() {
    private var feeds: ArrayList<Feed> = feedList

    inner class FeedViewHolder(var binding: FeedItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val binding = FeedItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return FeedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val feed = feeds[position]
        holder.binding.ivProfile.setImageResource(R.drawable.profile)
        holder.binding.tvName.text = feed.name
        holder.binding.textView2.text = feed.seen.toString()
        holder.binding.tvCaption.text = feed.caption
        holder.binding.ivPost.setImageResource(R.drawable.post_img)
    }

    override fun getItemCount(): Int {
        return feeds.size
    }
}