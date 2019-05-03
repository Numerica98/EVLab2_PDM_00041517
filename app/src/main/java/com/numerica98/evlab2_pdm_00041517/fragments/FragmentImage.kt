package com.numerica98.evlab2_pdm_00041517.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.numerica98.evlab2_pdm_00041517.R


class FragmentImage: Fragment() {

    var toolBox:listenerToolBox?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.image_activity, container, false)
    }

    interface listenerToolBox{
        fun clickListener(view: ImageView)
    }
}