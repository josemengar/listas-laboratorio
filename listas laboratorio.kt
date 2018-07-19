
fun main(args: Array<String>) {
    var star : String = "no"

    var type1: ArrayList<String> = ArrayList()




    println("Bien venido al Manager de Listas")
    println("--------------------------------------------------------------")
   while ((star != "yes")){

       println("c. Crear Lista de Tareas")
       println("m. Mostrar Listas")
       println("e. Seleccionar Lista")
       println("s. salir")
       println("Escoja una opcion: ")
       val List: String? = readLine()


       if ((List == "c")){
           println("Escriba el Nombre de la lista: ")
           println("--------------------------------------------------------------")
           var type1: String? = readLine()
           arrayListOf<String?>(type1)




       }
       if ((List == "m")){
           println("Estas las listas que tiene")
           println("--------------------------------------------------------------")
            println(arrayListOf(type1))

       }
       if ((List == "e")){
           println("escoja La lista que quiera")
           println(arrayListOf(type1))
           var task: String = ""
           if (task in type1){
               println("c. Crear Lista de Tareas")
               println("m. Mostrar Listas")
               println("e. Seleccionar Lista")
               println("s. salir")


           }

       }
       if ((List == "s")){
           println("gracias por usarme")
           println("--------------------------------------------------------------")
           var star: String = "yes"
       }


   }
}