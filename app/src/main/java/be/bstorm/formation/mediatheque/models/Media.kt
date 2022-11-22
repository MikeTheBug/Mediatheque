package be.bstorm.formation.mediatheque.models

class Media(
    var type : String,
    var title : String,
    var description : String,
    var duree : Long,
    var id : Int?
) : java.io.Serializable