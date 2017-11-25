package com.strudelauxpommes.fitnesshabits.alcohol;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.strudelauxpommes.fitnesshabits.data.model.DrinkData;
import com.strudelauxpommes.fitnesshabits.data.repository.AlcoolRepository;

import java.util.List;

/**
 * Created by Program on 2017-11-25.
 */

public class AlcoholViewModel extends ViewModel {

    private AlcoolRepository repository;
    private LiveData<List<DrinkData>> liveData;

    public void init(AlcoolRepository repository){
        this.repository = repository;
        liveData = repository.loadDailyData();
    }

    public LiveData<List<DrinkData>> getLiveData() {
        return liveData;
    }
}
