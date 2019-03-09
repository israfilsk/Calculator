package com.example.israfil.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buClick(view: View){

           if(isNewOp){
                takeNumber.setText("")
            }

            isNewOp = false

        val buSelected = view as Button
        var clickValue:String = takeNumber.text.toString()

        when(buSelected.id){

            bu0.id->{
                clickValue += "0"
            }

            bu1.id->{
                clickValue += "1"
            }
            bu2.id->{
                clickValue += "2"
            }
            bu3.id->{
                clickValue += "3"
            }
            bu4.id->{
                clickValue += "4"
            }
            bu5.id->{
                clickValue += "5"
            }
            bu6.id->{
                clickValue += "6"
            }
            bu7.id->{
                clickValue += "7"
            }
            bu8.id->{
                clickValue += "8"
            }
            bu9.id->{
                clickValue += "9"
            }
            buDot.id->{
                clickValue += "."
            }
            buPlusMinus.id->{
                clickValue = clickValue + "-"
            }

        }


        takeNumber.setText(clickValue)

    }

    var op = ""
    var oldNumber = ""
    var isNewOp = false

    fun buOpEvent(view:View){

        var buSelecte = view as Button


        when(buSelecte.id){

            buSum.id->{

                op = "+"

            }
            buSub.id->{
                op = "-"
            }
            buDiv.id->{
                op = "/"
            }
            buMul.id->{
                op = "*"
            }
            buMod.id->{
                op = "%"
            }

        }

        oldNumber = takeNumber.text.toString()

        takeNumber.setText(op)

        isNewOp=true

    }

    fun equalEvent(view:View){

        var newNumber = takeNumber.text.toString()

        var finalNumber:Double?=null

        when(op){

            "+"->{
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "-"->{
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "*"->{
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/"->{
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "%"->{
                finalNumber = oldNumber.toDouble() % newNumber.toDouble()
            }
        }

        takeNumber.setText(finalNumber.toString())
        isNewOp=false
    }

    fun clearEvent(view: View){

        takeNumber.setText("")
        isNewOp = true
    }
}




