package io.kodingworks.recycleworker

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by DhytoDev on 2020-01-16.
 * Email : dhytodev@gmail.com
 */
class RecycleWorkerBuilder<T>(resLayout: Int, private val recyclerView: RecyclerView, viewBinding: ViewBinding<T>) {

    private var adapter: RecycleWorkerAdapter<T>

    fun setLayoutManager(layoutManager: RecyclerView.LayoutManager): RecycleWorkerBuilder<T> {
        recyclerView.layoutManager = layoutManager
        return this
    }

    fun submitList(list: List<T>?): RecycleWorkerBuilder<T> {
        adapter.addList(list)
        return this
    }

    init {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        adapter = RecycleWorkerAdapter(resLayout)
        adapter.setViewBinding(viewBinding)
    }

    fun create(): RecycleWorkerAdapter<T> {
        recyclerView.adapter = adapter
        return adapter
    }
}