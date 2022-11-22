package be.bstorm.formation.mediatheque.interfaces

import be.bstorm.formation.mediatheque.models.Media

interface MediaListener {
    fun onAdd(media : Media)
    fun onUpdate(media : Media)
    fun onDelete(media : Media)
}