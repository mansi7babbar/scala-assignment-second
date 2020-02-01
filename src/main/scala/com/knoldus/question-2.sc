def Calc(shape:String, firstDimension:Int, secondDimension:Int, area:(Int,Int)=>Int):String = {
  val areaResult = area(firstDimension,secondDimension)
  shape match {
    case "Rectangle" => s"Area of Rectangle is $areaResult"
    case "Rhombus" => s"Area of Rhombus is $areaResult"
    case "Parallelogram" => s"Area of Parallelogram is $areaResult"
    case _ => s"Not defined yet for $shape"
  }
}

Calc("Rectangle", 10, 20, (first,second) => first*second )
Calc("Rhombus", 15, 30, (first,second) => first*second )
Calc("Parallelogram", 5, 25, (first,second) => first*second )
Calc("Square", 4, 4, (first,second) => first*second )