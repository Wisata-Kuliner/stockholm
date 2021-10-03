package com.herokuapp.litehub.task

import android.app.ProgressDialog
import android.content.Context
import android.os.AsyncTask
import com.herokuapp.litehub.activity.MainActivity
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


class DownloadTask(context: Context, url: String) : AsyncTask<Void?, Void?, String>() {
    var mProgressDialog: ProgressDialog? = null
    var context: Context
    private val url: String
    override fun onPreExecute() {
        mProgressDialog = ProgressDialog.show(
            context, "",
            "Please wait, getting database..."
        )
    }

    protected override fun doInBackground(vararg p0: Void?): String? {
        try {
            Class.forName("com.mysql.jdbc.Driver")
            val con: Connection = DriverManager.getConnection(url, MainActivity().user,
                MainActivity().pass)
            val st = con.createStatement()
            val rs = st.executeQuery("select * from table")
            var list = ArrayList<String>()
            while (rs.next()) {
                val field = rs.getString("field")
                list.add(field)
            }
            MainActivity().objList = list
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
        return "Complete"
    }

    override fun onPostExecute(result: String) {
        if (result == "Complete") {
            mProgressDialog!!.dismiss()
        }
    }

    init {
        this.context = context
        this.url = url
    }
}