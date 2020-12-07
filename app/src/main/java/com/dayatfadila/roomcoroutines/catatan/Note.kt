package com.dayatfadila.roomcoroutines.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
  var title: String?,
  var description: String?,
  var priority: Int,
  var contact_person: String?
){
  @PrimaryKey(autoGenerate = true)
  var id: Int = 0
}
