package com.example.learnalphabets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }

    fun activity_display_message(view:View) {

        val intent = Intent(this, DisplayMessageActivity::class.java)
        startActivity(intent)

    }

    fun b_button(view:View) {
        val intent = Intent(this, b_button::class.java)
        startActivity(intent)

    }

    fun c_button(view:View) {
        val intent = Intent(this, c_button::class.java)
        startActivity(intent)
    }
    fun d_button(view:View) {
        val intent = Intent(this, d_button::class.java)
        startActivity(intent)
    }
    fun e_button(view:View) {
        val intent = Intent(this, e_button::class.java)
        startActivity(intent)
    }
    fun f_button(view:View) {
        val intent = Intent(this, f_button::class.java)
        startActivity(intent)
    }
    fun g_button(view:View) {
        val intent = Intent(this, g_button::class.java)
        startActivity(intent)
    }
    fun h_button(view:View) {
        val intent = Intent(this, h_button::class.java)
        startActivity(intent)
    }
    fun i_button(view:View) {
        val intent = Intent(this, i_button::class.java)
        startActivity(intent)
    }
    fun j_button() {
        val intent = Intent(this, j_button::class.java)
        startActivity(intent)
    }
    fun k_button(view:View) {
        val intent = Intent(this, k_button::class.java)
        startActivity(intent)
    }
    fun l_button(view:View) {
        val intent = Intent(this, l_button::class.java)
        startActivity(intent)
    }
    fun m_button(view:View) {
        val intent = Intent(this, m_button::class.java)
        startActivity(intent)
    }
    fun n_button(view:View) {
        val intent = Intent(this, n_button::class.java)
        startActivity(intent)
    }
    fun o_button(view:View) {
        val intent = Intent(this, o_button::class.java)
        startActivity(intent)
    }
    fun p_button(view:View) {
        val intent = Intent(this, p_button::class.java)
        startActivity(intent)
    }
    fun q_button(view:View) {
        val intent = Intent(this, q_button::class.java)
        startActivity(intent)
    }
    fun r_button(view:View) {
        val intent = Intent(this, r_button::class.java)
        startActivity(intent)
    }
    fun s_button(view:View) {
        val intent = Intent(this, s_button::class.java)
        startActivity(intent)
    }
    fun t_button(view:View) {
        val intent = Intent(this, t_button::class.java)
        startActivity(intent)
    }
    fun u_button(view:View) {
        val intent = Intent(this, u_button::class.java)
        startActivity(intent)
    }
    fun v_button(view:View) {
        val intent = Intent(this, v_button::class.java)
        startActivity(intent)
    }
    fun w_button(view:View) {
        val intent = Intent(this, w_button::class.java)
        startActivity(intent)
    }
    fun x_button(view:View) {
        val intent = Intent(this, x_button::class.java)
        startActivity(intent)
    }
    fun y_button(view:View) {
        val intent = Intent(this, y_button::class.java)
        startActivity(intent)
    }
    fun z_button(view:View) {
        val intent = Intent(this, z_button::class.java)
        startActivity(intent)
    }

}