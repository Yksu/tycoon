package tycoon.objects.vehicle

import scala.collection.mutable.ListBuffer

import tycoon.game.Game
import tycoon.objects.railway._
import tycoon.objects.structure._
import scalafx.beans.property._
import tycoon.ui.Tile
import tycoon.game.{Game, GridLocation, Player}
import tycoon.ui.DraggableTiledPane


class Plane(_id: Int, airport: Structure, val owner: Player) extends Vehicle(_id, airport, owner) {

  var onTheRoad = BooleanProperty(false)
  tile = Tile.plane
  speed.set(400.0)
  var weight = 50
  val cost = 500
  gridPos = location.gridPos.clone()

  def update(dt: Double, dirIndicator: Int) = {

  }
}
