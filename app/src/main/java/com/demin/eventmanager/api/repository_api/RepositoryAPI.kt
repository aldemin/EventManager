package com.demin.eventmanager.api.repository_api

import com.demin.eventmanager.model.entity.Event
import com.demin.eventmanager.model.entity.Person
import com.demin.eventmanager.model.entity.Ticket
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

interface RepositoryAPI {
    fun getEventList(personId: String): Observable<List<Event>>
    fun getEvent(eventId: String): Observable<Event>
    fun getTicketList(eventId: String): Observable<List<Ticket>>
    fun getTicket(ticketId: String): Observable<Ticket>
    fun getPerson(personId: String): Observable<Person>
}