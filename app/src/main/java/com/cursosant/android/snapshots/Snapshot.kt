package com.cursosant.android.snapshots

import com.google.firebase.database.IgnoreExtraProperties

/****
 * Proyecto: Snapshots
 *
 * Daniel Fernandez Guarneros
 *
 * 4° A Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 *
 ***/
@IgnoreExtraProperties
data class Snapshot(var id: String = "",
                    var title: String = "",
                    var photoUrl: String ="",
                    var likeList: Map<String, Boolean> = mutableMapOf())
