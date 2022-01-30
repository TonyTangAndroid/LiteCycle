package com.sample;

import androidx.lifecycle.LifecycleOwner;
import android.location.Location;

/**
 * Created by Ahmed Adel Ismail on 2/4/2018.
 */

public interface MainView extends LifecycleOwner{

    void updateLocationOnMap(Location location);

}
