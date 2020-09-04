package com.demin.eventmanager.ui.fragments.ticket_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.demin.eventmanager.R
import com.demin.eventmanager.ui.fragments.tisket_list.TicketListViewModel

class TicketListFragment : Fragment() {

    companion object {
        fun newInstance() = TicketListFragment()
    }

    private lateinit var viewModel: TicketListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tisket_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TicketListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}