package org.zukkey40.example.scalafx.bind

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.{TextField, Label}
import scalafx.geometry.Pos
import scalafx.scene.layout.{AnchorPane, VBox}

/**
 * Created with IntelliJ IDEA.
 * User: zuk_key
 * Date: 2014/05/31
 *
 *
 */
object Main extends JFXApp{
  val inputText: TextField = new TextField{
    prefWidth = 100
  }

  val outputText: Label = new Label{
    text <== inputText.text + " : it is from upper text"
  }

  val root: VBox = new VBox{
    spacing = 10.0
    alignment = Pos.CENTER
    children += (inputText, outputText)
  }

  val rootAnchor: AnchorPane = new AnchorPane{
    children += root
  }
  AnchorPane.setLeftAnchor(root, 10.0)
  AnchorPane.setRightAnchor(root, 10.0)
  AnchorPane.setTopAnchor(root, 20.0)
  AnchorPane.setBottomAnchor(root, 10.0)

  stage = new JFXApp.PrimaryStage {
    title = "Hello World"
    width = 300
    height = 150
    scene = new Scene(rootAnchor)
  }
}
