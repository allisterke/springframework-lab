package com.ally.web.controller;

import com.ally.web.mapper.MaterialSettingsMapper;
import com.ally.web.model.MaterialSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialSettingsController {

    @Autowired
    MaterialSettingsMapper settingsMapper;

    @GetMapping("/settings")
    public List<MaterialSettings> getSettings() {
        return settingsMapper.getSettings();
    }

    @GetMapping("/update-settings")
    public String updateSetting(
                                @RequestParam("materialId") int materialId,
                                @RequestParam("warn") double warnAmount,
                                @RequestParam("fill") double fillAmount) {

        MaterialSettings settings = new MaterialSettings();
        settings.setMaterialId(materialId);
        settings.setWarn(warnAmount);
        settings.setFill(fillAmount);

        settingsMapper.updateSettings(settings);

        return "ok";
    }
}
