package io.kodingworks.recycleworker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by DhytoDev on 2020-01-16.
 * Email : dhytodev@gmail.com
 */
class RecycleWorkerAdapter<T>(private val layoutRes: Int) :
    RecyclerView.Adapter<BaseViewHolder<T>>() {

    private var item: T? = null
    private val list: MutableList<T> = mutableListOf()
    private lateinit var viewBinding: ViewBinding<T>

    fun setViewBinding(viewBinding: ViewBinding<T>) {
        this.viewBinding = viewBinding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        val view = LayoutInflater.from(parent.context).inflate(layoutRes, parent, false)
        return BaseViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        item = list[position]

        holder.setViewBinding(viewBinding)
        holder.bind(holder.itemView, position, item)
    }

    internal fun addList(list: List<T>?) {
        list?.let { this.list.addAll(it) }
        notifyDataSetChanged()
    }
}