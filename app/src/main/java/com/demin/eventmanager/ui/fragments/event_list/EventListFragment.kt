package com.demin.eventmanager.ui.fragments.event_list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demin.eventmanager.R

class EventListFragment : Fragment() {

    companion object {
        fun newInstance() = EventListFragment()
    }

    private lateinit var viewModel: EventListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.event_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EventListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}