package io.kodingworks.recycleworker.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.kodingworks.recycleworker.ViewBinding
import io.kodingworks.recycleworker.setupAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_rv_item.view.*

class MainActivity : AppCompatActivity(), ViewBinding<Item> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val items = listOf(Item("Abubakar", "Pallangga"), Item("Dhyto", "Jental"))

        recyclerView.setupAdapter(R.layout.layout_rv_item, this)
            .setLayoutManager(LinearLayoutManager(this))
            .submitList(items)
            .create()
    }

    override fun bind(view: View, position: Int, item: Item?) {
        item?.apply {
            view.name.text = name
            view.address.text = address
        }
    }


}

data class Item(val name: String, val address: String)
