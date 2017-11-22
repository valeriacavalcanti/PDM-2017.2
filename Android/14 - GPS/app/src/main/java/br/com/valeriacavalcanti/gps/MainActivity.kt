package br.com.valeriacavalcanti.gps

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var lvCoordenadas: ListView
    lateinit var gpsManager: LocationManager
    lateinit var gpsListener: LocationListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lvCoordenadas = findViewById(R.id.lvCoordenadas)

        this.gpsManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        this.gpsListener = GPSListener()
    }

    @SuppressLint("MissingPermission")
    override fun onResume() {
        super.onResume()

        this.gpsManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0f, this.gpsListener)
    }

    override fun onStop() {
        super.onStop()

        this.gpsManager.removeUpdates(this.gpsListener)
    }

    inner class GPSListener: LocationListener{

        override fun onLocationChanged(location: Location?) {
            Log.i("APP_GPS", "${location?.latitude} - ${location?.longitude}")
        }

        override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onProviderEnabled(provider: String?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onProviderDisabled(provider: String?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}
