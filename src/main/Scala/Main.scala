object Main {

 def main(args: Array[String]): Unit = {
 val list=List("1","2","|","12","13","14","|","2","|")
 val eio=ScalaUtils.seqFile(list)
 println(eio(0))





  //Prueba para el metodo que usa None y Some
   /*var som=ScalaUtils.PruebaOption(1)
    if(som==Some(i))
    som match {
        case Some(i)=>println(i)
        case None =>println("There´s no type for variable som")
    }
  */

  }}

