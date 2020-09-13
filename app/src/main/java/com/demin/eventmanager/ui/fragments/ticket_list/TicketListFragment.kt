package com.demin.eventmanager.ui.fragments.ticket_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.demin.eventmanager.R
import com.demin.eventmanager.ui.MainActivity
import com.demin.eventmanager.ui.fragments.tisket_list.TicketListViewModel
import kotlinx.android.synthetic.main.tisket_list_fragment.*

class TicketListFragment : Fragment() {

    private lateinit var toolbar: Toolbar

    private val viewModel by viewModels<TicketListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tisket_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        initDrawer()
    }

    private fun initToolbar() {
        view?.let { view ->
            toolbar = view.findViewById(R.id.fr_ticket_list_toolbar)
            activity?.let { activity ->
                if (activity is MainActivity) {
                    activity.apply {
                        setSupportActionBar(toolbar)
                        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
                        supportActionBar!!.setHomeButtonEnabled(true)
                    }
                }
            }
        }
    }

    private fun initDrawer() {
        val drawerToggle = ActionBarDrawerToggle(activity, fr_ticket_list_drawer_layout, toolbar, R.string.app_name, R.string.about_us)
        fr_ticket_list_drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }

}