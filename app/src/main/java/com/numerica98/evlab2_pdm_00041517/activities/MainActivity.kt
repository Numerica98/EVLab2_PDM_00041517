package com.numerica98.evlab2_pdm_00041517.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.numerica98.evlab2_pdm_00041517.R


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //*
    // class MainActivity : AppCompatActivity(), FragmentBasic.ListenerToolBox {
    //
    //    override fun onCreate(savedInstanceState: Bundle?) {
    //        super.onCreate(savedInstanceState)
    //        setContentView(R.layout.activity_main)
    //        val fragmentBasic=FragmentBasic.newInstance("Soy texto1", "soy texto2")
    //        supportFragmentManager
    //                .beginTransaction()
    //                .add(R.id.activity_content, fragmentBasic)
    //                .commit()
    //        //if(resources.configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){toast.maketext}
    //    }
    //
    //    override fun clickListenerHandler(view: TextView) {
    //        view.text="bbcitha bhrr"
    //}

    /**
    const val ARG_TEXT1 = "texto1"
    const val ARG_TEXT2 = "texto2"

    class FragmentBasic:Fragment() {

        var texto1:String?= null
        var texto2:String?= null
        var toolBox:ListenerToolBox?= null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.apply {
                getString(ARG_TEXT1,"")
                getString(ARG_TEXT2,"")
            }
        }

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            return inflater.inflate(R.layout.fragment_basic, container, false).apply {
                tv_texto1.text=texto1
                tv_texto2.text=texto2
                bt_boton.setOnClickListener{
                    toolBox?.clickListenerHandler(tv_texto1)
                }
            }
        }

        companion object {
            fun newInstance(texto1:String, texto2:String)= FragmentBasic().apply {
                arguments=Bundle().apply {
                    putString(ARG_TEXT1,texto1)
                    putString(ARG_TEXT2,texto2)
                }
            }
        }

        override fun onAttach(context: Context?) {
            super.onAttach(context)//Padre que me mando a llamar, el que me creo como fragmento. EN este caso es Main
            if (context is ListenerToolBox){ //pregunta si es del tipo a usar
                toolBox= context
            }else{
                throw Exception("Se necesita implementar la interfaz ToolBoxListener")
            }
        }

        override fun onDetach() {
            super.onDetach()
        }

        interface ListenerToolBox{//puede ser un archivo aparte
        fun clickListenerHandler(view: TextView)

        }
    }
    class FragmentImage:Fragment() {

    var toolBox:ListenerToolBox?= null

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    arguments?.apply {
    getString(ARG_TEXT1,"")
    getString(ARG_TEXT2,"")
    }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.image_activity, container, false).apply {
    iv_image.
    bt_boton.setOnClickListener{
    toolBox?.clickListenerHandler(tv_texto1)
    }
    }
    }

    companion object {
    fun newInstance(texto1:String, texto2:String)= FragmentBasic().apply {
    arguments=Bundle().apply {
    putString(ARG_TEXT1,texto1)
    putString(ARG_TEXT2,texto2)
    }
    }
    }

    override fun onAttach(context: Context?) {
    super.onAttach(context)//Padre que me mando a llamar, el que me creo como fragmento. EN este caso es Main
    if (context is ListenerToolBox){ //pregunta si es del tipo a usar
    toolBox= context
    }else{
    throw Exception("Se necesita implementar la interfaz ToolBoxListener")
    }
    }

    override fun onDetach() {
    super.onDetach()
    }

    interface ListenerToolBox{//puede ser un archivo aparte
    fun clickListenerHandler(view: TextView)

    }
    }
    // */
}
