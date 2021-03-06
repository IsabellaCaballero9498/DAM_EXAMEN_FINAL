package com.dam.examen_final;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MAPS_ACTIVITY extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_a_p_s__a_c_t_i_v_i_t_y);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    Double latitud;
    Double longitud;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //latitud = Double.parseDouble(findViewById(R.id.txtLatitud).toString());
        //longitud = Double.parseDouble(findViewById(R.id.txtLongitud).toString());
        //String latitud =  findViewById(R.id.txtMarcador).toString();
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-12.213973688079841, -76.93289762891045);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Holis"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}