package com.github.insanusmokrassar.AutoPostBotConfigBuilder

import com.github.insanusmokrassar.AutoPostBotConfigBuilder.controllers.GlobalConfigController
import com.github.insanusmokrassar.AutoPostBotConfigBuilder.utils.loadFXML
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class ConfigBuilderApplication : Application() {
    override fun start(stage: Stage) {
        val loader = loadFXML("ConfigBuilder.fxml")
        val parent = loader.load() as? Parent
        val controller = loader.getController() as? GlobalConfigController
        controller?.stage = stage;
        stage.scene = Scene(parent)
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(ConfigBuilderApplication::class.java)
        }
    }
}