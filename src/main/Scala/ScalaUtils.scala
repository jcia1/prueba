object ScalaUtils {
  /*Como vemos las formas de declarar una funcion:
  * Forma para unafuncion simple
  * def FUNCION1 (NombreParametro:TipoParametro): TipoSalida=........... FUNCION EN UNA SOLA LIONEA.........
  *
  * HAY QUE TENER EN CUENTA QUE NO ES NECESARIO PERO SI ES A VECES RECOMENDABLE INDICAR EL TIPO DE SALIDA
  * def FUNCION2 (Param:TipoPar)= ........... FUNCION EN UNA SOLA LIONEA.........
  *
  * Si la funcion va a ser mas grande si que es recomendable poner entre corchetes el contenido de esta para poder organizarlo mejor
  *
  * def FUNCION3(Param:TipoPar):Unit={
  * LO QUE SEA
  *  } */


  def IfTit (x: Int): Unit = {println(if(x==0) "El numero es 0")}
  def add(a: Int, b: Int): Int = a + b
    //Como vemos cualquier funcion puede ser definida con una sola linea

  def PruebaMatch(str:String)= str match {case "Enero"=>println("El mes obtenido es enero")}


  def PruebaOption(Entero:Int): Option[Int]={
    if(Entero==0 || Entero==10) {
      println("El numero es 0 o 10, no devolveremos nada")
      None}

    else{
      println("El numero es valido")
      Some(Entero)
    }}


  def pruebo(x:List[Int]): Unit={
      x.filter(x=> x>=10).map(x=>
      println(if(x>=12) s"La prueba funciona$x " else s"La prueba funciona tb $x") )
    }
  def seqFile(x:List[String]):Array[String]={
    var i=0
    var emp =  Array.ofDim[String](10)
    var str: String= ""
    x.map(x=>
    if(x!="|") {
      str=str.concat(x)
      println("Caracter: "+x+" CADENA: "+str)
    }
    else {
      emp(i)=str
      str=""
      i=i+1
    })
  emp
  }












}
