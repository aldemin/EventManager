package com.demin.eventmanager.api.repository_api.firestore_repository

import com.demin.eventmanager.model.entity.Ticket
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

class TicketFirestoreRepository: TicketRepositoryAPI {

    val firestore = FirebaseFirestore.getInstance()

    override fun getTicketList(personId: String): Observable<List<Ticket>> {
        TODO("Not yet implemented")
    }

    override fun getTicket(ticketId: String): Single<Ticket> {
        TODO("Not yet implemented")
    }
}