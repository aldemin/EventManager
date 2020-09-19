package com.demin.eventmanager.api.repository_api.firestore_repository

import com.demin.eventmanager.model.entity.Event
import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import java.util.*

class EventFirestoreReposotiry(private val firestore: FirebaseFirestore) {

    class FirestoreEvent(
        val id: String,
        val organizerPersonId: String,
        val createDate: Date,
        var title: String,
        var description: String,
        var address: String,
        val extensionListId: Array<String>? = null,
    ){

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is FirestoreEvent) return false

            if (id != other.id) return false

            return true
        }

        override fun hashCode(): Int {
            return id.hashCode()
        }
    }

    private val snapshotMap: (DocumentSnapshot) -> (FirestoreEvent) = { snapshot ->
        val event = FirestoreEvent(
            id = snapshot.id,
            organizerPersonId = snapshot["organizer_person_id"] as String,
            createDate = (snapshot["create_date"] as Timestamp).toDate(),
            title = snapshot["title"] as String,
            description = snapshot["description"] as String,
            address = snapshot["address"] as String,
            extensionListId = snapshot["extensions_id"] as Array<String>
        )
        event
    }

    fun getEventList(personId: String) = Observable.create<List<FirestoreEvent>> { emitter ->
        firestore.collection("events")
            .whereEqualTo("issue_person_id", personId)
            .addSnapshotListener { querySnapshot, firebaseFirestoreException ->
                firebaseFirestoreException?.let {
                    emitter.onError(it.fillInStackTrace())
                }
                querySnapshot?.let {
                    emitter.onNext(querySnapshot.documents.map(snapshotMap))
                }
            }
    }


    fun getEvent(eventId: String): Single<FirestoreEvent> {
        TODO("Not yet implemented")
    }
}