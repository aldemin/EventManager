package com.demin.eventmanager.ui.fragments.ticket_info

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demin.eventmanager.R

class TicketFagment : Fragment() {

    companion object {
        fun newInstance() = TicketFagment()
    }

    private lateinit var viewModel: TicketFagmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ticket_fagment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TicketFagmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}