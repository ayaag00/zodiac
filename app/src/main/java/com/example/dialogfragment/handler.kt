package com.example.dialogfragment

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import androidx.core.content.contentValuesOf

const val DATABASE_NAME="userDB"
const val TABLE_NAME="user"
const val COL_NAME="name"
const val COL_DAY="day"
const val COL_MON="month"
class Handler(var context: Context):SQLiteOpenHelper(context, DATABASE_NAME,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable =
            "CREATE TABLE $TABLE_NAME($COL_NAME VARCHAR(100),$COL_DAY VARCHAR(100), $COL_MON VARCHAR(100))";
        db?.execSQL(createTable)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
    fun insertData(user:Database){
        val db = this.writableDatabase
        var cv= contentValuesOf()
        cv.put(COL_NAME,user.name)
        cv.put(COL_DAY,user.day)
        cv.put(COL_MON,user.month)
       var result= db.insert(TABLE_NAME,null,cv)


    }
    fun deleteData(){
        val db = this.writableDatabase
        db.delete(TABLE_NAME, null,null)

        db.close()
    }
    fun updateData(user:Database){
         val db=this.writableDatabase
        val query = "UPDATE $TABLE_NAME " +"set $COL_NAME='${user.name}'"+", $COL_DAY='${user.day}'"+", $COL_MON='${user.month}'"
//        db.rawQuery(query, null)
//        db.close();
         //val query= "Select * from$TABLE_NAME"
//         val result = db.rawQuery("Select * from $TABLE_NAME",null)

         //if(result.moveToFirst())

                 var cv= ContentValues()

                 cv.put(COL_NAME,user.name)
                 cv.put(COL_DAY, user.day)
                 cv.put(COL_MON, user.month)

                 //cv.put(COL_MON, user.month)
                 //cv.put(COL_NAME,user.name)
                 //cv.put(COL_DAY, user.day)
//                db.update(TABLE_NAME,cv, "month", arrayOf())//result.getString(result.getColumnIndex(COL_NAME),result.getString(result.getColumnIndex(COL_DAY)))

        db.update(TABLE_NAME, cv, null, null);

    }

}