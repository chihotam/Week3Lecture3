package execution

class BoomBox(var battery: Battery) {
  def use(): Unit = {
    if (battery.charge >= 3) {
      battery.charge -= 3
    }
  }
  def replaceBattery(one: Battery): Battery = {
    val temp = battery
    battery = one
    temp
  }
}
