package com.demin.eventmanager.api.repository_api.firestore_repository

import com.demin.eventmanager.api.repository_api.RepositoryAPI
import com.demin.eventmanager.model.entity.Event
import com.demin.eventmanager.model.entity.Person
import com.demin.eventmanager.model.entity.Ticket
import com.google.firebase.firestore.Source
import io.reactivex.rxjava3.core.Observable

class Firestore(
    private val eventFirestoreReposotiry: EventFirestoreReposotiry,
    private val personFirestoreRepository: PersonFirestoreRepository,
    private val ticketFirestoreRepository: TicketFirestoreRepository
) : RepositoryAPI {

    override fun getEventList(personId: String) =
        eventFirestoreReposotiry.getEventList(personId)
            .map {
                val sourse: Source = So
                ticketFirestoreRepository.firestore.
            }

    override fun getEvent(eventId: String): Observable<Event> {
        TODO("Not yet implemented")
    }

    override fun getTicketList(eventId: String): Observable<List<Ticket>> {
        TODO("Not yet implemented")
    }

    override fun getTicket(ticketId: String): Observable<Ticket> {
        TODO("Not yet implemented")
    }

    override fun getPerson(personId: String): Observable<Person> {
        TODO("Not yet implemented")
    }
}