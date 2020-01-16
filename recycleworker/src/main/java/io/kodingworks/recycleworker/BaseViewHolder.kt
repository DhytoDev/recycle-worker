package io.kodingworks.recycleworker

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by DhytoDev on 2020-01-16.
 * Email : dhytodev@gmail.com
 */
class BaseViewHolder<T>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {
    private lateinit var viewBinding: ViewBinding<T>

    fun setViewBinding(viewBinding: ViewBinding<T>) {
        this.viewBinding = viewBinding
    }

    fun bind(view: View, position: Int, item: T?) {
        viewBinding.bind(view, position, item)
    }
}

interface ViewBinding<T> {
    fun bind(view: View, position: Int, item: T?)
}