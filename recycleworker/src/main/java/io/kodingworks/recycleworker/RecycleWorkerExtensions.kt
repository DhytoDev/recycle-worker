package io.kodingworks.recycleworker

import androidx.recyclerview.widget.RecyclerView

/**
 * Created by DhytoDev on 2020-01-16.
 * Email : dhytodev@gmail.com
 */

fun <T> RecyclerView.setupAdapter(layout: Int, viewBinding: ViewBinding<T>): RecycleWorkerBuilder<T> {
    return RecycleWorkerBuilder(layout, this, viewBinding)
}