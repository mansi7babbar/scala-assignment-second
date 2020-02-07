def calculateArea(shape: String, firstDimension: Double, secondDimension: Double, area: (Double, Double) => Double): String = {
  val areaResult = area(firstDimension, secondDimension)
  shape match {
    case "Rectangle" => s"Area of Rectangle is $areaResult"
    case "Rhombus" => s"Area of Rhombus is $areaResult"
    case "Parallelogram" => s"Area of Parallelogram is $areaResult"
    case _ => s"Not defined yet for $shape"
  }
}

calculateArea("Rectangle", 10, 20, (firstDimension, secondDimension) => firstDimension * secondDimension)
calculateArea("Rhombus", 15, 30, (firstDimension, secondDimension) => firstDimension * secondDimension)
calculateArea("Parallelogram", 5, 25, (firstDimension, secondDimension) => firstDimension * secondDimension)
calculateArea("Square", 4, 4, (firstDimension, secondDimension) => firstDimension * secondDimension)