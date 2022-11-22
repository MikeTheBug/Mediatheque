package be.bstorm.formation.mediatheque

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import be.bstorm.formation.mediatheque.adapters.MediaAdapter
import be.bstorm.formation.mediatheque.models.Media

class MediaListActivity : AppCompatActivity() {

    companion object {
        val TAG = MediaListActivity::class.java.simpleName
    }

    private lateinit var rvMedia : RecyclerView

    private lateinit var adapter : MediaAdapter

    private val mediaList : MutableList<Media> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_list)
    }
}