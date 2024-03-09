package com.example.itfest.ui.settings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {

    private MutableLiveData<String> text;

    public SettingsViewModel() {
        text = new MutableLiveData<>();
        text.setValue("Default settings text");
    }

    public LiveData<String> getText() {
        return text;
    }

    // Method to update the text (called from the SettingsFragment)
    public void updateText(String newText) {
        text.setValue(newText);
    }

    // Add any other methods or LiveData as needed for your settings
}
