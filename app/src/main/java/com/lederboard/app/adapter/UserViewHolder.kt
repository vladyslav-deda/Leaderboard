package com.lederboard.app.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lederboard.app.R
import com.lederboard.app.databinding.UserItemBinding
import com.lederboard.app.model.User

class UserViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {

    private val binding = UserItemBinding.bind(itemView)

    fun bind(user: User) {
        binding.apply {
            nameTextView.text = user.name
            usernameTextView.text = user.username
            scoreTextView.text = user.score.toString()
            Glide.with(itemView.context)
                .load(user.image)
                .circleCrop()
                .error(R.drawable.ic_launcher_foreground)
                .into(userImageView)
            val scoreStatusIcon =
                if (user.isScoreGrowing) R.drawable.arrow_up else R.drawable.arrow_down
            scoreStatusImageView.setImageResource(scoreStatusIcon)
        }
    }
}