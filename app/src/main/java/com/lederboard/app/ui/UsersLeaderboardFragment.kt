package com.lederboard.app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lederboard.app.R
import com.lederboard.app.adapter.RecyclerViewItemDecoration
import com.lederboard.app.adapter.UserAdapter
import com.lederboard.app.databinding.FragmentUsersLeaderboardBinding
import com.lederboard.app.model.User

class UsersLeaderboardFragment : Fragment() {

    private var users: List<User>? = emptyList()

    private lateinit var binding: FragmentUsersLeaderboardBinding

    private var userAdapter: UserAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            users = it.getParcelableArrayList(ARG_PARAM_USERS)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsersLeaderboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sortedUsers = users?.sortedByDescending { it.score }
        val topUsers = sortedUsers?.take(TOP_USERS_COUNT)
        val otherUsers = sortedUsers?.drop(TOP_USERS_COUNT)
        initRecyclerView(otherUsers ?: emptyList())
        initLeaderboard(topUsers ?: emptyList())
    }

    private fun initLeaderboard(topUsers: List<User>) {
        val centerTopUser = topUsers[0]
        val leftTopUser = topUsers[1]
        val rightTopUser = topUsers[2]
        binding.topUsersLayout.apply {
            centerUser.apply {
                centerUserImage.setImageResource(centerTopUser.image)
                centerUserName.text = centerTopUser.name
                centerUserScore.text = centerTopUser.score.toString()
                centerUserUsername.text = centerTopUser.username
            }
            leftUser.apply {
                leftUserImage.setImageResource(leftTopUser.image)
                leftUserName.text = leftTopUser.name
                leftUserScore.text = leftTopUser.score.toString()
                leftUserUsername.text = leftTopUser.username
            }
            rightUser.apply {
                rightUserImage.setImageResource(rightTopUser.image)
                rightUserName.text = rightTopUser.name
                rightUserScore.text = rightTopUser.score.toString()
                rightUserUsername.text = rightTopUser.username
            }
        }
    }

    private fun initRecyclerView(users: List<User>) {
        userAdapter = UserAdapter()
        binding.recyclerView.adapter = userAdapter
        binding.recyclerView.addItemDecoration(
            RecyclerViewItemDecoration(
                requireContext().getColor(
                    R.color.zambezi
                )
            )
        )
        userAdapter?.submitList(users)
    }

    companion object {

        private const val TOP_USERS_COUNT = 3
        private const val ARG_PARAM_USERS = "users"

        fun newInstance(users: ArrayList<User>) =
            UsersLeaderboardFragment().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(ARG_PARAM_USERS, users)
                }
            }
    }
}