package com.example.audioservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.Build
import android.os.IBinder
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import android.widget.Toast
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
class AudioService : TileService() {


    override fun onBind(intent: Intent): IBinder {
        val binder = Binder()
        binder.pingBinder()
        binder.isBinderAlive
        return binder
    }

    override fun onStopListening() {
        super.onStopListening()
    }

    override fun onTileRemoved() {
        super.onTileRemoved()
    }

    override fun onStartListening() {
        super.onStartListening()
        Toast.makeText(this, "Service started", Toast.LENGTH_LONG).show()
        val qsTile = qsTile
        qsTile.state = Tile.STATE_ACTIVE
        qsTile.updateTile()
    }

    override fun onTileAdded() {
        super.onTileAdded()
        Toast.makeText(this, "Tile added", Toast.LENGTH_LONG).show()

    }

    override fun onClick() {
        super.onClick()
    }
}